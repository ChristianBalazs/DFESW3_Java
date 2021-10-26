package com.qa.main;

public class Cars extends Vehicles {

	//Fields:	
	private boolean isEV;
	private int HP;
	private String CarName;
	

	//Method
	public int HpUpgrade() {
		return HP + 100;
		
	}

	
	

	//Constructor: 	
	public Cars(String colour, int noOfSeats, boolean isAirbourne, boolean isEV, int hP, String carName) {
		super(colour, noOfSeats, isAirbourne);
		this.isEV = isEV;
		HP = hP;
		CarName = carName;
	}
	

	
	// Getters and Setters:
	public boolean isEV() {
		return isEV;
	}


	public void setEV(boolean isEV) {
		this.isEV = isEV;
	}


	public int getHP() {
		return HP;
	}


	public void setHP(int hP) {
		HP = hP;
	}


//	@Override
//	public String toString() {
//		return "Car-> " + CarName + " isEV=" + isEV + ", HP=" + HP + "," + super.toString() + "] ";
//	}
	
	
	
	
}
