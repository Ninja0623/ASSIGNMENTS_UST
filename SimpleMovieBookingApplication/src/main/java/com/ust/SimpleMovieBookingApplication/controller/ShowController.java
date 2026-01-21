package com.ust.SimpleMovieBookingApplication.controller;

import com.ust.SimpleMovieBookingApplication.entity.Show;
import com.ust.SimpleMovieBookingApplication.service.ShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


@RestController
public class ShowController {

    @Autowired
    ShowService showService;

    @PostMapping(value = "/api/shows", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Show createShow(@RequestBody Show s) {
        return showService.createShow(s);
    }

    @GetMapping(value = "/api/shows", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Map<String, Object>> getAllShows() {
        return showService.getAllShows();
    }

    @GetMapping(value = "/api/shows/{movieId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Map<String, Object>> getShowByMovie(@PathVariable int movieId) {
        return showService.getShowByMovie(movieId);
    }
}
