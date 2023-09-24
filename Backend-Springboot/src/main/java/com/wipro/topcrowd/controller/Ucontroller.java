package com.wipro.topcrowd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.wipro.topcrowd.model.User;
import com.wipro.topcrowd.repository.Urepository;
import com.wipro.topcrowd.service.Uservice;

@RestController
@CrossOrigin(origins="http://localhost:3000")
@RequestMapping("/api/users")
public class Ucontroller {

 @Autowired
 private Uservice userService;

 @PostMapping("/register")
 public User registerUser(@RequestBody User user) {
     return userService.registerUser(user);
 }

 @GetMapping("/{id}")
 public User getUserById(@PathVariable Long id) {
     return userService.getUserById(id);
 }
}
