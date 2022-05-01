package coreJava;

import java.util.Scanner;

public class ControlFlow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//#1
		System.out.println("#1");
		System.out.println("-------------------");
		//where x = 7
		System.out.println("x = 7");
		problem1(7);
		System.out.println();
		//where x = 15
		System.out.println("x = 15");
		problem1(15);
		System.out.println("-------------------");
		System.out.println();
		
		//#2
		System.out.println("#2");
		System.out.println("-------------------");
		//where x = 7
		System.out.println("x = 7");
		problem2(7);
		System.out.println();		
		//where x = 15
		System.out.println("x = 15");
		problem2(15);
		System.out.println("-------------------");
		System.out.println();
		
		//#3
		System.out.println("#3");
		System.out.println("-------------------");
		//where x = 15
		System.out.println("x = 15");
		problem3(15);
		System.out.println();		
		//where x = 50
		System.out.println("x = 50");
		problem3(50);
		System.out.println("-------------------");
		System.out.println();
		
		//#4
		System.out.println("#4");
		System.out.println("-------------------");
		//where x = 15
		System.out.println("x = 15");
		problem4(15);
		System.out.println();		
		//where x = 5
		System.out.println("x = 5");
		problem4(5);
		System.out.println("-------------------");
		System.out.println();
		
		//#5
		System.out.println("#5");
		System.out.println("-------------------");
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number score: ");
		int score = scan.nextInt();
		problem5(score);
		System.out.println("-------------------");
		System.out.println();
//		scan.close();
		
		//#6
		System.out.println("#6");
		System.out.println("-------------------");
//		Scanner scan2 = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int num = scan.nextInt();
		problem6(num);
		System.out.println("-------------------");
		System.out.println();
		scan.close();	
		
	}
	
	public static void problem1(int input) {
		int x = input;
		if(x<10) {System.out.println("Less than 10");}
	}
	
	public static void problem2(int input) {
		int x = input;
		if(x < 10) {System.out.println("Less than 10");}
		else {System.out.println("Greater than 10");}
		
	}
	
	public static void problem3(int input) {
		int x = input;
		if(x < 10) {System.out.println("Less than 10");}
		else if(x>=10 && x<=20) {System.out.println("Between 10 and 20");}
		else {System.out.println("Greater than 20");}	
	}
	
	public static void problem4(int input) {
		int x = input;
		if(x < 10 || x > 20) {System.out.println("Out of range");}
		else {System.out.println("In range");}
			
	}
	
	public static void problem5(int score) {
		if(score < 0 || score > 100) {System.out.println("Out of range");}
		else if(score < 60) {System.out.println("Letter Grade: F");}
		else if(score < 70) {System.out.println("Letter Grade: D");}
		else if(score < 80) {System.out.println("Letter Grade: C");}
		else if(score < 90) {System.out.println("Letter Grade: B");}
		else {System.out.println("Letter Grade: A");}
	}
	
	public static void problem6(int num) {
		switch(num) {
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;
		default:
			System.out.println("Out of range");
		
		}
	}

}
