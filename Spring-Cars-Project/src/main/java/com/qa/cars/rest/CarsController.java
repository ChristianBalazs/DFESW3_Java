package com.qa.cars.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.cars.domain.Cars;
import com.qa.cars.service.CarsService;

@RestController // enables request handling

@RequestMapping(value = "/cars") // prepends /cars to all of endpoints


public class CarsController {

	//Created an object of CarsService interface called theService

	private CarsService theService;
	
			
		
	//Created Constructor for CarsController using the object theService
	//WHY?
	
	// Placed @Autowired but WHY?
	@Autowired
	public CarsController(CarsService theService) {
		super();
		this.theService = theService;
	}
	
	
	@GetMapping("/hello")   //listen for a GET request at /hello
	public String hello() {
		return "Hello there, welcome to this Cars project!";  //sends response
	}
	
	
	
	// Need explanation on the below
	@PostMapping("/create")
	public ResponseEntity<Cars> createCar(@RequestBody Cars newCar) { // a car object in the request + response
		Cars responseBody = this.theService.createCar(newCar);
		return new ResponseEntity<Cars>(responseBody, HttpStatus.CREATED);
	}
	
	
	
	// Need explanation on the below
	@GetMapping("/getAll")
	public ResponseEntity<List<Cars>> getCarList(){
		return ResponseEntity.ok(this.theService.getCarList());
	}
	
	
	// Need explanation on the below
	@GetMapping("/get/{id}")
	public Cars getCar(@PathVariable Integer id) {
		return this.theService.getCar(id);
	}
	
	
	// Need explanation on the below
	@PutMapping("/replace/{id}")
	public ResponseEntity<Cars> replaceCar(@PathVariable Integer id, @RequestBody Cars newCar){
		System.out.println("Replacing car with id " + id + " with "+ newCar);
		Cars body = this.theService.replaceCar(id, newCar);
		return new ResponseEntity<Cars>(body, HttpStatus.ACCEPTED);
	}
	
	
	
	// Need explanation on the below
	@DeleteMapping("/remove/{id}")
	public ResponseEntity<?> removeCar(@PathVariable Integer id){
		System.out.println("Removing car with id " + id);
		boolean removed = this.theService.removeCar(id);
		if (removed) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}else {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
	
	
	
	
	
}
