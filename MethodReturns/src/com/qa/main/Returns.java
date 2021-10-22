package com.qa.main;

public class Returns {

	// Methods run blocks of repeatable code
	// Methods run the code until either
		// the body ends, or
		// the method RETURNS something
	
	
	// void = returns nothing
	// in Java you need to specify the data type output for that method
	
	public static void printHello() {
		System.out.println("Hello");
	}
	
	public static String returnHello() {
		return "Hello there";
	}
	
	public static int returnNum() {
		return 123;
	}
	
}
