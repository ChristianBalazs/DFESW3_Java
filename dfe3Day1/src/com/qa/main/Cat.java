package com.qa.main;

public class Cat {

	
	//First we need its attributes, like: 
	
	int age = 8; // will have default value of 0	
	boolean isHairShort = true;	
	String hairColour = "Ginger";	
	String favouriteFood;
	
	
	//Second we have the Methods - CAN DOS:
	
	public void scratch() {
		System.out.println("I scwatch");
	}
	
	
	public int catDoesMath(int a, int b) {
		int z = a + b;
		System.out.println(z);
		return z;
	}
	
	
	
	public String kitCat() {
		if (age > 10) {
			favouriteFood = "Potatoes";
		} else {
			favouriteFood = "Chips";
		}
		
		return favouriteFood;
	}
	
	
	//CONSTRUCTORS
	
	public Cat(int age, boolean isHairShort, String hairColour, String favouriteFood){	
		this.age = age;
		this.isHairShort = isHairShort;
		this.hairColour = hairColour;
		this.favouriteFood = favouriteFood;			
		
	}
	
	
	
	
	
}
