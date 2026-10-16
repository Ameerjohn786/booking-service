package com.booking.BookingService.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "bookings")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID bookingId;
    @Column(nullable = false)
    private UUID hotelId;
    private String guestName;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    private double totalAmount;
    private String status;
}
