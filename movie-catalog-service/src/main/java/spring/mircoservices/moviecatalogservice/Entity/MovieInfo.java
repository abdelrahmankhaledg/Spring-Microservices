package spring.mircoservices.moviecatalogservice.Entity;

public class MovieInfo {
    private String movieName;
    private String movieId;
    private String movieDescription;
    

    public MovieInfo(){}

    public MovieInfo(String movieName, String movieDescription, String movieId) {
        this.movieName = movieName;
        this.movieDescription = movieDescription;
        this.movieId = movieId;
    }
    public String getMovieName() {
        return movieName;
    }
    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }
    public String getMovieId() {
        return movieId;
    }
    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }
    public String getMovieDescription() {
        return movieDescription;
    }
    public void setMovieDescription(String movieDescription) {
        this.movieDescription = movieDescription;
    }  
}
