package com.netflixclone.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Movie {
    private Long id;
    private String title;
    private String overview;
    private String releaseDate;
    private String posterPath;

    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("overview")
    public String getOverview() {
        return overview;
    }

    @JsonProperty("release_date")
    public String getReleaseDate() {
        return releaseDate;
    }

    @JsonProperty("poster_path")
    public String getPosterPath() {
        return posterPath;
    }
}
