package com.qa.test;

import static org.junit.Assert.assertEquals;


import org.junit.Test;

import com.qa.main.Cars;


public class CarsTest {
		
	
	
	
	@Test
	public void myCarMethodTest() {
		
		Cars Mazda = new Cars ("red", 4, false, false, 120, "Model2");	
		assertEquals("After HpUpgrade Mazda HP is ", 220, Mazda.HpUpgrade());		
		
	}
	
	
	@Test
	public void myCarsGettersTest() {		
				
		Cars Mazda = new Cars ("red", 4, false, false, 120, "Model2");	
		
		assertEquals("Mazda has 120 HP", 120 , ((Cars) Mazda).getHP());
		
		assertEquals("Mazda is not EV", false, ((Cars) Mazda).isEV());
		
	}
	
	

}
