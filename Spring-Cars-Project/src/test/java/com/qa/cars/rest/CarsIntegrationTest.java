package com.qa.cars.rest;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.Sql.ExecutionPhase;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultMatcher;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.qa.cars.domain.Cars;

@SpringBootTest // boots the entire context
@AutoConfigureMockMvc // creates the MockMVC object for sending our test requests
@Sql(scripts = { "classpath:puppy-schema.sql",
		"classpath:puppy-data.sql" }, executionPhase = ExecutionPhase.BEFORE_TEST_METHOD)
// runs schema and data file before each test
// if you see error like 'x is not a column' check you're using '' for strings
@ActiveProfiles("test") // sets the profile to 'test'


public class CarsIntegrationTest {
	
	@Autowired 
	private MockMvc mvc;
	
	// Too Long, Didn't Read:
	@Autowired
	private ObjectMapper mapper; // the EXACT SAME mapper that spring uses to convert objects to and from JSON
	
	
	
	@Test
	void testCreate() throws Exception{
		Cars requestBody = new Cars ("Vauxhall", "blue", "off-road", 90, 120);
		String requestBodyAsJSON = this.mapper.writeValueAsString(requestBody);
		
		RequestBuilder request = post("/cars/create").contentType(MediaType.APPLICATION_JSON).content(requestBodyAsJSON); //sets up the test request
		
		Cars responseBody = new Cars ("Vauxhall", "blue", "off-road", 90, 120);
		String responseBodyAsJSON = this.mapper.writeValueAsString(responseBody);
		
		ResultMatcher checkStatus = status().isCreated(); //check the status code is 201
		ResultMatcher checkBody = content().json(responseBodyAsJSON); //check the body matches the example
		
		this.mvc.perform(request).andExpect(checkStatus).andExpect(checkBody); // performs request and checks the
		// response
	}
	
	
	@Test
	void testCarsNotFound() throws Exception{
		this.mvc.perform(get("cars/get/9999999")).andExpect(status().isNotFound());
			
		}
		
		
	@Test
	void testGetAll() throws Exception {

		RequestBuilder request = get("/cars/getAll");

		ResultMatcher checkStatus = status().isOk();

		Cars theCar = new Cars("Cielo", "blue", "saloon", 90, 70);
		List<Cars> allCars = List.of(theCar);
		String responseBody = this.mapper.writeValueAsString(allCars);
		ResultMatcher checkBody = content().json(responseBody);

		this.mvc.perform(request).andExpect(checkStatus).andExpect(checkBody);
		}		
		
	
	
	@Test
	void testGet() throws Exception {
		final String responseBody = this.mapper.writeValueAsString(new Cars("Cielo", "blue", "saloon", 90, 70));
		this.mvc.perform(get("/cars/get/1")).andExpect(status().isOk()).andExpect(content().json(responseBody));
	}	

	
	
	@Test
	void testReplace() throws Exception {
		final String responseBody = this.mapper.writeValueAsString(new Cars("Vw Polo", "silver", "hatchback", 80, 65));

		RequestBuilder request = put("/cars/replace/1").contentType(MediaType.APPLICATION_JSON).content(responseBody);

		ResultMatcher checkStatus = status().isAccepted();
		ResultMatcher checkBody = content().json(responseBody);

		this.mvc.perform(request).andExpect(checkStatus).andExpect(checkBody);
	}	
		
	
	@Test
	void testDelete() throws Exception {
		this.mvc.perform(delete("/cars/remove/1")).andExpect(status().isNoContent());
	}	
		
		
		
		
	}
	
	

	
	
	

