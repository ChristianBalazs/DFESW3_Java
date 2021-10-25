package com.qa.main;

public class Runner {

	public static void main(String[] args) {
		
		//String[] = a list of string elements
		String x = args[0];
		String y = args[1];
		
		
		int num1 = Integer.parseInt(x);
		int num2 = Integer.parseInt(y);
		
		
		System.out.println("Hello World from jar file! ");
		
		System.out.println("The result is:  ");
		
		mathOperations.addMethod(num1, num2);
		
		
		
	}

}
