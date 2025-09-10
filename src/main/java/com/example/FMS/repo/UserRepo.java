package com.example.FMS.repo;

import com.example.FMS.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {

    boolean existsByUsername(String username);


}
