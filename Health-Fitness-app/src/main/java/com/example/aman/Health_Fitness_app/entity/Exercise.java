package com.example.aman.Health_Fitness_app.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Exercise {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer exerciseId;
    public String exerciseName;
    public String description;
    public String category; //cardio,strength
    public String equipmentRequired;

}
