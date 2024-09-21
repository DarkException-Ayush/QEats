package com.example.UserMicroservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.UserMicroservice.dao.OutputUser;
import com.example.UserMicroservice.dao.User;

import jakarta.validation.Valid;

@Service
public interface UserService {

	public List<User>getAllUsers();
	
	public OutputUser getAllUsers(int pageSize, int pageNo, String sortBy);

	public User addUser(@Valid User user);

	public User getUserByNamePassword(String username, String password);
}
