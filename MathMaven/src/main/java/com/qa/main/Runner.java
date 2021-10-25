package com.qa.main;

public class Runner {

	public static void main(String[] args ) {
		// TODO Auto-generated method stub
		
		System.out.println("Doing maths operations here");
		
		int num1 = Integer.parseInt(args[0]); 
		
		int num2 = Integer.parseInt(args[1]);	
		
		Operations.addOp(num1, num2);
		
		
		

	}

}
