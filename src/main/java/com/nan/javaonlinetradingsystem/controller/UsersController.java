package com.nan.javaonlinetradingsystem.controller;

import com.nan.javaonlinetradingsystem.domain.Users;
import com.nan.javaonlinetradingsystem.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UsersController {

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

    @GetMapping("/list")
    public List<Users> getAllUsers() {
        return usersService.selectAllUsers(); // 假设服务层有一个selectAllUsers()方法来获取所有用户
    }

    @GetMapping("/{id}")
    public Users getUserById(@PathVariable Integer id) {
        return usersService.selectUserById(id); // 假设服务层有一个selectUserById()方法来根据ID获取用户
    }

    @PostMapping("/edit")
    public ResponseEntity<?> editUser(@RequestBody Users users) {
        int affectedRows = usersService.editUser(users);
        if (affectedRows > 0) {
            return ResponseEntity.ok("User updated successfully");
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("User update failed");
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable Integer id) {
        int affectedRows = usersService.deleteUserById(id);
        if (affectedRows > 0) {
            return ResponseEntity.ok("User deleted successfully");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User not found");
        }
    }
}