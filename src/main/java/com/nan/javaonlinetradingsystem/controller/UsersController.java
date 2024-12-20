package com.nan.javaonlinetradingsystem.controller;

import com.nan.javaonlinetradingsystem.domain.Users;
import com.nan.javaonlinetradingsystem.service.UsersService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@Api(description = "用户管理接口", tags = {"用户管理"})
public class UsersController {

    @Autowired
    private UsersService usersService;

    @ApiOperation(value = "添加新用户", notes = "通过提供用户信息来添加新用户", response = String.class, httpMethod = "PUT")
    @PutMapping("/add")
    public ResponseEntity<?> addUsers(@RequestBody Users users) {
        int affectedRows = usersService.addUsers(users);
        if (affectedRows > 0) {
            return ResponseEntity.ok("User added successfully");
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("User addition failed");
        }
    }

    @ApiOperation(value = "获取所有用户列表", notes = "返回系统中所有用户的列表", response = List.class, responseContainer = "List", httpMethod = "GET")
    @GetMapping("/list")
    public List<Users> getAllUsers() {
        return usersService.selectAllUsers();
    }

    @ApiOperation(value = "根据用户ID获取用户信息", notes = "通过用户ID获取特定用户的详细信息", response = Users.class, httpMethod = "GET")
    @GetMapping("/{id}")
    public Users getUserById(@PathVariable Integer id) {
        return usersService.selectUserById(id);
    }

    @ApiOperation(value = "更新用户信息", notes = "通过提供用户信息来更新现有用户", response = String.class, httpMethod = "POST")
    @PostMapping("/edit")
    public ResponseEntity<?> editUser(@RequestBody Users users) {
        int affectedRows = usersService.editUser(users);
        if (affectedRows > 0) {
            return ResponseEntity.ok("User updated successfully");
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("User update failed");
        }
    }

    @ApiOperation(value = "删除用户", notes = "根据用户ID删除特定用户", response = String.class, httpMethod = "DELETE")
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