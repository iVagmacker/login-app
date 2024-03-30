package com.example.loginauthapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.loginauthapi.domain.user.User;
import com.example.loginauthapi.repositories.UserRepository;

@RestController
@RequestMapping("/user")
public class UserController {

  @Autowired
  private UserRepository repository;
  
  @GetMapping
  public ResponseEntity<List<User>> getUser() {
    List<User> user = this.repository.findAll();
    return ResponseEntity.ok(user);
  }
}
