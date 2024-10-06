package com.netflixclone.services;

import com.netflixclone.models.Movie;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class MovieService {

    // TMDB API URL for fetching movies
    private final String MOVIE_API_URL = "https://api.themoviedb.org/3/movie/popular?api_key=";

    // Use your TMDB API key here
    @Value("${tmdb.api.key}") // Load API key from application.properties
    private String tmdbApiKey;

    public List<Movie> getAllMovies() {
        RestTemplate restTemplate = new RestTemplate();
        String url = MOVIE_API_URL + tmdbApiKey; // Complete the URL with the API key
        MovieResponse response = restTemplate.getForObject(url, MovieResponse.class);
        return Arrays.asList(response.getResults());
    }

    // Inner class to map TMDB response
    private static class MovieResponse {
        private Movie[] results;

        public Movie[] getResults() {
            return results;
        }

        public void setResults(Movie[] results) {
            this.results = results;
        }
    }
}
