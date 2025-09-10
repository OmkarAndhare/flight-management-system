package com.example.FMS.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;

import java.time.ZonedDateTime;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FlightSchedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Flight flight;

    @ManyToOne
    private Aircraft aircraft;

    private ZonedDateTime departureTime;
    private ZonedDateTime arrivalTime;

    @Column(nullable = false)
    private String status; // SCHEDULED, CANCELLED, DELAYED

    @OneToMany(mappedBy = "schedule", cascade = CascadeType.ALL)
    private List<Fare> fares;
}
