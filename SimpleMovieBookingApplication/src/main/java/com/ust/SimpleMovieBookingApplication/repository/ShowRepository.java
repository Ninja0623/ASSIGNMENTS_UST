package com.ust.SimpleMovieBookingApplication.repository;

import com.ust.SimpleMovieBookingApplication.entity.Show;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ShowRepository extends JpaRepository<Show, Integer> {
    List<Show> findShowByMovie_MovieId(int movieId);
}
