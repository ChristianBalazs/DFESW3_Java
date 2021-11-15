package com.qa.cars.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Car not found with thatID")

public class CarsNotFoundExceptions extends RuntimeException{

	/*
	 * 
	 */
	
	private static final long serialVersionUID = -1213048928725526908L;	
	
	
}
