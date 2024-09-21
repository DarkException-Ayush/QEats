package com.example.UserMicroservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import com.example.UserMicroservice.dao.OrderDetails;
import com.example.UserMicroservice.dao.OrderInput;
import com.example.UserMicroservice.dao.OutputRecipt;
import com.example.UserMicroservice.dao.User;
import com.example.UserMicroservice.service.UserService;

import jakarta.annotation.Resource;
import jakarta.persistence.criteria.Order;

@RestController
public class OrderController {

	@Resource
	UserService userService;
	
	@Resource(name = "getWebClient")
	private WebClient webClient;
	
	@PostMapping("/createOrder")
	public OutputRecipt createOrder(@RequestBody OrderInput orderInput){
		User user = userService.getUserByNamePassword(orderInput.getUsername(), orderInput.getPassword());
		OrderDetails orderDetails = new OrderDetails(user, orderInput.getRestrauntName(), orderInput.getOrder());
		return webClient.post()
	     .uri("http://localhost:8081/createOrder")
	     .contentType(MediaType.APPLICATION_JSON)
	     .bodyValue(orderDetails)
	     .retrieve()
	     .bodyToMono(OutputRecipt.class).block();
	}
}
