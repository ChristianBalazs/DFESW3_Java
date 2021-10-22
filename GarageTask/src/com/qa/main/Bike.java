package com.qa.main;

public class Bike extends Vehicles {

	
	//Fields:	
	private int noOfSpeeds;
	private boolean hasLights;
	
	
	
	//Constructor:	
	public Bike(String colour, int noOfSeats, boolean isAirbourne, int noOfSpeeds, boolean hasLights) {
		super(colour, noOfSeats, isAirbourne);
		this.noOfSpeeds = noOfSpeeds;
		this.hasLights = hasLights;
	}


	//Getters and Setters:
	public int getNoOfSpeeds() {
		return noOfSpeeds;
	}


	public void setNoOfSpeeds(int noOfSpeeds) {
		this.noOfSpeeds = noOfSpeeds;
	}


	public boolean isHasLights() {
		return hasLights;
	}


	public void setHasLights(boolean hasLights) {
		this.hasLights = hasLights;
	}


	@Override
	public String toString() {
		return "Bike [noOfSpeeds=" + noOfSpeeds + ", hasLights=" + hasLights + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
	
	
}
