package com.example.aman.Health_Fitness_app;

import com.example.aman.Health_Fitness_app.entity.LoginCredentials;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginCredentialsRepository extends JpaRepository<LoginCredentials,Integer> {
}
