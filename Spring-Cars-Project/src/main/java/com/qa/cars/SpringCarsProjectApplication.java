package com.qa.cars;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.qa.cars.service.CarsService;

@SpringBootApplication
public class SpringCarsProjectApplication {

	public static void main(String[] args) throws Exception{
		
		ApplicationContext appCon = SpringApplication.run(SpringCarsProjectApplication.class, args);
	
		CarsService appService = appCon.getBean(CarsService.class);
		
		System.out.println(appService);
		
	}

}
