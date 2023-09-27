package spring.mircoservices.moviecatalogservice.Builder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import spring.mircoservices.moviecatalogservice.Builder.Interface.MoviesInfoBuilder;
import spring.mircoservices.moviecatalogservice.Entity.MovieRating;
import spring.mircoservices.moviecatalogservice.Entity.MoviesInfo;
import spring.mircoservices.moviecatalogservice.Entity.UserMoviesRatings;
import spring.mircoservices.moviecatalogservice.Service.MoviesInfoService;

@Component
public class MoviesInfoBuilderImpl implements MoviesInfoBuilder{

  @Autowired
  private MoviesInfoService movieInfoService;


  public MoviesInfo buildMoviesInfo(UserMoviesRatings usermoviesRatings){
    MoviesInfo moviesInfo = new MoviesInfo();
    for(MovieRating movieRating : usermoviesRatings.getMoviesRatings()){
      moviesInfo.getMoviesInfo().add(movieInfoService.getMovieInfo(movieRating.getMovieId()));
    }
    return moviesInfo;
  }

}
