package com.example.FMS.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Airport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false, length = 10)
    private String code; // e.g., PNQ, BLR

    private String name;

    private String city;

    private String country;

    private String timezone;

}
