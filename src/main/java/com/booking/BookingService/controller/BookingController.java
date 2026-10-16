package com.booking.BookingService.controller;

import com.booking.BookingService.model.Booking;
import com.booking.BookingService.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bookings")
public class BookingController {


    @Autowired
    private BookingService bookingService;

    @PostMapping("/book")
    public ResponseEntity<Booking> saveBooking(@RequestBody Booking booking) {
        Booking book = bookingService.createBooking(booking);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(book);
    }

}
