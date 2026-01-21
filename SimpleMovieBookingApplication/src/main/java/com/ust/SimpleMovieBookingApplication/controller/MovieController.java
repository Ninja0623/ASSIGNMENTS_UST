package com.ust.SimpleMovieBookingApplication.controller;

import com.ust.SimpleMovieBookingApplication.entity.Movie;
import com.ust.SimpleMovieBookingApplication.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class MovieController {
    @Autowired
    MovieService movieService;

    @PostMapping(value="/api/addMovie",consumes= MediaType.APPLICATION_JSON_VALUE)
    public Movie addMovie(@RequestBody Movie m) {
        return movieService.addMovie(m);
    }

    @GetMapping(value="/api/movies",produces=MediaType.APPLICATION_JSON_VALUE)
    public List<Movie> getAllMovies(){
        return movieService.getAllMovie();
    }
}
