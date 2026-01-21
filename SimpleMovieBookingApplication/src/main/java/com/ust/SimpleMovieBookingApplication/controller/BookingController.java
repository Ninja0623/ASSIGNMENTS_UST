package com.ust.SimpleMovieBookingApplication.controller;


import com.ust.SimpleMovieBookingApplication.entity.Booking;
import com.ust.SimpleMovieBookingApplication.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class BookingController {
    @Autowired
    BookingService bookingService;

    @PostMapping(value="/api/bookings",consumes= MediaType.APPLICATION_JSON_VALUE)
    public Map<String,Object> createBooking(@RequestBody Booking b) {
        return bookingService.createBooking(b);
    }

    @GetMapping(value="/api/bookings",produces=MediaType.APPLICATION_JSON_VALUE)
    public List<Map<String,Object>> getAllBookings(){
        return bookingService.getAllBookings();
    }

    @DeleteMapping(value="/api/bookings/{bookingid}",produces=MediaType.TEXT_PLAIN_VALUE)
    public String cancelBooking(@PathVariable int bookingid) {
        return bookingService.cancelBooking(bookingid);
    }
}
