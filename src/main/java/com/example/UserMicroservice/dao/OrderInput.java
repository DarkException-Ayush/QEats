package com.example.UserMicroservice.dao;

import java.util.HashMap;

public class OrderInput {

	private String username;
	private String password;
	private String restrauntName;
	private HashMap<String, Integer> order;
	
	public OrderInput() {
		// TODO Auto-generated constructor stub
	}
	
	public OrderInput(String username, String password, String restrauntName, HashMap<String, Integer> order) {
		super();
		this.username = username;
		this.password = password;
		this.restrauntName = restrauntName;
		this.order = order;
	}

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRestrauntName() {
		return restrauntName;
	}
	public void setRestrauntName(String restrauntName) {
		this.restrauntName = restrauntName;
	}
	public HashMap<String, Integer> getOrder() {
		return order;
	}
	public void setOrder(HashMap<String, Integer> order) {
		this.order = order;
	}
}
