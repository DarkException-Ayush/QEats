package com.example.UserMicroservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.UserMicroservice.dao.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

	@Query("select u from User u where userName = :n and password = :m")
	User getByNamePassword(@Param("n") String username,@Param("m") String password);

}
