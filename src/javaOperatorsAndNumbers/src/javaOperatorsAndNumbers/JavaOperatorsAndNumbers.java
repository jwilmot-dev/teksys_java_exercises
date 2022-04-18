package javaOperatorsAndNumbers;

public class JavaOperatorsAndNumbers {

	public static void main(String[] args) {


		//#1
		//  DECIMAL			BINARY
		//	1				0001
		//	8				1000
		//	33				0010 0001
		//	78				0100 1110
		//	787				0011 0001 0011
		//	33987			1000 0100 1100 0011
		
		
		//#2
		//	BINARY					DECIMAL
		//	0010					2
		//	1001					9
		//	0011 0100				52
		//	0111 0010				114					
		//	0010 0001 1111			543			
		//	0010 1100 0110 0111		11367
		
		
		//#3
		System.out.println("=======");
		System.out.println("#3");
		System.out.println("=======");
		int x = 2;
		System.out.println(Integer.toBinaryString(x));
		
		x = x << 1;
		//Predict decimal = 4, Binary = 0100
		System.out.println("Decimal: " + x);
		System.out.println("Binary: " + Integer.toBinaryString(x));
		
		x = 9 << 1;
		//Predict decimal = 18, Binary = 0001 0010
		System.out.println("Decimal: " + x);
		System.out.println("Binary: " + Integer.toBinaryString(x));
		
		x = 17 << 1;
		//Predict decimal = 34, Binary = 0010 0010
		System.out.println("Decimal: " + x);
		System.out.println("Binary: " + Integer.toBinaryString(x));
		
		x = 88 << 1;
		//Predict decimal = 176, Binary =  1011 0000
		System.out.println("Decimal: " + x);
		System.out.println("Binary: " + Integer.toBinaryString(x));
		System.out.println("=======================");
		System.out.println();
	
		
		//#4
		System.out.println("=======");
		System.out.println("#4");
		System.out.println("=======");
		x=150;
		System.out.println(Integer.toBinaryString(x));
		
		x = x >> 2;
		//Predict decimal = 37, Binary = 0010 0101
		System.out.println("Decimal: " + x);
		System.out.println("Binary: " + Integer.toBinaryString(x));
		
		x = 225 >> 2;
		//Predict decimal = 56, Binary = 0011 1000
		System.out.println("Decimal: " + x);
		System.out.println("Binary: " + Integer.toBinaryString(x));
		
		x = 1555 >> 2;
		//Predict decimal = 388, Binary = 0011 1000 0100
		System.out.println("Decimal: " + x);
		System.out.println("Binary: " + Integer.toBinaryString(x));
		
		x = 32456 >> 2;
		//Predict decimal = 8114, Binary = 0001 1111 1011 0010
		System.out.println("Decimal: " + x);
		System.out.println("Binary: " + Integer.toBinaryString(x));
		System.out.println("=======================");
		System.out.println();
		
		
		//#5
		System.out.println("=======");
		System.out.println("#5");
		System.out.println("=======");
		x = 7;
		int y = 17;
		int z;
		//Predict bitwise & = 1 
		z = (x & y);
		System.out.println("Decimal: " + z);
		System.out.println("Binary: " + Integer.toBinaryString(z));
		//Predict bitwise | = 23 
		z = (x | y);
		System.out.println("Decimal: " + z);
		System.out.println("Binary: " + Integer.toBinaryString(z));
		System.out.println("=======================");
		System.out.println();
		
		
		//#6
		System.out.println("=======");
		System.out.println("#6");
		System.out.println("=======");
		x = 8;
		System.out.println("Before: " + x);
		x++;
		System.out.println("After: " + x);
		System.out.println("=======================");
		System.out.println();
		
		
		//#7
		System.out.println("=======");
		System.out.println("#7");
		System.out.println("=======");
		x = 4;
		System.out.println("Starting: " + x);
		x++;
		System.out.println("After x++: " + x);
		++x;
		System.out.println("After ++x: " + x);
		x+=1;
		System.out.println("After x+=1: " + x);
		System.out.println("=======================");
		System.out.println();
		
		//#8
		System.out.println("=======");
		System.out.println("#8");
		System.out.println("=======");
		x = 5;
		y = 8;
		int sum = ++x + y;
		System.out.println("Sum ++x + y: " + sum);
		x = 5;
		y = 8;
		sum = x++ + y;
		System.out.println("Sum x++ + y: " + sum);
		System.out.println("=======================");
		
		
	}

}
