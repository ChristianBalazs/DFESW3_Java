package com.qa.cars;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test") // sets the profile to 'test'
class SpringCarsProjectApplicationTests {

	@Test
	void contextLoads() {
	}

}
