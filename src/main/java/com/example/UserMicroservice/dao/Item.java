package com.example.UserMicroservice.dao;

public class Item {

	private int itemId;
	private String itemName;
	private int quantity;
	private int price;
	
	public Item() {
		// TODO Auto-generated constructor stub
	}
	public Item(String itemName, int quantity, int price) {
		super();
		this.itemName = itemName;
		this.quantity = quantity;
		this.price = price;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
