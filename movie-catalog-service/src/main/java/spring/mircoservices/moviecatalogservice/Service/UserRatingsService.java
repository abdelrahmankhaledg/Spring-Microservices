package spring.mircoservices.moviecatalogservice.Service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import io.github.resilience4j.bulkhead.annotation.Bulkhead;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import spring.mircoservices.moviecatalogservice.Entity.MovieRating;
import spring.mircoservices.moviecatalogservice.Entity.UserMoviesRatings;

@Service
public class UserRatingsService {

  @Autowired
  RestTemplate restTemplate;
  
  // you can only use the cicuit breaker or the bulkhead at a time but not both
  //@CircuitBreaker(name = "UserRatingCircuitBreaker", fallbackMethod = "getUserMoviesRatingsFallback")
  @Bulkhead(name = "userMovieRatings",fallbackMethod = "getUserMoviesRatingsFallback")
  public UserMoviesRatings getUserMoviesRatings(String userId) {
    UserMoviesRatings userMoviesRatings = restTemplate.getForObject(
      String.format("http://ratings-data-service/rating/users/%s", userId), UserMoviesRatings.class);
    return userMoviesRatings;
  }

  public UserMoviesRatings getUserMoviesRatingsFallback(String userId, Throwable e){
    UserMoviesRatings userMoviesRatings = new UserMoviesRatings();
    userMoviesRatings.setUserId(userId);
    userMoviesRatings.setMoviesRatings(Arrays.asList(new MovieRating("0", 0)));
    return userMoviesRatings;
  }
}
