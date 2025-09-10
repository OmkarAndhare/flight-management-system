package com.example.FMS.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/airports")
public class AirportController {


    @GetMapping("/test")
    public String addAirport() {
        return "success";
    }


}