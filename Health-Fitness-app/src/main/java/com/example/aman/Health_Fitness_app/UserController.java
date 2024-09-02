package com.example.aman.Health_Fitness_app;


import com.example.aman.Health_Fitness_app.entity.LoginCredentials;
import com.example.aman.Health_Fitness_app.entity.User;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userservice;


    @PostMapping("/register")
    private String register(@RequestBody User user){
        return userservice.register(user);
    }

    @PostMapping("/login")
    private String login(@RequestBody LoginCredentials logincred){
        return userservice.login(logincred);
    }

    @GetMapping("/getUser/{userId}")       //{userId}
    private String getUser(@PathVariable Integer userId){
        return userservice.getUser(userId);
    }

    @PutMapping("/update/{userId}")        //{userId}
    private String updateUser(@PathVariable Integer userId){
        return userservice.updateUser(userId);
    }

    @DeleteMapping("/delete/{userId}")      //{userId}
    private String deleteUser(@PathVariable Integer userId){
        return userservice.deleteUser(userId);
    }
}
