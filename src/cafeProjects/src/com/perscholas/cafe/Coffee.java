package com.perscholas.cafe;

import java.text.DecimalFormat;

public class Coffee extends Product{

	boolean sugar;
	boolean milk;

	
	Coffee(){
		super("Coffee", 2.75, "Dark Roast");
		this.sugar = false;
		this.milk = false;
	}
	Coffee(String n, Double p, String d, boolean g, boolean m){
		super(n,p,d);
		this.sugar = g;
		this.milk = m;
		
		
	}
	
	
	public boolean isSugar() {
		return sugar;
	}
	public void setSugar(boolean sugar) {
		this.sugar = sugar;
	}
	public boolean isMilk() {
		return milk;
	}
	public void setMilk(boolean milk) {
		this.milk = milk;
	}
	@Override
	public Double calculateProductTotal() {
		DecimalFormat df = new DecimalFormat("0.00");
		Double subtotal = getPrice();
		df.format(subtotal);
		return subtotal;
		
	}
	@Override
	public void addOptions(String a,String b) {
		// TODO Auto-generated method stub
		if (a.equals("y") || a.equals("yes") ) {this.sugar = true;}
		if (b.equals("y") || b.equals("yes") ) {this.milk = true;}	
	}
	
	@Override
	public void printOptions() {
		// TODO Auto-generated method stub
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.println("Item: \t" + this.name + "\t\t Price: "+ df.format(this.price) + "\t Qty:" + this.quantity +  "\t Subtotal: " + df.format(calculateProductTotal()));
		System.out.print("\tSugar: "); 
		if (this.sugar == true) {System.out.print("Yes");} else{System.out.print("No");}
		System.out.print("\t Milk: ");
		if (this.milk == true) {System.out.print("Yes\n");}else{System.out.print("No\n");}
	}
	
}
