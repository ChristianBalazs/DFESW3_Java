package com.qa.main;

import com.qa.bird.FlightLessBirds;
import com.qa.bird.Pelican;
import com.qa.cars.EVCars;
import com.qa.cars.petrolCars; // need to import com.qa.cars.petrolCars

public class Runner {

	public static void main(String[] args) {
		
		
		FlightLessBirds kiwi = new FlightLessBirds("Brown", 0, false, "Forest", 12);
		
		kiwi.makeNoise();
		kiwi.attemptToFly();
		
		
		//Running Cars Exercise from com.qa.cars
		System.out.println("=====");
		
		//petrolCars child of Cars
		petrolCars Ford = new petrolCars("blue", 140, true, 25, false);		
		
		Ford.startEngine();
		
		System.out.println("This car MPG is: " + Ford.getMPG());
		
		Ford.loadTrunk();
		Ford.loadTrunk();
		System.out.println("This car MPG is: " + Ford.getMPG());
		
		
		
		
		
		//EVCars child of Cars
		EVCars Tesla = new EVCars("red", 220, true, 75, "lithium-ion");
		
		Tesla.startEngine();
		
		System.out.println("Baterry size in Kwh: " + Tesla.getBaterrySize());
		
		Tesla.setBaterrySize(90);
		
		System.out.println("Revised battery size: " + Tesla.getBaterrySize());
		
		
		//From Abstract class
		System.out.println("=====");
		
		Pelican newPelican = new Pelican();
		newPelican.noise();
		

	}

}
