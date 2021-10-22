package com.qa.main;

public class WhileExercise {

	
	public static void execMethod() {
		
		int counter = 300;
		
		while (counter > 87) {
			
			System.out.println("Your balance is: " + counter);
			counter = counter - 45;
		}
		
		System.out.println("You're spending too much money");
	}
	
	
	
	public static void doWhile() {
		
		int counter = 300;
		
		do {
			System.out.println("You still have money");
			counter = counter - 45;
					
		}while (counter < 200);
		
	}
	
	
	
	
}
