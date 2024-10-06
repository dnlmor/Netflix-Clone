package com.netflixclone.services;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflixclone.models.Movie;

@Service
public class MovieService {

    private static final Logger logger = LoggerFactory.getLogger(MovieService.class);

    // TMDB API URL for fetching movies
    private final String MOVIE_API_URL = "https://api.themoviedb.org/3/movie/popular?api_key=";

    // Use your TMDB API key here
    @Value("${tmdb.api.key}") // Load API key from application.properties
    private String tmdbApiKey;

    public List<Movie> getAllMovies() {
        try {
            RestTemplate restTemplate = new RestTemplate();
            String url = MOVIE_API_URL + tmdbApiKey; // Complete the URL with the API key
            logger.info("Fetching movies from TMDB API: {}", url);
            MovieResponse response = restTemplate.getForObject(url, MovieResponse.class);
            return Arrays.asList(response.getResults());
        } catch (Exception e) {
            logger.error("Error fetching movies: {}", e.getMessage());
            return Collections.emptyList();
        }
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
