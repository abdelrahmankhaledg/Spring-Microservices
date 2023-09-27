package spring.microservices.springmovieinfo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import spring.microservices.springmovieinfo.Entity.MovieInfo;
import spring.microservices.springmovieinfo.Entity.MovieSummary;

@RestController
@RequestMapping("/movieInfo")
public class MovieInfoController {
    @Value("${api.key}")
    String apiKey;
    @Autowired
    RestTemplate restTemplate;
    
    @GetMapping("/{movieId}")
    public MovieInfo getMovieInfo(@PathVariable("movieId") String movieId){
        MovieSummary movieSummary = restTemplate.getForObject(String.format("https://api.themoviedb.org/3/movie/%s?api_key=%s",movieId,apiKey)
            , MovieSummary.class);
        return new MovieInfo(movieId,movieSummary.getTitle(),movieSummary.getOverview());
    }
}
