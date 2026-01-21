package com.ust.SimpleMovieBookingApplication.repository;

import com.ust.SimpleMovieBookingApplication.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Integer> {
}
