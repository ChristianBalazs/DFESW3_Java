package com.qa.main;

public class Turtle {

	int speed;
	
	String turtleSpecies = "Box turtles";
	
	boolean isASeaTurtle = false;
	
	String turtleSize;
	
	short lifespan;
	
	String prefFood;
	
	
	public boolean ifSeaTurtle() {
		if (lifespan > 100) {
			isASeaTurtle = true;
		} else {
			isASeaTurtle = false;
		}
		
		return isASeaTurtle;
	}
	
	
	public void speeding() {
		if (speed > 5) {
			System.out.println("Why u coming fast ?");
		} else {
			System.out.println("Hurry up");
		}
	}


	
	
	public void speedingAgain(boolean goodAttitude) {
		if (speed > 5 || goodAttitude == false) {
			System.out.println("Why u coming fast and nervous ?");
		} else {
			System.out.println("Hurry up");
		}
	}
	
	
	
	
	
	
}
