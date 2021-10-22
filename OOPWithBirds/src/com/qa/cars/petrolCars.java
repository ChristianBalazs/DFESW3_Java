package com.qa.cars;

public class petrolCars extends Cars {

	
	
	//Fields
	private int MPG;
	private boolean isAuto;
	
	
	
	//Getters and Setters
	public int getMPG() {
		return MPG;
	}


	public void setMPG(int mPG) {
		MPG = mPG;
	}


	public boolean isAuto() {
		return isAuto;
	}


	public void setAuto(boolean isAuto) {
		this.isAuto = isAuto;
	}



	//Method
	public void startEngine() {
		System.out.println("Vruuuum");
	}
	
	public void loadTrunk() {
		MPG = MPG - 3;		
	}

	
	
	//Constructors
	public petrolCars(String color, int hP, boolean has4Wheels, int mPG, boolean isAuto) {
		super(color, hP, has4Wheels);
		MPG = mPG;
		this.isAuto = isAuto;
	}
	
	
	
	
	
	
	
	
	
	
	
}
