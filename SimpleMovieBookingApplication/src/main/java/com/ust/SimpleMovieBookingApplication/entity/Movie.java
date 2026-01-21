package com.ust.SimpleMovieBookingApplication.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "movie")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int movieid;
    private String title;
    private String genre;
    private int duration;
    public int getMovieid() {
        return movieid;
    }
    public void setMovieid(int movieid) {
        this.movieid = movieid;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public int getDuration() {
        return duration;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }
    public Movie(int movieid, String title, String genre, int duration) {
        this.movieid=movieid;
        this.title = title;
        this.genre = genre;
        this.duration = duration;
    }
    public Movie() {

    }
    public Movie(int movieid) {
        this.movieid=movieid;
    }


}
