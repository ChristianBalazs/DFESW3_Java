package com.qa.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.qa.main.Vehicles;



public class VehiclesTest {
	
	
	@Test
	public void myVehicleTypeTest() {
		
		Vehicles Mazda = new Vehicles("red", 4, false);	
		
		assertTrue("True", Mazda instanceof Vehicles );
		
	}
	
	
	
	@Test
	public void myVehicleGettersTest() {
		
		Vehicles Mazda = new Vehicles("red", 4, false);		
		
		assertEquals("Mazda color is red", "red" , Mazda.getColour());
		
		assertEquals("Mazda has 4 seats", 4 , Mazda.getNoOfSeats());
		
		assertEquals("Mazda is not airbourne", false, Mazda.isAirbourne());
		
	}
	
	
	@Test
	public void myVehicleSettersTest() {
		
		Vehicles Fiat = new Vehicles("red", 4, false);	
		
		Fiat.setColour("yellow");		
		assertEquals("Fiat new colour is yellow", "yellow", Fiat.getColour());
		
		Fiat.setNoOfSeats(7);
		assertEquals("Fiat new seat number is 7", 7, Fiat.getNoOfSeats());
		
		Fiat.setAirbourne(true);
		assertEquals("Fiat now flies", true, Fiat.isAirbourne());
		
	}
	
	
	
	@Test
	public void myVehicleMethodTest() {
		
		Vehicles Skoda = new Vehicles("blue", 5, false);
		
		//Skoda.fixVehicle();
		
		assertEquals("Skoda has 50 seats", 50, Skoda.fixVehicle());
		
		
	}
	
	
	

}
