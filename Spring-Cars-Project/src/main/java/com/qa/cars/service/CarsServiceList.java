package com.qa.cars.service;

import java.util.ArrayList;
import java.util.List;

import com.qa.cars.domain.Cars;

public class CarsServiceList implements CarsService{

	// Create list carList to hold all data while running the server
	// Use this a temporary until API is connected to DB
	private List<Cars> carList = new ArrayList<>();

	
	//When writing "implements CarsService - select implement methods from interface CarsService on IDE error solving suggestion
	
	
	@Override
	public Cars createCar(Cars newCar) { //method for creating a Car object
		this.carList.add(newCar);
		return this.carList.get(this.carList.size() - 1);
	}

	
	
	
	@Override
	public List<Cars> getCarList() {		
		return this.carList;
	}

	
	
	@Override
	public Cars getCar(Integer id) {		
		return this.carList.get(id);
	}

	
	
	@Override
	public Cars replaceCar(Integer id, Cars newCar) {		
		return this.carList.set(id, newCar);
	}

	
	
	@Override
	public boolean removeCar(Integer id) {
		Cars toRemove = this.carList.get(id);
		this.carList.remove(id.intValue());
		return !this.carList.contains(toRemove);
	}
	
	
	
	
	
	
}
