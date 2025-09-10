package com.example.FMS.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Fare {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private FlightSchedule schedule;

    private String fareClass; // ECONOMY, BUSINESS
    private Double price;
    private Integer seatsTotal;
    private Integer seatsRemaining;
}