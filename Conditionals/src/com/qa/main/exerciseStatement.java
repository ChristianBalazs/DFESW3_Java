package com.qa.main;

public class exerciseStatement {

	// Given 2 integer values greater than 0, 
	// return whichever is closest to 21 without going over 21.
	// If they both go over 21 then return 0.
	
	
	public static int blackJack(int num1, int num2) {
		
		int result = 0;	
		
		if(num1 > 21 && num2> 21) {
			return result;
		}
		
		if(num1 > num2 && num1 <=21 ) {
			return num1;
		}else if (num1 > num2 && num1 > 21) {
			return num2;
		}
		
		if(num1 < num2 && num2 <=21) {
			return num2;
		}else if (num1 < num2 && num2 > 21) {
			return num1;
		}
		
		if(num1 > 21 && num2> 21) {
			return result;
		}
			
		return 0;
					
	}
	
	
	// Unique Sum
	// Given 3 integer values, return their sum. 
	// If one value is the same as another value, 
	// they do not count towards the sum. 
	// In other words, only return the sum of unique numbers given.
	
	
	public static int uniqueSum() {
		
		int num1 = 1;
		int num2 = 2;
		int num3 = 2;
		
		int sum = 0;
		
		if (num1 == num2 && num2 == num3) {
			return sum;
		} else if (num1 == num2 && num2 != num3) {
			return num3;
		}
		
				
		if (num1 != num2 && num1 != num3) {
			return num1+num2+num3; 
		} else if (num1 != num2 && num2 == num3) {
			return num1;
		}
		
		if (num2 == num1 && num1 == num3 ) {
			return sum;
		}else if(num2 == num1 && num1 != num3) {
			return num3;
		}
		
		if (num2 != num1 && num1 == num3) {
			return num2;
		}else if (num2 != num1 && num2 != num3) {
			return num1+num2+num3;
		}
									
		return 0;
		
	}
	
	
	
	// Another try with uniqueSum2() - work in progress
	
	public static int uniqueSum2() {
		
		int num1 = 1;
		int num2 = 2;
		int num3 = 2;
		int result = 0;
		
		if (num1 == num2) {
			if (num1 == num3) {
				return result;
			}else if (num1 != num3) {
				return num3;
			}
		}
		
		
		if (num1 != num2 ) {
			if (num1 == num3) {
				return num2;
			}else if (num1 != num3) {
				return num1+num2+num3;
			}else if (num2 == num3) {
				return num1; 
			}
		}
		
		
		
		
		
		return 0;
			
		
		
		
		
	}
	
	
	
	
	
	
}
