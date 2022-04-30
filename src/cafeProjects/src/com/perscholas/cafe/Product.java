package com.perscholas.cafe;

import java.text.DecimalFormat;

public abstract class Product {
	
	protected String name;
	protected Double price;
	protected String description;
	protected int quantity;
	
	Product(){
		
	}
	Product(String n, Double p, String d){
		this.name = n;
		this.price = p;
		this.description = d;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public abstract Double calculateProductTotal();
	public abstract void addOptions(String a, String b);
	public abstract void printOptions();
	

}
