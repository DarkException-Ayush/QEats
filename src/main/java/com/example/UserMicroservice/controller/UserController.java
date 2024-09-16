package com.example.UserMicroservice.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.UserMicroservice.dao.OutputUser;
import com.example.UserMicroservice.dao.User;
import com.example.UserMicroservice.service.UserService;

import jakarta.annotation.Resource;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Size;

@RestController
public class UserController {

	@Resource
	UserService userService;
	
	@GetMapping("/allUsers")
	public List<User> getAllUsers() {
		return userService.getAllUsers();
	}
	
	@GetMapping("/Users")
	public ResponseEntity<OutputUser> getUserByPageNo(@RequestParam(defaultValue = "1") @Max(value = 4, message = "Page size greater than 2 not allowed") int pageSize, @RequestParam(defaultValue = "1") int pageNo,
			@RequestParam(defaultValue = "userName", required = false) String sortBy){
		return ResponseEntity.status(HttpStatus.OK).body(
				userService.getAllUsers(pageSize, pageNo, sortBy));
	}
	
	@PostMapping("/User")
	public User addUser(@Valid @RequestBody User user) {
		return userService.addUser(user);
	}
}
