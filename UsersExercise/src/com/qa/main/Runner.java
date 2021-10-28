package com.qa.main;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create a User class, this user should have the following:
		//	id
		//	Fristname
		//	Lastname
		//	Email
		//	number

		//	When creating a user, should the phone number not be provided; 
		//  using an Optional getNumber, please return the following: "Phone number not provided".
		
		
		
		Users u1 = new Users(1l, "John", "Doe", "johny@email.com", 555326868);
		
		Users u2 = new Users(2l, "Mary", "Poppins");
		
		Users u3 = new Users(3l, "Dan", "Brown");
		
		
		
		
		System.out.println(u2.getFirstName());
		System.out.println(u2.getEmail());
		System.out.println(u2.getPhoneNumber());
		
		u2.setPhoneNumber(2266456);
		System.out.println("Revised phone no: " + u2.getPhoneNumber());
		
		
		

	}

}
