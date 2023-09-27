package spring.mircoservices.moviecatalogservice.Entity;

import java.util.List;

public class UserMoviesRatings {
    private String userId;
    private List<MovieRating> moviesRatings;


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }



    public List<MovieRating> getMoviesRatings() {
        return moviesRatings;
    }

    public void setMoviesRatings(List<MovieRating> moviesRatings) {
        this.moviesRatings = moviesRatings;
    }
}
