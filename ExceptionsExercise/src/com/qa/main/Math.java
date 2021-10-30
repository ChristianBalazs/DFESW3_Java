package com.qa.main;


public class Math {
	
	public static int divCheck(int a, int b) {
		
		try {
		
		return a / b;
		
		}
		catch(Exception e) {
			
			e.printStackTrace();
			System.out.println("Don't divide by zero");
		}
		return 0;
			
			
	}
	
	

}
