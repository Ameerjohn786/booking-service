package com.booking.BookingService.service;

import com.booking.BookingService.client.HotelClient;
import com.booking.BookingService.dto.HotelDto;
import com.booking.BookingService.model.Booking;
import com.booking.BookingService.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BookingService {

    @Autowired
    HotelClient hotelClient;

    @Autowired
    BookingRepository bookingRepository;

    public Booking createBooking(Booking booking) {
        HotelDto hotel = hotelClient.getHotelById(booking.getHotelId());
        System.out.println(hotel);
        if (hotel == null) {
            throw new RuntimeException("Hotel Does not exist");
        }
        booking.setStatus("Confirmed");
        return bookingRepository.save(booking);
    }
}
