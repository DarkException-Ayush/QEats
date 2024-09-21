package com.example.UserMicroservice.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.UserMicroservice.dao.OutputUser;
import com.example.UserMicroservice.dao.User;
import com.example.UserMicroservice.repository.UserRepository;

import jakarta.annotation.Resource;
import jakarta.validation.Valid;

@Service
public class UserServiceImpl implements UserService{

	@Resource
	UserRepository userRepository;
	
	@Override
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	@Override
	public User addUser(@Valid User user) {
		return userRepository.save(user);
	}

	@Override
	public OutputUser getAllUsers(int pageSize, int pageNo, String sortBy) {
		Pageable p = PageRequest.of(pageNo, pageSize, Sort.by(sortBy).ascending());
		Page <User> page = userRepository.findAll(p);
		List<User> data = page.getContent();
		int totalPageNo = page.getTotalPages();
		OutputUser result = new OutputUser(pageNo, pageSize, totalPageNo, data);
		return result;

	}

	@Override
	public User getUserByNamePassword(String username, String password) {
		return userRepository.getByNamePassword(username, password);
	}

}
