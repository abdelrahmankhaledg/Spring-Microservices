package spring.microservices.springmovieinfo.Entity;

public class MovieInfo {
    private String movieName;
    private String movieId;
    private String movieDescription;
    

    public MovieInfo(String movieId, String movieName, String movieDescription) {
        this.movieName = movieName;
        this.movieId = movieId;
        this.movieDescription = movieDescription;
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
        return this.movieDescription;
    }
    public void setMovieDescription(String movieDescription) {
        this.movieDescription = movieDescription;
    }
}
