package com.qa.main;


​public class DfEExercise1 {
	 
		public static void main(String[] args) {
	 
			boolean amIHappy = false; // A boolean names amIHAppy is being declared and assigned false
	 
			int weight = 20; //integer named weight with value 20
			
			String name = "Billy Bob"; // string type named name with value "Billy Bob"
			
			Dog goodBoy = new Dog(name, weight); // create a new instance/object inside Dog class 
			
			int x = weight - 10; // created integer x with value = weight (20) - 10 which equals 10
			
			if (x < 15) {
				goodBoy.bark(); // if statement - if x smaller than 15 execute goodBoy.bark() function
			}
	 
			while (x < 3) { //while loop - while x smaller than 3
				goodBoy.play(); // execute goodBoy.play() function
			}
	 
			int[] numList = {1,2,3,4,5,6}; // create an array [] named numList and assign a list of numbers
			System.out.println("How are you"); //print out "How are you" text
			System.out.println("My " + name + " is doing great"
					+ " how's yours"); //print out statement which include name variable
			String num = "305"; // create a string called num and assign "305" as text rather than number
			int z = Integer.parseInt(num); // create an integer called z and assign the integer value (covert to integer) of the num string 
	 
	 
	 
		}
	 
	 
		}





