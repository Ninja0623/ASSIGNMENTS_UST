package com.ust.SimpleMovieBookingApplication.controller;

import com.ust.SimpleMovieBookingApplication.entity.Movie;
import com.ust.SimpleMovieBookingApplication.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MovieController {
    @Autowired
    MovieService movieService;

    @PostMapping(value="/addMovie",consumes= MediaType.APPLICATION_JSON_VALUE)
    public Movie addMovie(@RequestBody Movie m) {
        return movieService.addMovies(m);
    }

    @GetMapping(value="/movies",produces=MediaType.APPLICATION_JSON_VALUE)
    public List<Movie> getAllMovie(){
        return movieService.getAllMovies();
    }
}
