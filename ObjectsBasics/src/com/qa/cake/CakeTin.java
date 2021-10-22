package com.qa.cake;

public class CakeTin {

	// Fields- attributes to describe the objects
	
	// Set up variables outside of methods
	public String flavour;
	public int size;
	public boolean glutenFree;
	public String colour;
	
	// static statement
	public static int cakesBaked;
	
	//static methods (Accessed via the class)
	public static void numberOfBakedCakes() {
		System.out.println("Cakes baked: " + cakesBaked);
	}
	
	
	// Methods - functions that the object can do
	
	// Need to remove static from eatCake() method
	// so it can be accessed by each object 
	public void eatCake() {
		System.out.println("Cake was delicious!");
		
	}
	
	
	
	// Constructors - are "methods" to create objects from a class
	// Constructors have NO RETURN (doesn't mean void, mean no return)
	
	//Constructors name MUST BE THE CLASS NAME EXACTLY
	
	public CakeTin() {
		flavour = "Vanilla";
		size = 12;
		glutenFree = true;
		colour = "Beige";
	}
	
	
	
	// From Runner be able to create any values of that object
	
	public CakeTin(String flavour, int size, boolean glutenFree, String colour) {
		this.flavour = flavour;
		this.size = size;
		this.glutenFree= glutenFree;
		this.colour = colour;
		//this. - when creating THIS object 
	}
	

	
	
}
