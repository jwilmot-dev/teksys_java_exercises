package com.perscholas.cafe;
import java.io.*;
import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CafeApp {
	
	
	private static final String ANSI_RED = "\u001B[31m";
	private static final String ANSI_RESET = "\u001B[0m";

	public static void menu() {
		System.out.println("Please select from the following menu:");
		System.out.println(ANSI_RED +"1" + ANSI_RESET + ": Coffee");
		System.out.println(ANSI_RED +"2" + ANSI_RESET + ": Cappuccino");
		System.out.println("3: Espresso");
		System.out.println("4: Check Out");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Product coffee = new Product();
//		Product espresso = new Product();
//		Product cappuccino = new Product();
		
//		coffee.setName("coffee");
//		coffee.setDescription("Dark Roast");
//		coffee.setPrice(2.75);
//		
//		espresso.setName("espresso");
//		espresso.setDescription("Double Shot");
//		espresso.setPrice(4.25);
//		
//		cappuccino.setName("cappucino");
//		cappuccino.setDescription("Soy milk");
//		cappuccino.setPrice(5.50);
//		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("how many coffees would you like? ");
//		int temp1 = scan.nextInt();
//		coffee.setQuantity(temp1);
//		
//		System.out.println("how many espressos would you like? ");
//		int temp2 = scan.nextInt();
//		espresso.setQuantity(temp2);
//		
//		System.out.println("how many cappuccino would you like? ");
//		int temp3 = scan.nextInt();
//		cappuccino.setQuantity(temp3);
//		
//		coffee.calculateProductTotal();
//		System.out.println();
//		espresso.calculateProductTotal();
//		System.out.println();
//		cappuccino.calculateProductTotal();
		
//		Coffee coffee = new Coffee();
//		Espresso espresso = new Espresso();
//		Cappuccino cappuccino = new Cappuccino();
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("how many coffees would you like? ");
//		int temp1 = scan.nextInt();
//		coffee.setQuantity(temp1);
//		
//		System.out.println("how many espressos would you like? ");
//		int temp2 = scan.nextInt();
//		espresso.setQuantity(temp2);
		
//		System.out.println("how many cappuccino would you like? ");
//		int temp3 = scan.nextInt();
//		cappuccino.setQuantity(temp3);
//		cappuccino.printOptions();
//		cappuccino.setPeppermint(true);
		
//		coffee.calculateProductTotal();
//		System.out.println();
//		espresso.calculateProductTotal();
//		System.out.println();
//		cappuccino.printOptions();
		ShoppingCart sc = new ShoppingCart();
		boolean flag = true;
		Scanner scan = new Scanner(System.in);
		int counter = 1;
		String name;
		while(flag == true) {
			menu();
			int choice = scan.nextInt();
			switch(choice) {
			case 1:  
				Coffee  coffee = new Coffee();
				coffee.setQuantity(1);
				scan.nextLine();
				System.out.print("Would you like sugar?");
				String ans = scan.nextLine().toLowerCase();
				System.out.print("Would you like milk?");
				String ans1 = scan.nextLine().toLowerCase();
				coffee.addOptions(ans, ans1);
			
				sc.addToCart(coffee);
				System.out.println();
				break;
				
			case 2:
				Cappuccino  cappuccino = new Cappuccino();
				cappuccino.setQuantity(1);
				scan.nextLine();
				System.out.print("Would you like peppermint?");
				String ans2 = scan.nextLine().toLowerCase();
				System.out.print("Would you like whipped cream?");
				String ans3 = scan.nextLine().toLowerCase();
				cappuccino.addOptions(ans2,  ans3);
				System.out.println();
				sc.addToCart(cappuccino);
				break;
				
			case 3:
				Espresso  espresso = new Espresso();
				espresso.setQuantity(1);
				scan.nextLine();
				System.out.print("Would you like an extra shot?");
				String ans4 = scan.nextLine().toLowerCase();
				System.out.print("Would you like a macchiato?");
				String ans5 = scan.nextLine().toLowerCase();
				espresso.addOptions(ans4,  ans5);
				System.out.println();
				sc.addToCart(espresso);
				break;
				
			case 4:
				System.out.println();
				System.out.println("Proceed to checkout.");
				System.out.println();
				flag = false;
				break;
			
			}
		}
		scan.close();
//		sc.printOptions();
		Store store = new Store(sc);
		store.checkout();
		
		
	}

}
