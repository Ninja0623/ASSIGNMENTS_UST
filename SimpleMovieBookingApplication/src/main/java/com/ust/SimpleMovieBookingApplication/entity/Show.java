package com.ust.SimpleMovieBookingApplication.entity;


import jakarta.persistence.*;

@Entity
public class Show {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int showId;

    public int getShowId() {
        return showId;
    }

    public int getTotalSeats() {
        return totalSeats;
    }

    public void setTotalSeats(int totalSeats) {
        this.totalSeats = totalSeats;
    }

    public void setShowId(int showId) {
        this.showId = showId;
    }

    public String getShowTime() {
        return showTime;
    }

    public void setShowTime(String showTime) {
        this.showTime = showTime;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    private String showTime;

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    private int totalSeats;
    private int availableSeats;
    @ManyToOne
    @JoinColumn(name="movieid")
    private Movie movie;

    public Show(int showId, String showTime, int totalSeats, int availableSeats, Movie movie) {
        this.showId = showId;
        this.showTime = showTime;
        this.totalSeats = totalSeats;
        this.availableSeats = availableSeats;
        this.movie = movie;
    }

    public Show() {

    }
    public Show(int showId) {
        this.showId=showId;
    }
}
