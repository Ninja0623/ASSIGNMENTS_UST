package com.ust.SimpleMovieBookingApplication.service;

import com.ust.SimpleMovieBookingApplication.entity.Movie;
import com.ust.SimpleMovieBookingApplication.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public Movie addMovie(Movie m) {

        Movie savedMovie = movieRepository.save(m);
        return savedMovie;
    }

    public List<Movie> getAllMovie() {

        List<Movie> movies = movieRepository.findAll();
        return movies;
    }

    public Optional<Movie> checkMovieId(Movie m) {

        Integer movieId = m.getMovieid();
        Optional<Movie> movie = movieRepository.findById(movieId);

        return movie;
    }
}

