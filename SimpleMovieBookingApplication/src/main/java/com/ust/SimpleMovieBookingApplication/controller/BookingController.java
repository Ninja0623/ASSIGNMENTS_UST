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

    @PostMapping(value="/createBookings",consumes= MediaType.APPLICATION_JSON_VALUE)
    public Map<String,Object> createBookings(@RequestBody Booking b) {
        return bookingService.createBookings(b);
    }

    @GetMapping(value="/allBookings",produces=MediaType.APPLICATION_JSON_VALUE)
    public List<Map<String,Object>> getAllBookings(){
        return bookingService.getAllBookings();
    }

    @DeleteMapping(value="/cancelBookings/{bookingId}",produces=MediaType.TEXT_PLAIN_VALUE)
    public String cancelBookings(@PathVariable int bookingId) {
        return bookingService.cancelBookings(bookingId);
    }
}
