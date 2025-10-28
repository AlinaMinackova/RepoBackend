package com.example.JenkinsCICDPipeline.controller;

import com.example.JenkinsCICDPipeline.model.Users;
import com.example.JenkinsCICDPipeline.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<Users> getAllUsers() {
        return userService.getAll();
    }

    @PostMapping
    public Users createUser(@RequestBody Users user) {
        return userService.save(user);
    }

    @DeleteMapping
    public ResponseEntity<String> deleteUser(String name){
        userService.delete(name);
        return ResponseEntity.ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body("{\"message\": \"User deleted\"}");
    }
}