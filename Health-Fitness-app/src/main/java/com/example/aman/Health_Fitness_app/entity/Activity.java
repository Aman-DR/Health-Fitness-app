package com.example.aman.Health_Fitness_app.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Activity {

    @Id
    private Integer activityId;

   // private User user;

    private String Date;
    private String activityType;
    private Integer Duration;
    private Integer Steps;
    private Integer calaoriesBurned;
}
