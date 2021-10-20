package com.qa.main;

public class ifStatements {

	// Conditionals are used when developers want code to have multiple outcomes
	
	// If a variable is a certain value
	// do thing
	// else do other thing
	
	
	public static void conditionalDemo() {
		
		// Java uses if else statements (like every programming/scripting language)
		// computing/programming is binary true/false
		
		boolean isKettleOn = true;
		isKettleOn = false;
		
		// if is the command word
		// next to if within () is the statement
		// = - assignment 
		// == - comparison (checking the value)
		
		if (isKettleOn == true) {
			// is the body 
			// what the code does if the if statement is true 
			
			System.out.println("I'll take milk no sugar :)");
			
		}//else if (isKettleOn == false) {
		 //	System.out.println("Pop the kettle on!");
		
		else {
			System.out.println("Pop the kettle on!");
		}
		
		
		
		boolean binsOut = true;
		// if(binsOut) - can be used without = sign only when working with boolean
		if(binsOut) {
			System.out.println("Bins are out!");
		} else {
			System.out.println("Bins were forgotten !");}
		
		
		
		//Conditional Operators
		
		// == - comparison
		// > - greater than
		// < - less than
		// <= - less than OR equal
		// >= - greater than OR equal
		// || - OR
		// && - AND
		// != - not equals
		
		
		
		int num1 = 9;
		
		if (num1 > 10) {
			System.out.println("Greater than 10");
		} else if (num1 == 10) {
			System.out.println("Equal to 10");
		} else {
			System.out.println("Lower than 10");
		}
		
		
		// Flowchart exercise from QA Community
		
		int numA = 4000;
		
		if (numA > 2000) {
			System.out.println("A");
			if (numA > 6000) {
				System.out.println("C");
			}else if (numA < 6000) {
				System.out.println("B");
				if (numA > 4000) {
					System.out.println("D");
				}else {
					System.out.println("E");
				} 
			}
			
		}else if (numA < 2000) {
			System.out.println("1");
			if (numA > 100) {
				System.out.println("3");
				if (numA > 600) {
					System.out.println("5");
				}else {
					System.out.println("4");
					if (numA>500) {
						System.out.println("6");
					}else {
						System.out.println("7");
					}
				}
				
			}else {
				System.out.println("2");
			}
		}
		
			
			
			
		
		
	}
	
	
	// Always end an if block either with
	// else
	// return (outside of the block)
	
	
	public static String numberStatement() {
		
		int x = 12;
		
		if(x>10) {
			return "greater than 10";
		} else if(x==10) {
			return "equal to 10";
		}else {
			return "less than 10";
		}		
				
	}
	
	// Nested if statements
	
	public static void complexStatement() {
		
		boolean bool = true;
		String colour = "red";
		
		
		if (bool == true || colour == "red") {
			System.out.println("bool is true OR colour is red");
			
			if (bool==true && colour =="red") {
				System.out.println("bool is true AND colour is red");
			}else if (bool == true) {
				System.out.println("bool is true");
			}else if (colour=="red") {
				System.out.println("colour is red");
			}

		}
				
		
		
		
	}
	
	
}
