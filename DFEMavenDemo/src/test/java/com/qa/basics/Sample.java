package com.qa.basics;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Sample {
	
	// Below are the test cycle stages
	//Junit 5     - Junit 4
	//@Before all - @BeforeClass
	//@BeforeEach - @Before
	//@AfterAll   - @AfterClass
	//@Test       - @Test
	//@Disable    - @Ignore
	
	
	// when using @ annotation 
	
	@Test
	public void someTest() {
		System.out.println("This is a test");
				
		assertEquals(1,1);		
		
		
		
		
	}
	

}
