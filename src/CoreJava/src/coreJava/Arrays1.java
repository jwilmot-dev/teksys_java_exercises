package coreJava;

import java.util.Arrays;

public class Arrays1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//#1
		System.out.println("#1");
		System.out.println("------");
		program1();
		System.out.println("------");
		System.out.println();
		
		//#2
		System.out.println("#2");
		System.out.println("---");
		program2();
		System.out.println("---");
		System.out.println();
		
		//#3
		System.out.println("#3");
		System.out.println("------------------");
		program3();
		System.out.println("------------------");
		System.out.println();
		
		//#4
		System.out.println("#4");
		System.out.println("-------------------------------");
		program4();
		System.out.println("-------------------------------");
		System.out.println();
		
		//#5
		System.out.println("#5");
		System.out.println("---------------");
		program5();
		System.out.println("---------------");
		System.out.println();
		
		//#6
		System.out.println("#6");
		System.out.println("---------------");
		program6();
		System.out.println("---------------");
		System.out.println();
		
		//#7
		System.out.println("#7");
		System.out.println("-------------------------");
		program7();
		System.out.println("-------------------------");
		System.out.println();
		
		//#8
		System.out.println("#8");
		System.out.println("-------------------------------------");
		program8();
		System.out.println("-------------------------------------");
		System.out.println();
		
		//#9
		System.out.println("#9");
		System.out.println("---------------------------------------------");
		program9();
		System.out.println("---------------------------------------------");
		System.out.println();
		
		//#10
		System.out.println("#10");
		System.out.println("------------------------------");
		program10();
		System.out.println("------------------------------");
		System.out.println();

	}
	public static void program1() {
		int[]arr = new int[3];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void program2() {
		int[] arr = {13,5,7,68,2};
		System.out.print(arr[arr.length/2]);
		System.out.println();
	}
	
	public static void program3() {
		String[] arr = {"red", "green", "blue", "yellow"};
		System.out.println("Array length: " + arr.length);
		String[] copy = arr.clone();
		System.out.println(Arrays.toString(copy));
	}
	
	public static void program4() {
		int[]arr = {7,4,9,2,3};
		System.out.println("first index: " + arr[0] + " , last index: " + arr[arr.length -1]);
		//System.out.println("first index: " + arr[0] + " , last index: " + arr[arr.length]);
		//arr[5] = 5;
	}
	
	public static void program5() {
		int[]arr = new int[5];
		for(int i = 0; i<arr.length; i++) {
			arr[i] = i;
		}
		System.out.println(Arrays.toString(arr));
	}
	
	public static void program6() {
		int[]arr = new int[5];
		for(int i = 0; i<arr.length; i++) {
			arr[i] = i*2;
		}
		System.out.println(Arrays.toString(arr));
		
	}
	public static void program7() {
		String[]arr = {"first", "second", "third", "fourth", "fifth"};
		for(int i = 0; i<arr.length; i++) {
			if(i!=arr.length/2) {System.out.print(arr[i] + " ");}
		}
		System.out.println();
	}
	
	public static void program8() {
		String[]arr = {"first", "second", "third", "fourth", "fifth"};
		System.out.println(Arrays.toString(arr));
		String temp = arr[0];
		arr[0] = arr[2];
		arr[2] = temp;
		System.out.println(Arrays.toString(arr));
	}
	
	public static void program9() {
		int[]arr = {4,2,9,13,1,0};
		Arrays.sort(arr);
		System.out.println("Array in ascending order: " + Arrays.toString(arr));
		System.out.println("The smallest number is " + arr[0]);
		System.out.println("The biggest number is " + arr[arr.length-1]);
	}
	
	public static void program10() {
		Object[] arr = {4, "hello", "world", "party", 42.1};
		System.out.println(Arrays.toString(arr));
	}

}
