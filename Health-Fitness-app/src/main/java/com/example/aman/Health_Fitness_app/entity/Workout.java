package com.example.aman.Health_Fitness_app.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Workout {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer workoutId;

    //private User userId;

    private Integer Date;
    private String workoutType; //ex cardio,strength
    private String duration;
    private Integer caloriesBurned;


    //List Exercise exercise;

}
