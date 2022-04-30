package com.perscholas.cafe;

import java.text.DecimalFormat;

public class Cappuccino extends Product{

	
	boolean peppermint;
	boolean whippedCream;

	Cappuccino(){
		super("Cappucino", 6.25, "el especial");
		this.peppermint = false;
		this.whippedCream = false;
	}
	Cappuccino(String n, Double p, String d, boolean t, boolean w){
		super(n,p,d);
		this.peppermint = t;
		this.whippedCream = w;
		
	}
	
	public boolean isPeppermint() {
		return peppermint;
	}
	public void setPeppermint(boolean peppermint) {
		this.peppermint = peppermint;
	}
	public boolean isWhippedCream() {
		return whippedCream;
	}
	public void setWhippedCream(boolean whippedCream) {
		this.whippedCream = whippedCream;
	}
	@Override
	public Double calculateProductTotal() {
		DecimalFormat df = new DecimalFormat("0.00");
		Double subtotal = getPrice();
		if(peppermint == true) {subtotal += 2;}
		if(whippedCream == true) {subtotal += 1;}
		df.format(subtotal);
		return subtotal;
	}
	@Override
	public void addOptions(String a, String b) {
		// TODO Auto-generated method stub
		if (a.equals("y") || a.equals("yes") ) {this.peppermint = true;}
		if (b.equals("y") || b.equals("yes") ) {this.whippedCream= true;}
		
	}
	@Override
	public void printOptions() {
		// TODO Auto-generated method stub
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.println("Item: \t" + this.name + "\t Price: "+ df.format(this.price) + "\t Qty:" + this.quantity +  "\t Subtotal: " + df.format(calculateProductTotal()));
		System.out.print("\tPeppermint: "); 
		if (this.peppermint == true) {System.out.print("Yes (Add $2)");} else{System.out.print("No");}
		System.out.print("\t Whipped Cream: ");
		if (this.whippedCream == true) {System.out.print("Yes (Add $1)\n");}else{System.out.print("No\n");}
		
	}
	
}