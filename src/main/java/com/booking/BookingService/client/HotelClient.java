package com.booking.BookingService.client;

import com.booking.BookingService.dto.HotelDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.UUID;

@FeignClient(name = "HotelService")
public interface HotelClient {
    @GetMapping("/hotel/hotels/{hotelId}")
    HotelDto getHotelById(@PathVariable("hotelId") UUID hotelId);
}
