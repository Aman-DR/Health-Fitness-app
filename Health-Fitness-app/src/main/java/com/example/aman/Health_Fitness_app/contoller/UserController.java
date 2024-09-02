package com.example.aman.Health_Fitness_app.contoller;


import com.example.aman.Health_Fitness_app.service.UserService;
import com.example.aman.Health_Fitness_app.entity.LoginCredentials;
import com.example.aman.Health_Fitness_app.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userservice;

    @PostMapping("/register")
    private String registerUser(@RequestBody User user){
        return userservice.registerUser(user);
    }

    @PostMapping("/login")
    private String login(@RequestBody LoginCredentials logincred){
        return userservice.login(logincred);
    }

    @GetMapping("/getUser/{userId}")       //{userId}
    private Optional<User> getUser(@PathVariable Integer userId){
        return userservice.getUser(userId);
    }

    @PutMapping("/update/{userId}")        //{userId}
    private String updateUser(@PathVariable Integer userId, @RequestBody User user){
        return userservice.updateUser(userId, user);
    }

    @DeleteMapping("/delete/{userId}")      //{userId}
    private String deleteUser(@PathVariable Integer userId){
        return userservice.deleteUser(userId);
    }
}
