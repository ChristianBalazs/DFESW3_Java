package com.qa.main;

	//Exercise - Create an array of numbers 1 - 10
	// - Print out the number * 2 (times 2) ( 2 -> 4, 3 ->6)
	// - Print out the squared value of each of the numbers (2 -> 4, 3 -> 9)

	//Stretch goal - Do the same for the last exercise but in reverse, 
	//10th number in 2nd array will be 1st number squared

public class ArrayExec {

	public static void exerciseLoop() {
			
			int[] numbers = {1,2,3,4,5,6,7,8,9,10}; // set up numbers array
			int[] newNums = {0,0,0,0,0,0,0,0,0,0}; // set up newNums array
			
			
			// set up a for each loop for (){}		
			for(int num : numbers) { 
					
	//	System.out.println(numbers[i] * i);
	//	int num = numbers[i];
	//	System.out.println(num * i);
				
				System.out.println(num * 2);
				System.out.println("====================");
				System.out.println(num * num);
			}
			
			
			// set up a for loop for(i=0;i<number;i++){}
			for(int i = 0; i < numbers.length; i++) {
				
				int squaredValue = numbers[i] * i;
				newNums[i] = squaredValue; // Setting the squared value on 2nd array
				
				int reverseNum = i + 1;
				newNums[newNums.length - reverseNum] = squaredValue;
				
			}
			
		}
	
	
}
