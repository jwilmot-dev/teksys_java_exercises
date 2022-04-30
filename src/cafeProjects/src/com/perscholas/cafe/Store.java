package com.perscholas.cafe;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Store extends ShoppingCart{
	
	double store_subtotal = 0;
	double store_salestax = 0;
	double store_total = 0;
	
	List<Object> store = new ArrayList<>();
	
	Store(ShoppingCart cart){
		this.store.add(cart);
	
	}
	public void checkout() {
		//get items from cart using loop
		//print info
		//add subtotal
		DecimalFormat df = new DecimalFormat("0.00");
		final Double SALES_TAX = .08;
		((ShoppingCart) store.get(0)).printOptions();
		Double subtotal = ((ShoppingCart) store.get(0)).calculateProductTotal();
		System.out.println("Purchase Subtotal: " + df.format(subtotal));
		System.out.println("Sales Tax: " + df.format(subtotal*SALES_TAX));
		System.out.println("Purchase Total: " + df.format((subtotal*SALES_TAX) + subtotal));

	}

}
