package com.qa.main;

import java.util.Scanner;  // Import the Scanner class


class Main {
	
  public static void main(String[] args) {
	  
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter num1: ");    
    Integer num1 = myObj.nextInt();  // Read user input      
    System.out.println("Enter num2: ");
    Integer num2 = myObj.nextInt();  // Read the second user input
    
    System.out.println("num1 is: " + num1 + " and num2 is: " + num2);  // Output user input
    
    Math.divCheck(num1, num2);  
    
    

    
    
    
    
  }
  
}

