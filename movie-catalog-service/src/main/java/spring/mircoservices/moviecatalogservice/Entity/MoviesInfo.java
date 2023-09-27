package spring.mircoservices.moviecatalogservice.Entity;

import java.util.ArrayList;
import java.util.List;

public class MoviesInfo {
  List<MovieInfo> moviesInfo;
  
  public MoviesInfo(){
    this.moviesInfo = new ArrayList<MovieInfo>();
  }


  public List<MovieInfo> getMoviesInfo() {
    return moviesInfo;
  }

  public void setMoviesInfo(List<MovieInfo> moviesInfo) {
    this.moviesInfo = moviesInfo;
  }
}
