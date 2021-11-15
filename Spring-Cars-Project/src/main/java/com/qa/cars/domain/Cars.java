package com.qa.cars.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//@Adnotation added from Puppy file
@Entity // Added - WHY?

public class Cars {
	
	//Variables for Object creation
	// Two @Adnotations added from Puppy example
	// are those two @ related to generating Id numbers on DB ?
	
	@Id //tells Spring this is the PK 
	@GeneratedValue(strategy = GenerationType.IDENTITY) // AUTO_INCREMENT
	
	private String carBrand;
	private String carColour;
	private String carType;
	private int maxSpeed;
	private int engineHp;
	
	
	//Constructor
	
	public Cars(String carBrand, String carColour, String carType, int maxSpeed, int engineHp) {
		super();
		this.carBrand = carBrand;
		this.carColour = carColour;
		this.carType = carType;
		this.maxSpeed = maxSpeed;
		this.engineHp = engineHp;
	}


	//Getters and Setters
	
	public String getCarBrand() {
		return carBrand;
	}


	public void setCarBrand(String carBrand) {
		this.carBrand = carBrand;
	}


	public String getCarColour() {
		return carColour;
	}


	public void setCarColour(String carColour) {
		this.carColour = carColour;
	}


	public String getCarType() {
		return carType;
	}


	public void setCarType(String carType) {
		this.carType = carType;
	}


	public int getMaxSpeed() {
		return maxSpeed;
	}


	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}


	public int getEngineHp() {
		return engineHp;
	}


	public void setEngineHp(int engineHp) {
		this.engineHp = engineHp;
	}
	
	
	
	
	
	
	

}
