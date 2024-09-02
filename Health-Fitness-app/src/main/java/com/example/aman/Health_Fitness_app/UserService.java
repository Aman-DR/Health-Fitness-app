package com.example.aman.Health_Fitness_app;

import com.example.aman.Health_Fitness_app.entity.LoginCredentials;
import com.example.aman.Health_Fitness_app.entity.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {


    public String register(User user) {

        return "User Added Successfully";
    }

    public String login(LoginCredentials logincred) {

        return "Login Successfully";
    }

    public String getUser(Integer userId) {

        return "User retrieved";
    }


    public String updateUser(Integer userId) {

        return "User Updated Successfully";
    }

    public String deleteUser(Integer userId) {

        return "User Deleted Successfully";
    }
}
