package com.perscholas.cafe;

import java.text.DecimalFormat;

public class Espresso extends Product{

	boolean extraShot;
	boolean macchiato;
	
	
	Espresso(){
		super("Espresso", 4.5, "colombian");
		this.extraShot = false;
		this.macchiato = false;
	}
	Espresso(String n, Double p, String d, boolean ex, boolean ma){
		super(n,p,d);
		this.extraShot = ex;
		this.macchiato = ma;
		
	}

	public boolean isExtraShot() {
		return extraShot;
	}
	public void setExtraShot(boolean extraShot) {
		this.extraShot = extraShot;
	}
	public boolean isMacchiato() {
		return macchiato;
	}
	public void setMacchiato(boolean macchiato) {
		this.macchiato = macchiato;
	}
	@Override
	public Double calculateProductTotal() {
		DecimalFormat df = new DecimalFormat("0.00");
		Double subtotal = getPrice();
		if(extraShot == true) {subtotal += 2;}
		if(macchiato == true) {subtotal += 1;}
		df.format(subtotal);
		return subtotal;
		
	}
	@Override
	public void addOptions(String a,String b) {
		// TODO Auto-generated method stub
		a.toLowerCase();
		b.toLowerCase();
		if (a.equals("y") || a.equals("yes") ) {this.extraShot = true;}
		if (b.equals("y") || b.equals("yes") ) {this.macchiato = true;}	
	}
	
	@Override
	public void printOptions() {
		// TODO Auto-generated method stub
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.println("Item: \t" + this.name + "\t Price: "+ df.format(this.price) + "\t Qty:" + this.quantity +  "\t Subtotal: " + df.format(calculateProductTotal()));
		System.out.print("\tExtra Shot: "); 
		if (this.extraShot == true) {System.out.print("Yes (Add $2)");} else{System.out.print("No");}
		System.out.print("\t Macchiato: ");
		if (this.macchiato == true) {System.out.print("Yes (Add $1)\n");}else{System.out.print("No\n");}
	}

}
