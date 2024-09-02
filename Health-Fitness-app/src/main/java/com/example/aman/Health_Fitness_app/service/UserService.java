package com.example.aman.Health_Fitness_app.service;

import com.example.aman.Health_Fitness_app.repository.LoginCredentialsRepository;
import com.example.aman.Health_Fitness_app.repository.UserRepository;
import com.example.aman.Health_Fitness_app.entity.LoginCredentials;
import com.example.aman.Health_Fitness_app.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepository userrepository;

    @Autowired
    LoginCredentialsRepository logincredentialrepository;

    public String registerUser(User user) {
        userrepository.save(user);

        LoginCredentials loginUser = new LoginCredentials();
        loginUser.setLoginId(user.getId());
        loginUser.setEmailId(user.getEmailId());
        loginUser.setPassword(user.getPassword());

        logincredentialrepository.save(loginUser);

        return "User registered Successfully";
    }

    public String login(LoginCredentials logincred) {

        return "Login Successfully";
    }

    public Optional<User> getUser(Integer userId) {

        return userrepository.findById(userId);
    }


    public String updateUser(Integer userId , User user) {

        try {

            User users = userrepository.findById(userId)
                    .orElseThrow(() -> new RuntimeException("User not found with ID: " + userId));

            users.setName(user.getName());
            users.setEmailId(user.getEmailId());
            users.setPassword(user.getPassword());
            users.setAge(user.getAge());
            users.setGender(user.getGender());
            users.setWeight(user.getWeight());
            users.setHeight(users.getHeight());

            userrepository.save(users);

            return "User updated successfully";

        }

        catch (RuntimeException e) {
            return "User ID is not found";
        }
    }

    public String deleteUser(Integer userId) {

        userrepository.deleteById(userId);
        return "User Deleted Successfully";
    }

}
