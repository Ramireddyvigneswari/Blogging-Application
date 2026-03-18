package com.blog.blogapp.controllers;

import com.blog.blogapp.entities.User;
import com.blog.blogapp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    // CREATE USER
    @PostMapping("/")
    public ResponseEntity<User> createUser(@RequestBody User user) {
        User created = userService.createUser(user);
        return ResponseEntity.ok(created);
    }

    // UPDATE USER
    @PutMapping("/{id}")
    public ResponseEntity<User> updateUser(@RequestBody User user, @PathVariable Long id) {
        User updated = userService.updateUser(user, id);
        return ResponseEntity.ok(updated);
    }

    // GET USER BY ID
    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable Long id) {
        User user = userService.getUserById(id);
        return ResponseEntity.ok(user);
    }

    // GET ALL USERS
    @GetMapping("/")
    public ResponseEntity<List<User>> getAllUsers() {
        return ResponseEntity.ok(userService.getAllUsers());
    }

    // DELETE USER
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
        return ResponseEntity.ok("User deleted successfully");
    }
}
