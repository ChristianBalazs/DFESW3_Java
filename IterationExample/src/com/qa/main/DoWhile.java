package com.qa.main;

public class DoWhile {

	public static void basicExample(){
		
		boolean testBool = true;
		
		System.out.println("Before the Loop");
		
		// while(testBool == false)
		while (!testBool) {
			System.out.println("Will this ever print??");
		}
		
		System.out.println("After Loop");
		
		
	
	
	// Do While - will always run Once before checking the code
	
	
	do {
		System.out.println("Printed from do-while loop");
	} while (!testBool);
	
	
	}
	
}
