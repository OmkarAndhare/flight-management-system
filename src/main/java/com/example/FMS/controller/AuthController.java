package com.example.FMS.controller;

import com.example.FMS.model.User;
import com.example.FMS.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public String register(@RequestBody User user) {

        //checking already existed or not
        if (userService.checkUserExists(user.getUsername()))
            return "Username already taken choose other";
        else {
            userService.registerUser(user);
            return "Registered successfully";
        }
    }
}


