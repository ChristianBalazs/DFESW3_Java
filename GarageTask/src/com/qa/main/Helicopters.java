package com.qa.main;

public class Helicopters extends Vehicles {

	
	//Fields:	
	private int propellorSpeed;
	private boolean isArmed;
	
	
	
	//Constructor:	
	public Helicopters(String colour, int noOfSeats, boolean isAirbourne, int propellorSpeed, boolean isArmed) {
		super(colour, noOfSeats, isAirbourne);
		this.propellorSpeed = propellorSpeed;
		this.isArmed = isArmed;
	}

	
	
	//Getters and Setters:
	public int getPropellorSpeed() {
		return propellorSpeed;
	}


	public void setPropellorSpeed(int propellorSpeed) {
		this.propellorSpeed = propellorSpeed;
	}


	public boolean isArmed() {
		return isArmed;
	}


	public void setArmed(boolean isArmed) {
		this.isArmed = isArmed;
	}



	@Override
	public String toString() {
		return "Helicopters [propellorSpeed=" + propellorSpeed + ", isArmed=" + isArmed + ", toString()="
				+ super.toString() + "]";
	}
	
	
	
	
	
	
}
