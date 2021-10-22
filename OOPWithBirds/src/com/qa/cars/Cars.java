package com.qa.cars;

public class Cars {

	//Exercise:
	
	//Task - Create a Parent class of any type (animal, car whatever) with atleast 3 fields and 1 simple method

	//- Create 2 child classes of that parent class with 2 specific fields and 1 extra method

	//- Create objects of the child classes and run the methods from your main method
	
	
	
	//Fields	
	private String color;
	private int HP;
	private boolean has4Wheels;
	
	
	//Method
	public void openDoor() {
		System.out.println("welcome on bord!");
		
	}


		//Constructor
	public Cars(String color, int hP, boolean has4Wheels) {
		super();
		this.color = color;
		HP = hP;
		this.has4Wheels = has4Wheels;
	}
	
	
	
	
		
		
	
	
}
