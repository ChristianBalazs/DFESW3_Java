package com.qa.main;

// new framework imported here 
import java.util.Random;


public class MethodStack {

	
	// This Method will return a number to main
	public static int firstLayer() {
		System.out.println("first layer called");
		int result = secondLayer();
		System.out.println("first layer finished");
		return result;
		
	}
	
	
	
	// This method will provide a random number for firstLayer to use
	public static int secondLayer() {
		
		// new Random().nextInt(x) will return a random number between 0 and "x-1"
		int result = new Random().nextInt(8);
		return result;
		
	}
	
	
	
	
}
