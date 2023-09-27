package spring.mircoservices.moviecatalogservice.Builder.Interface;

import spring.mircoservices.moviecatalogservice.Entity.MoviesInfo;
import spring.mircoservices.moviecatalogservice.Entity.UserMoviesRatings;

public interface MoviesInfoBuilder {
  public MoviesInfo buildMoviesInfo(UserMoviesRatings usermoviesRatings);
}
