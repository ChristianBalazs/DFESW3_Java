package com.qa.cake;

public class User {

	// Fields
	public String firstName;
	public String lastName;
	public String email;
	public int age;

	
	
	
	//Constructor - Overloading - when having mutiple constructors with the same name
	// Within a class you can use as MANY constructors as 
	// you want - with different combos of fields
	
	// This constructor takes 4 parameters - 3 strings and 1 int 
	public User(String firstName, String lastName, String email, int age) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	this.email = email;
	this.age = age;	
	}
	
	// This constructor takes 1 field - 1 String
	public User(String firstName) {
		super();
		this.firstName = firstName;
	}
	
	

	
}
