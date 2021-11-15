package com.qa.cars.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.cars.domain.Cars;


// Modified the class into an interface 
// added extends JpaRepository<Cars, Integer>
// WHY?

@Repository
public interface CarsRepo extends JpaRepository<Cars,Integer> {
	
}
