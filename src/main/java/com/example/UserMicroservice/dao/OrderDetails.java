package com.example.UserMicroservice.dao;

import java.util.HashMap;

public class OrderDetails {

	private User user;
	private String restrauntName;
	private HashMap<String, Integer> order;
	
	
	public OrderDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OrderDetails(User user, String restrauntName, HashMap<String, Integer> order) {
		super();
		this.user = user;
		this.restrauntName = restrauntName;
		this.order = order;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
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
