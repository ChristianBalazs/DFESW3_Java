package com.qa.main;

public class Vehicles {

	
	//Fields:
	
	private String colour;
	private int noOfSeats;
	private boolean isAirbourne;
	
	
	//Method:
	
	public int fixVehicle() {
		return noOfSeats * 10;		
	}

	
	//Constructor:
	
	public Vehicles(String colour, int noOfSeats, boolean isAirbourne) {
		super();
		this.colour = colour;
		this.noOfSeats = noOfSeats;
		this.isAirbourne = isAirbourne;
	}

	
	
	//Getters and Setters: 
	
	public String getColour() {
		return colour;
	}


	public void setColour(String colour) {
		this.colour = colour;
	}


	public int getNoOfSeats() {
		return noOfSeats;
	}


	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}


	public boolean isAirbourne() {
		return isAirbourne;
	}


	public void setAirbourne(boolean isAirbourne) {
		this.isAirbourne = isAirbourne;
	}


//	@Override
//	public String toString() {
//		return " colour=" + colour + ", noOfSeats=" + noOfSeats + ", isAirbourne=" + isAirbourne ;
//	}
	
	
	
	
	
	
	
}
