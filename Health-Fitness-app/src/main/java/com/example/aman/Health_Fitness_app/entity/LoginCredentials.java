package com.example.aman.Health_Fitness_app.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class LoginCredentials {

    @Id
    private Integer loginId;
    private String emailId;
    private String password;


}
