package spring.mircoservices.moviecatalogservice.Entity;



public class CatalogItem {
    private String movieName;
    private String movieDescription;
    private int userRating;
    
    public CatalogItem(){}
    public CatalogItem(String movieName, String movieDescription, int userRating) {
        this.movieName = movieName;
        this.movieDescription = movieDescription;
        this.userRating = userRating;
    }
    
    public String getMovieName() {
        return movieName;
    }
    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }
    public String getMovieDescription() {
        return movieDescription;
    }
    public void setMovieDescription(String movieDescription) {
        this.movieDescription = movieDescription;
    }
    public int getUserRating() {
        return userRating;
    }
    public void setUserRating(int userRating) {
        this.userRating = userRating;
    }
        
}
