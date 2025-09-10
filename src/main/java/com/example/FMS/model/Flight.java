package com.example.FMS.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String flightNo; // e.g., AI-850

    @ManyToOne
    @JoinColumn(name = "origin_airport_id")
    private Airport originAirport;

    @ManyToOne
    @JoinColumn(name = "dest_airport_id")
    private Airport destAirport;

    private Integer durationMinutes;
}