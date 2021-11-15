package com.qa.cars.service;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.stereotype.Service;

import com.qa.cars.domain.Cars;
import com.qa.cars.repos.CarsRepo;

@Service
public class CarsServiceDB implements CarsService{
	
	private CarsRepo repo;
			
	//Create constructor 
	public CarsServiceDB(CarsRepo repo) {
		super();
		this.repo = repo;
	}
	
		
	// Add unimplemented methods from CarsService interface
	
	
	@Override
	public Cars createCar(Cars newCar) {		
		return this.repo.save(newCar);
	}

	
	@Override
	public List<Cars> getCarList() {		
		return this.repo.findAll();
	}

	
	
	@Override
	public Cars getCar(Integer id) {		
		Optional<Cars> carsOptional = this.repo.findById(id);
		
		if(carsOptional.isPresent()) {
			Cars theCar = carsOptional.get();
			return theCar;
		}else {
			throw new EntityNotFoundException("No car found with id: " + id);
		}
	}

	
	
	@Override
	public Cars replaceCar(Integer id, Cars newCar) {		
		Cars existingCar = this.getCar(id);
		
		existingCar.setCarBrand(newCar.getCarBrand());
		existingCar.setCarColour(newCar.getCarColour());
		existingCar.setCarType(newCar.getCarType());
		existingCar.setEngineHp(newCar.getEngineHp());
		existingCar.setMaxSpeed(newCar.getMaxSpeed());
		
		return this.repo.save(existingCar);
	}

	
	
	
	@Override
	public boolean removeCar(Integer id) {	
		this.repo.deleteById(id);
		return !this.repo.existsById(id);
	}

}
