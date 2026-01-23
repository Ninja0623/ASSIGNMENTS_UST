package com.ust.SimpleMovieBookingApplication.service;

import com.ust.SimpleMovieBookingApplication.entity.Movie;
import com.ust.SimpleMovieBookingApplication.entity.Show;
import com.ust.SimpleMovieBookingApplication.repository.ShowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;


@Service
public class ShowService {

    @Autowired
    private ShowRepository showRepository;

    @Autowired
    private MovieService movieService;

    public Show createShows(Show show) {

        Optional<Movie> movie =
                movieService.checkMovieId(show.getMovie());

        if (movie.isPresent()) {
            show.setMovie(movie.get());
            Show savedShow = showRepository.save(show);
            return savedShow;
        }

        return new Show();
    }

    public List<Map<String, Object>> getAllShows() {

        List<Show> result = showRepository.findAll();
        List<Map<String, Object>> response = new ArrayList<>();

        for (Show s : result) {

            Map<String, Object> movieMap = new LinkedHashMap<>();
            movieMap.put("movieId", s.getMovie().getMovieId());
            movieMap.put("title", s.getMovie().getTitle());

            Map<String, Object> showMap = new LinkedHashMap<>();
            showMap.put("showId", s.getShowId());
            showMap.put("showtime", s.getShowTime());
            showMap.put("availableSeats", s.getAvailableSeats());
            showMap.put("movie", movieMap);

            response.add(showMap);
        }

        return response;
    }

    public List<Map<String, Object>> getShowByMovie(int mid) {

        List<Show> result =
                showRepository.findShowByMovie_MovieId(mid);

        List<Map<String, Object>> response = new ArrayList<>();

        for (Show s : result) {

            Map<String, Object> showMap = new LinkedHashMap<>();
            showMap.put("showId", s.getShowId());
            showMap.put("showtime", s.getShowTime());
            showMap.put("availableSeats", s.getAvailableSeats());

            response.add(showMap);
        }

        return response;
    }

    public Optional<Show> checkShowId(int showId) {

        Optional<Show> show = showRepository.findById(showId);
        return show;
    }

    public boolean bookSeat(int showId, int seats) {

        Optional<Show> s = showRepository.findById(showId);

        if (s.isPresent()) {

            int availableSeat = s.get().getAvailableSeats();

            if (seats > availableSeat || seats <= 0) {
                return false;
            }

            s.get().setAvailableSeats(availableSeat - seats);
            showRepository.saveAndFlush(s.get());
        }

        return false;
    }

    public boolean cancelSeat(int showId, int seats) {

        Optional<Show> show =
                showRepository.findById(showId);

        if (show.isPresent()) {

            if (seats <= 0) {
                return false;
            }

            int availableSeats = show.get().getAvailableSeats();
            show.get().setAvailableSeats(availableSeats + seats);

            showRepository.saveAndFlush(show.get());
            return true;
        }

        return false;
    }
}
