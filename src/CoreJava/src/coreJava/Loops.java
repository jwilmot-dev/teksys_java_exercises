package coreJava;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//#1
		System.out.println("#1");
		System.out.println("--------------------");
		problem1();
		System.out.println("--------------------");
		System.out.println();
		
		//#2
		System.out.println("#2");
		System.out.println("--------------------------------");
		problem2();
		System.out.println("--------------------------------");
		System.out.println();
		
		//#3
		System.out.println("#3");
		System.out.println("--------------------");
		problem3();
		System.out.println("--------------------");
		System.out.println();
		
		//#4
		System.out.println("#4");
		System.out.println("--------------------------");
		problem4();
		System.out.println("--------------------------");
		System.out.println();
		
		//#5
		System.out.println("#5");
		System.out.println("----------------------------");
		problem5();
		System.out.println("----------------------------");
		System.out.println();
		
		//#6
		System.out.println("#6");
		System.out.println("---------");
		problem6();
		System.out.println("---------");
		System.out.println();
		
		//#7
		System.out.println("#7");
		System.out.println("-------------------------------------------------------------------");
		problem7();
		System.out.println("-------------------------------------------------------------------");
		System.out.println();
		
		//#8
		System.out.println("#8");
		System.out.println("-------------------");
		problem8();
		System.out.println("-------------------");
		System.out.println();
		
		//#9
		System.out.println("#9");
		System.out.println("----------------------");
		problem9();
		System.out.println("----------------------");
		System.out.println();

	}
	public static void problem1() {
		for(int i=1; i<=10; i++) {
			System.out.print(i + " ");
		}
		System.out.println();	
	}
	
	public static void problem2(){
		int num = 0;
		while(num<=100) {
			System.out.print(num + " ");
			num+=10;
		}
		System.out.println();
	}
	
	public static void problem3() {
		int num = 1;
		do {
			System.out.print(num + " ");
			num++;
			}while(num <=10);
		System.out.println();
	}
	
	public static void problem4() {
		for(int i=1; i<=100; i++) {
			if(i>=25 && i<=75) {
				continue;
			}else if(i%5==0) {
				System.out.print(i+ " ");
			}
		}
		System.out.println();
	}
	
	public static void problem5() {
		for(int i=1; i<=100; i++) {
			if(i>50) {
				break;
			}else if(i%5==0) {
				System.out.print(i+ " ");
			}
		}
		System.out.println();
	}
	
	public static void problem6() {
		for(int i = 1; i < 3; i++) {
			System.out.println("Week "+ i +":");
			for(int j = 1; j<6; j++) {
				System.out.println("Day "+ j);
			}
		}
	}
	
	public static void problem7() {
		for(int i = 10; i<=200; i++) {
			  int n = i;
			  int rev = 0; // reversed number
		      int rem;   // remainder
		        
		      while(n>0){
		           
		        rem = n%10;
		        rev = (rev*10) + rem;
		        n = n/10;
		      }
		      if(i == rev) {System.out.print(i + ",");}
		}
		System.out.println();
	}
	
	public static void problem8() {
		int a = 0;
		int b = 1;
		int c = a+b;
		while (c <= 50) {
			System.out.print(c +",");
			a = b;
			b = c;
			c = a+b;
		}
		System.out.println();
	}
	
	public static void problem9() {
		for(int i= 1; i<5; i++) {
			for(int j = 1; j<5; j++) {
				System.out.println("Inner loop: i: " + i + " ,j: " +j);
			}
		}
		
	}
	
}
