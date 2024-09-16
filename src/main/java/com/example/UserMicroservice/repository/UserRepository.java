package com.example.UserMicroservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.UserMicroservice.dao.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}
