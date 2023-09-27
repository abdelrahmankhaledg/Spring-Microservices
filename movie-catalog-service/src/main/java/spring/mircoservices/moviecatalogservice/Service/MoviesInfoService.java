package spring.mircoservices.moviecatalogservice.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import spring.mircoservices.moviecatalogservice.Entity.MovieInfo;

@Service
public class MoviesInfoService {
  
  @Autowired
  RestTemplate restTemplate;



  @CircuitBreaker(name = "movieInfoCircuitBreaker", fallbackMethod = "getMovieInfoFallback" )
  public MovieInfo getMovieInfo(String movieId) {
    MovieInfo movieInfo = restTemplate.getForObject(String.format("http://movie-info-service/movieInfo/%s",
      movieId), MovieInfo.class);
    return movieInfo;
  }


  public MovieInfo getMovieInfoFallback(String movieId, Throwable e) {
    return new MovieInfo("Movie name couldn't be fetched", "", movieId);
  }
}
