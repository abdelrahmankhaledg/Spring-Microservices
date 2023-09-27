package spring.mircoservices.moviecatalogservice.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.mircoservices.moviecatalogservice.Builder.Interface.CatalogItemBuilder;
import spring.mircoservices.moviecatalogservice.Builder.Interface.MoviesInfoBuilder;
import spring.mircoservices.moviecatalogservice.Entity.CatalogItems;
import spring.mircoservices.moviecatalogservice.Entity.MoviesInfo;
import spring.mircoservices.moviecatalogservice.Entity.UserMoviesRatings;

@Service
public class CatalogService {
  
  @Autowired
  private UserRatingsService userRatingService;

  @Autowired
  private MoviesInfoBuilder movieInfoBuilder;

  @Autowired
  private CatalogItemBuilder catalogItemBuilder;

  public CatalogItems getCatalogItems(String userId) {
    UserMoviesRatings userMoviesRatings = userRatingService.getUserMoviesRatings(userId);
    MoviesInfo moviesInfo = movieInfoBuilder.buildMoviesInfo(userMoviesRatings);
    return buildCatalogItems(moviesInfo, userMoviesRatings);
  }

  private CatalogItems buildCatalogItems(MoviesInfo moviesInfo, UserMoviesRatings userMovieRatings){
    CatalogItems catalogItems = new CatalogItems();
    
    for(int i = 0; i<moviesInfo.getMoviesInfo().size(); i++){
      String movieName = moviesInfo.getMoviesInfo().get(i).getMovieName();
      String movieDescription = moviesInfo.getMoviesInfo().get(i).getMovieDescription();
      int movieRating = userMovieRatings.getMoviesRatings().get(i).getRating();
      catalogItems.getCatalogItems().add(catalogItemBuilder.buildCatalogItem(movieName, movieDescription, movieRating));
    }

    return catalogItems;
  }


}
