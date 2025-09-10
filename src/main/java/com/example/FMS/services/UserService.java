package com.example.FMS.services;


import com.example.FMS.model.User;

public interface UserService {

    Boolean checkUserExists(String username);

    void registerUser(User user);
}
