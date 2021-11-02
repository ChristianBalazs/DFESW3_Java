package com.qa.cars.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.qa.cars.Cars;



@RestController  // initialize this class as a Rest Controller
public class CarsController {
	
	private List<Cars> CarList1 = new ArrayList<>(); //create an ArrayList called CarList1 to hold data
	
	
	@GetMapping("/cars")  
	public String welcome() {
		return "Welcome to Cars API test!";
	}
	
	
	
	@PostMapping("/cars/create")
	public Cars createCar(@RequestBody Cars car1) {
		this.CarList1.add(car1);
		return this.CarList1.get(CarList1.size()-1);
	}
	
	
	@GetMapping("/cars/get")  //see all elements inside the CarList1 array
	public List <Cars> getcars(){
		return this.CarList1;
	}
	
	
	@PutMapping("/cars/replace/{id}") //replacing the item with id (id) from the array list with another item/element created now
	public Cars replaceCars(@PathVariable Integer id, @RequestBody Cars car1) {
		System.out.println("Replace car with id " + id + "with " + car1);
		return null;
	}
	
	
	@DeleteMapping("cars/remove/{id}")
	public void removeCar(@PathVariable Integer id) {
		System.out.println("Car with id " + id + " was removed");
	}
	
	
	
	
	
	
	
	
	
	
	

}
