package com.example.FMS.serviceImpl;

import com.example.FMS.model.User;
import com.example.FMS.repo.UserRepo;
import com.example.FMS.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepo;

    @Override
    public Boolean checkUserExists(String username) {

        return userRepo.existsByUsername(username);

    }

    @Override
    public void registerUser(User user) {
        userRepo.save(user);
    }


}
