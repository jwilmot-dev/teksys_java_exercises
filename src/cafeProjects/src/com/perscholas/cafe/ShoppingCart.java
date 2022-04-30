package com.perscholas.cafe;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart extends Product {
	
	List <Object> cart = new ArrayList<Object>();
	 
	ShoppingCart(){
			
	}
	public List<Object> getCart() {
		return cart;
	}
	public void addToCart(Object o) {
		this.cart.add(o);
	}
	public void removeFromCart(Object o) {
		cart.remove(o);
	}
	@Override
	public Double calculateProductTotal() {
		// TODO Auto-generated method stub
		Double subtotal=0.00;
		for(Object o: this.cart) {
			subtotal += ((Product) o).calculateProductTotal();
		}
		return subtotal;
	}
	@Override
	public void addOptions(String a, String b) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void printOptions() {
		// TODO Auto-generated method stub
		for(Object o : this.cart) {
			((Product) o).printOptions();
		}
		
	}
	

}
