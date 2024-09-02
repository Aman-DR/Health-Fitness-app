package com.example.aman.Health_Fitness_app;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/workouts")
public class WorkoutController {

    @GetMapping("/allWorkouts")
    public String getAllWorkouts(){
        return "Working";
    }

    @GetMapping("/userId/{userId}")
    public String getWorkoutByUser(){
        return "Working";
    }

    @GetMapping("/workoutId/{workoutId}")
    public String getWorkoutsById(){
        return "Working";
    }

    @GetMapping("/workoutType/{type}")
    public String getWorkoutByType(){
        return "Working";
    }

    @PostMapping("/create")
    public String createWorkout(){
        return "Working";
    }

    @PutMapping("/update/{workoutId}")
    public String updateWorkout(){
        return "Working";
    }

    @DeleteMapping("/delete/{workoutId}")
    public String deleteWorkout(){
        return "Working";
    }

}
