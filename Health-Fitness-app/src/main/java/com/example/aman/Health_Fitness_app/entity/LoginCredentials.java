package com.example.aman.Health_Fitness_app.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class LoginCredentials {

    @Id
    private Integer loginId;

//    private User userId;
//    private User emailId;
//    private User password;
//


}
