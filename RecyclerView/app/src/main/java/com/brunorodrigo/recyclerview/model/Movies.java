package com.brunorodrigo.recyclerview.model;

/**
 * Created by bruno.soares on 3/4/19.
 */
public class Movies {
    private String titleMovie;
    private String year;
    private String genre;

    public Movies(){}

    public Movies(String titleMovie, String year, String genre) {
        this.titleMovie = titleMovie;
        this.year = year;
        this.genre = genre;
    }

    public String getTitleMovie() {
        return titleMovie;
    }

    public void setTitleMovie(String titleMovie) {
        this.titleMovie = titleMovie;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
