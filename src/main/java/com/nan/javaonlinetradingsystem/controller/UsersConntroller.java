package com.nan.javaonlinetradingsystem.controller;

import com.nan.javaonlinetradingsystem.domain.Users;
import com.nan.javaonlinetradingsystem.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UsersConntroller {

    @Autowired
    private UsersService usersService;

    @PutMapping("/add")
    public ResponseEntity<?> addUsers(@RequestBody Users users) {
        int affectedRows = usersService.addUsers(users);
        if (affectedRows > 0) {
            return ResponseEntity.ok("User added successfully");
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("User addition failed");
        }
    }
}