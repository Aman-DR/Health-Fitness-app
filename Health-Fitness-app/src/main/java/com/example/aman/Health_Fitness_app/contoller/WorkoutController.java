package com.example.aman.Health_Fitness_app.contoller;

import com.example.aman.Health_Fitness_app.service.WorkoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/workouts")
public class WorkoutController {

    @Autowired
    WorkoutService workoutservice;

    @GetMapping("/allworkouts")
    public String getAllWorkouts(){
        return workoutservice.getAllWorkouts();
    }

    @GetMapping("/userId/{userId}")
    public String getWorkoutByUser(){
        return workoutservice.getWorkoutByUser();
    }

    @GetMapping("/workoutId/{workoutId}")
    public String getWorkoutById(){
        return workoutservice.getWorkoutById();
    }

    @GetMapping("/workoutType/{type}")
    public String getWorkoutByType(){
        return workoutservice.getWorkoutByType();
    }

    @PostMapping("/create")
    public String createWorkout(){
        return workoutservice.createWorkout();
    }

    @PutMapping("/update/{workoutId}")
    public String updateWorkout(){
        return workoutservice.updateWorkout();
    }

    @DeleteMapping("/delete/{workoutId}")
    public String deleteWorkout(){
        return workoutservice.deleteWorkout();
    }

}
