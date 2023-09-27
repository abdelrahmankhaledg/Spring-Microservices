package spring.microservices.ratingsdataservice.Entity;

import java.util.List;

public class UserMoviesRatings {
    private String userId;
    private List<MovieRating> moviesRatings;
    
    public List<MovieRating> getMoviesRatings() {
        return moviesRatings;
    }

    public void setMoviesRatings(List<MovieRating> moviesRatings) {
        this.moviesRatings = moviesRatings;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
