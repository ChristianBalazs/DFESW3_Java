package com.qa.main;

import java.util.Objects;
import java.util.Optional;

public class Users {
	
	
		private Long Id;
		private String firstName;
		private String lastName;
		private String email;
		private Integer phoneNumber;
				
		
		//Constructors
		
		public Users(Long id, String firstName, String lastName, String email, int phoneNumber) {
			super();
			Id = id;
			this.firstName = firstName;
			this.lastName = lastName;
			this.email = email;
			this.phoneNumber = phoneNumber;
		}


		public Users(Long id, String firstName, String lastName) {
			super();
			Id = id;
			this.firstName = firstName;
			this.lastName = lastName;
		}

		
		//Getters and Setters
		public Long getId() {
			return Id;
		}


		public void setId(Long id) {
			Id = id;
		}


		public String getFirstName() {
			return firstName;
		}


		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}


		public String getLastName() {
			return lastName;
		}


		public void setLastName(String lastName) {
			this.lastName = lastName;
		}


		public String getEmail() {
			return Optional.ofNullable(email).orElse("No email provided");
			// use Optional.ofNullable(email) - optional return 
			// .ofNullable(email) - if email variable is null
			// .orElse("text") - "text" to return if condition ofNullable is true
			//if .ofNullable is false (email variable has a value) return the email address;
		}


		public void setEmail(String email) {
			this.email = email;
		}


		public String getPhoneNumber() {
			return Optional.ofNullable(phoneNumber).map(Objects::toString).orElse("No phone number");
			//return phoneNumber;
			
		}


		public void setPhoneNumber(int phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
		
			
		
		
		
		
		
		
		
		
		
		
	
	
	
}
