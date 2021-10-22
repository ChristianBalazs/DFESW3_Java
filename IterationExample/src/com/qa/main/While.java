package com.qa.main;

public class While {

	// Iteration allows you to repeat lots of code
	// UNTIL a specific condition is met 
	
	
	// In Java - 4 basic types of loop
	
	// While    - Run until a boolean condition is met
	// Do While - RUns once first THEN checks the boolean condition 
	
	
	// For Loop - run a predetermined(numerically) amount of iterations
	
	// Switch   - In between conditionals and loops, replaces a nesting if else statement
	
	
	// if you know how long the loop should run -> For loop
	// otherwise -> while/do while loop
	
	
	public static void basicDemo() {
		
		System.out.println("Loop about to start");
		
		int counter = 0;
		
		// While is the command word
		// Next is the query (same as if statement)
		
		while(counter < 20){
			System.out.println("Counter value: " + counter); //combining a string and an integer
			//counter ++; // increment counter by 1
			counter +=2; // increment by 2
			// counter --; //decrement counter by 1
			// counter -=2; // decrement by 2
		}
		
		System.out.println("Loop has ended");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
