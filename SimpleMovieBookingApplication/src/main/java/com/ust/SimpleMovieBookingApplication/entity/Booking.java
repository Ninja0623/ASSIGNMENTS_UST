package com.ust.SimpleMovieBookingApplication.entity;

import java.time.LocalDate;

import jakarta.persistence.*;

@Entity
@Table(name = "booking")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bookingId;
    private String customerName;
    private int seatsBooked;
    private LocalDate bookingDate = LocalDate.now();
    @ManyToOne
    @JoinColumn(name = "showId")
    private Show show;

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getSeatsBooked() {
        return seatsBooked;
    }

    public void setSeatsBooked(int seatsBooked) {
        this.seatsBooked = seatsBooked;
    }

    public LocalDate getBookingDate() {
        return bookingDate;
    }

    public Show getShow() {
        return show;
    }

    public void setShow(Show show) {
        this.show = show;
    }

    public Booking(int bookingId, String customerName, int seatsBooked, Show show) {
        this.bookingId = bookingId;
        this.customerName = customerName;
        this.seatsBooked = seatsBooked;
        this.show = show;
    }

    public Booking() {

    }



    public void setBookingDate(LocalDate bookingDate) {
        this.bookingDate = bookingDate;
    }
}

