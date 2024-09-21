package com.example.UserMicroservice.dao;

import java.util.List;

public class OutputRecipt {

	private int orderId;
	private String username;
	private String restrauntName;
	private List<Item> items;
	private int totalPrice;
	private boolean success;
	
	public OutputRecipt() {
		// TODO Auto-generated constructor stub
	}

	public OutputRecipt(int orderId, String username, String restrauntName, List<Item> items, int totalPrice,
			boolean success) {
		super();
		this.orderId = orderId;
		this.username = username;
		this.restrauntName = restrauntName;
		this.items = items;
		this.totalPrice = totalPrice;
		this.success = success;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getRestrauntName() {
		return restrauntName;
	}

	public void setRestrauntName(String restrauntName) {
		this.restrauntName = restrauntName;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}
	
	
}

