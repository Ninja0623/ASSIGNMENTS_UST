package com.ust.SimpleMovieBookingApplication.service;

import com.ust.SimpleMovieBookingApplication.entity.Booking;
import com.ust.SimpleMovieBookingApplication.entity.Show;
import com.ust.SimpleMovieBookingApplication.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class BookingService {

    @Autowired
    private BookingRepository bookingRepository;

    @Autowired
    private ShowService showService;

    public Map<String, Object> convert(Booking booking) {
        Map<String, Object> response = new LinkedHashMap<>();

        response.put("bookingId", booking.getBookingId());
        response.put("customerName", booking.getCustomerName());
        response.put("seatsBooked", booking.getSeatsBooked());
        response.put("bookingDate", booking.getBookingDate());

        return response;
    }

    public Map<String, Object> createBookings(Booking booking) {

        Optional<Show> show =
                showService.checkShowId(booking.getShow().getShowId());

        if (show.isPresent()) {

            boolean seatBooked = showService.bookSeat(
                    booking.getShow().getShowId(),
                    booking.getSeatsBooked()
            );

            if (seatBooked) {
                booking.setShow(show.get());
            }

            Booking savedBooking = bookingRepository.save(booking);
            return convert(savedBooking);
        }

        return null;
    }

    public List<Map<String, Object>> getAllBookings() {

        List<Map<String, Object>> response = new ArrayList<>();

        List<Booking> bookings = bookingRepository.findAll();
        for (Booking booking : bookings) {
            response.add(convert(booking));
        }

        return response;
    }

    public String cancelBookings(int bookingId) {

        Optional<Booking> booking =
                bookingRepository.findById(bookingId);

        if (booking.isPresent()) {

            boolean seatCancelled = showService.cancelSeat(
                    booking.get().getShow().getShowId(),
                    booking.get().getSeatsBooked()
            );

            if (seatCancelled) {
                bookingRepository.delete(booking.get());
                return "Booking cancelled successfully";
            }
        }

        return "Booking id not available";
    }
}
