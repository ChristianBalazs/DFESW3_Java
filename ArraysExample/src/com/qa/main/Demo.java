package com.qa.main;

public class Demo {

	// Arrays within Java are collections of data
	// Arrays can only contain one type of data type ; strings, int, booleans, objects
	// Arrays are immutable - can't be changed once they're created
	// You can change the VALUES but you can;t change the data types or the lenght
	
	// Arrays are strings
	// Arrays lists are objects
	
	public static void arrayDemo() {
		
		//When creating arrays you need to use [] to denote it's an array
		// Curly {} brackets surrounding values, commas separating values
		
		// String is a array of char's
		// Array list 
		
		String colour = "Red";
		
		String[] colourList = {"Blue", "Purple", "Teal", "Yellow"};
		
		System.out.println(colour);
		System.out.println(colourList);// will print memory location of the Array - don't know why
		
		System.out.println("===========");
		System.out.println(colourList[1]); // will print item at index position 1
		
		System.out.println("=======");
		
		// For loop to access our colours
		// Use for loops to print all items inside the array
		// For loops - best way to return items from the array
		
		
		for(int i = 0; i < colourList.length; i++) {
			System.out.println(colourList[i]);
		}
		
		System.out.println(" ");
		
		// How to manipulate our values
		// colourList[1] = "Purple"
		
		colourList[1]= "Moave";
		
		System.out.println(colourList[1]);		
		
		
	}
	
	
	// Exercises here
	
	// Exercise - Create an array of numbers 1 - 10

	// - Print out the number * 2 (times 2) ( 2 -> 4, 3 ->6)

	// - Print out the squared value of each of the numbers (2 -> 4, 3 -> 9)
	

	
	public static void arrayExec1(){
		
		int[] newArray= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		int[] Array1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
		
		
		// Print the number *2
		
		for (int i = 0; i < newArray.length; i++) {
			System.out.println(newArray[i] * 2);
		}
		
		
		// Solution with for each loop 
		System.out.println("print array with for each loop");
		for (int num : newArray) {
			System.out.println(num*2);
		} 
		
		
		System.out.println("=======");
		
		// Print the squared value		
		for (int i = 0; i < newArray.length; i++) {
			System.out.println(newArray[i] * newArray[i]);
		}
		
		
		
		// Change the Array1
		
		for (int i = 0; i < newArray.length; i++) {
			Array1[i] = newArray[i]*newArray[i];			
		}
		
		System.out.println("New Array1 value here:");
		
		//print the changed Array1
		for (int i = 0; i < Array1.length; i++) {
			System.out.println(Array1[i]);
		} 
		
		//Stretch goal - Do the same for the last exercise but in reverse, 
		//10th number in 2nd array will be 1st number squared
		
		
		// not working
		for (int i = 0; i < Array1.length; i++) {
			int len = Array1.length-1;
			Array1[i] = Array1[len];
			len = len - 1;
			System.out.println(Array1[i]);
			
		}
		
		
	}



	
	// - Have a second array created with 10 numbers 1,1,1,1,1.. 
	// when you square the number from the first array, 
	// modify the 2nd array to have the squared number
	
	

	
	
	
	//Continue lesson
	
	public static String[] colourList = {"Blue", "Purple", "Teal", "Yellow"};
	
	public static void forEachLoop() {
		
		// For each String in the array  colourList
		// create a temp variable called newColour that is equal to it
		
		for (String newColour : colourList) {
			System.out.println(newColour);
		}
		
	}
	
	
	
}
