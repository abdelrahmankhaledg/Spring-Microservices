package spring.microservices.ratingsdataservice.Controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import spring.microservices.ratingsdataservice.Entity.MovieRating;
import spring.microservices.ratingsdataservice.Entity.UserMoviesRatings;

@RestController
@RequestMapping("/rating")
public class RatingController {
    
    @GetMapping("/{movieId}")
    public MovieRating getRating(@PathVariable("movieId") String movieId){
        return new MovieRating(movieId, 4);
    }

    @GetMapping("/users/{userId}")
    public UserMoviesRatings getUserRatings(@PathVariable("userId") String userId){
        List<MovieRating> moviesRatings = Arrays.asList(
            new MovieRating("100", 4),
            new MovieRating("200", 3)
        );
        UserMoviesRatings userMoviesRatings = new UserMoviesRatings();
        userMoviesRatings.setUserId(userId);
        userMoviesRatings.setMoviesRatings(moviesRatings);
        return userMoviesRatings;
    }
}
