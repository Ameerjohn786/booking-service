package com.booking.BookingService.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class HotelDto {
    private UUID hotelId;
    private String hotelName;
    private String phoneNumber;
    private List<String> amenities;
}
