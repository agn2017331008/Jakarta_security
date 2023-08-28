package com.example.guruajul.controllers;



import com.example.guruajul.entities.User;
import com.example.guruajul.services.DataService;
import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

import java.util.List;

@RequestScoped
@Named
public class UserController {
    @Inject
    DataService dataService;

    private List<User> allUsers;

    @PostConstruct
    public void initialize() {
        this.allUsers = dataService.getAllUsers();
    }

    public List<User> getAllUsers() {
        return allUsers;
    }
}