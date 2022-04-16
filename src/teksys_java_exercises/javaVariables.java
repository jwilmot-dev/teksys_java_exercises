package teksys_java_exercises;

public class javaVariables {

public static void main(String[] args) {
		
		//#1
		int intA = 2;
		int intB = 3;
		int intTotal = intA + intB;
		System.out.println(intTotal);
		
		
		//#2
		double doubleA = 1.25;
		double doubleB = 1.5;
		double doubleTotal = doubleA + doubleB;
		System.out.println(doubleTotal);
		
		
		//#3
		int intC = 4;
		double doubleC = 5.5;
		double mixedTotal = intC + doubleC;
		System.out.println(mixedTotal);
		//variable type must be double
		
		
		//#4
		int intD = 6;
		int intE = 3;
		int divTotal = intD/intE;
		System.out.println(divTotal);
		//changing the int value to a decimal will throw an error
		//would need to change datatype to double and divTotal to double
		
		
		//#5
		double doubleD = 2.5;
		double doubleE = 1.75;
		double doubleDivTotal = doubleD/doubleE;
		System.out.println(doubleDivTotal);
		
		//#6
//		int x = 5;
//		int y = 6;
//		int q = x/y;
//		System.out.println(q);
		
		int x = 5;
		int y = 6;
		double q = x/(double)y;
		System.out.println(q);
		
		//#7
		final int CONST_INT = 7;
		double constTotal = 9*CONST_INT;
		System.out.println(constTotal);
		
		//#8
		double coffee = 3.75;
		double tea = 2.50;
		double juice = 3.00;
		double subtotal;
		double totalSale;
		final double SALES_TAX = .793;
 		
		subtotal = coffee*3+tea*4+juice*2;
		totalSale = (subtotal*SALES_TAX) + subtotal;
		System.out.println("Your Total is $" + String.format("%.2f", totalSale));
		
		
		
		
		
	

	}




}
