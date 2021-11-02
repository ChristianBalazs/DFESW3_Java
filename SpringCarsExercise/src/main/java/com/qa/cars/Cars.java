package com.qa.cars;

//had 406 error code because I have not set Getters and Setters


public class Cars {
	
	
	private String type;
	private String colour;
	private int hp;
	
	
	public Cars(String type, String colour, int hp) {
		super();
		this.type = type;
		this.colour = colour;
		this.hp = hp;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getColour() {
		return colour;
	}


	public void setColour(String colour) {
		this.colour = colour;
	}


	public int getHp() {
		return hp;
	}


	public void setHp(int hp) {
		this.hp = hp;
	}
	
	
	
	
	

}
