package com.qa.cars;

public class EVCars extends Cars{

	
	//Fields	
	private int baterrySize;
	private String baterryType;
	
	
	//Setters and Getters
	
	public int getBaterrySize() {
		return baterrySize;
	}


	public void setBaterrySize(int baterrySize) {
		this.baterrySize = baterrySize;
	}


	public String getBaterryType() {
		return baterryType;
	}


	public void setBaterryType(String baterryType) {
		this.baterryType = baterryType;
	}

	

	//Method	
	public void startEngine() {
		System.out.println("All systems online!");
	}


	//Constructor	
	public EVCars(String color, int hP, boolean has4Wheels, int baterrySize, String baterryType) {
		super(color, hP, has4Wheels);
		this.baterrySize = baterrySize;
		this.baterryType = baterryType;
	}
	
	
	
	
	
	
}
