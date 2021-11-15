package com.qa.cars.service;

import java.util.List;

import com.qa.cars.domain.Cars;



public interface CarsService {

	// Created 5 methods similar to PuppyService.java
	
	Cars createCar(Cars newCar);
	
	List<Cars> getCarList();
	
	Cars getCar(Integer id);
	
	Cars replaceCar(Integer id, Cars newCar);
	
	boolean removeCar(Integer id);
		
	
}
