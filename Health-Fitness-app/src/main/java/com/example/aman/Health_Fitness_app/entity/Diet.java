package com.example.aman.Health_Fitness_app.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Diet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer dietId;

    //private User user;

    private String date;
    private String meal; //breakfast, lunch

    //private Food foodItems;

    private Integer totalCalories;

}
