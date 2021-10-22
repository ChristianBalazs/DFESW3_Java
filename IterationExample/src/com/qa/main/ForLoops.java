package com.qa.main;

public class ForLoops {

	// to be completed by reviewing the video recordings
	
	
	
	public static void countDownFromTen() {
		
		for(int i =10; i >= 0; i--) {
			System.out.println("The value of i is: " + i);
		}
	}
	
	
	public static void countInFours() {
		
		for(int i =5;  i< 123; i+=4) {
			System.out.println("Value of i is "+ i);
		}
		
	}
	
	
	public static void countWithParams(int x, int y, int z) {
		
		for (int i = x; i< y; i+=z ) {
			System.out.println("Value of i is "+ i);
		}
	}
	
	
}
