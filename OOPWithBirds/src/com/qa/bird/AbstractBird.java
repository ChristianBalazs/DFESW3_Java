package com.qa.bird;

// use: public abstract class <class name> format

public abstract class AbstractBird {

	
	//abstract methods have no body 
	// their only purpose is to make sure child objects use this method
	
	//abstract method
	public abstract void noise();
	
	// Regular method
	public void sleep() {
		System.out.println("zzz zzz zzz");
	}
	
	
	
	
	
}
