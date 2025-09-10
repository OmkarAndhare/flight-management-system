package com.example.FMS.model;

import com.example.FMS.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

@Table(name = "app_user") // 'user' is reserved in SQL
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String email;
    private String password;
    private Role role; // CUSTOMER, ADMIN
}
