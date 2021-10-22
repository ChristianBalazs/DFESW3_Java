package com.qa.main;

import com.qa.cake.CakeTin;
import com.qa.cake.User;

public class Runner {

	public static void main(String[] args) {
		
		// CakeTin is the data type
		// gfSpongeCake is the name of the object
		// equal to new CakeTin(the method we are using) 
		
		CakeTin gfSpongeCake = new CakeTin();
		
		System.out.println(gfSpongeCake.flavour);
		
		gfSpongeCake.eatCake();
		
		
		//Static methods belong to classes
		// non static belong to objects
		
		User user1 = new User("John Doe");

	}

}
