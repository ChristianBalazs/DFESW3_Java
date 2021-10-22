package com.qa.bird;


// When making a child class we need to specify ehat is the parent class
// use "extends ParentClass" word when parent class is inside the same package



public class FlightLessBirds extends Bird {


		//Fields
	
	private String habitat;
	private int landSpeed;
	
	//Method
	public void attemptToFly() {
		System.out.println("*Smacks face on ground*");
	}
	
	@Override // Good practice - let other develpers know you are ovveriding a method
	public void makeNoise() {
		System.out.println("Stomping feet");
	}

	
	//Getters and Setters
	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	public int getLandSpeed() {
		return landSpeed;
	}

	public void setLandSpeed(int landSpeed) {
		this.landSpeed = landSpeed;
	}

	
	
	// Constructor with inherited fields 
	
	public FlightLessBirds(String featherColour, int wingSpan, boolean migratory, String habitat, int landSpeed) {
		super(featherColour, wingSpan, migratory);
		this.habitat = habitat;
		this.landSpeed = landSpeed;
	}	
	
	
	
	
	
}
