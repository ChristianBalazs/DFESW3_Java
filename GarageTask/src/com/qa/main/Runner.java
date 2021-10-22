package com.qa.main;

	
public class Runner {

	public static void main(String[] args) {
		
		
		//Create two Cars object
		
		Vehicles Nissan = new Cars("blue", 4, false, false, 120, "Nissan");		
		Vehicles Tesla = new Cars("green", 5, false, true, 200, "Tesla");
		
				
		//Check Tesla colour		
		System.out.println(Tesla.getColour());
		
		//Check Nissan HP
		System.out.println(((Cars) Nissan).getHP());
		
		
		
		//Add those two cars into the garageList array
		
		Garage.addVeh(Nissan);
		Garage.addVeh(Tesla);
		
		//Check the vehicles inside the Garage
		Garage.readVeh();
		
		System.out.println("========");
		
		
		
		//Create two Bike objects
		
		Bike Honda = new Bike("yellow", 2, false, 6, true);
		Bike Kawasaki = new Bike ("white", 1, false, 8, false);
		
		
		// Add those two Bikes into the garageList
		Garage.addVeh(Honda);
		Garage.addVeh(Kawasaki);
		
		//Check the vehicles inside the Garage
		Garage.readVeh();
		
		
		
		//Create one helicopter object
		
		Helicopters Puma = new Helicopters("orange", 6, true, 350, false);
		
		//Add the Puma helicopter
		Garage.addVeh(Puma);
		
		//Check the vehicles inside the Garage
		System.out.println("======");
		System.out.println("The items inside the garageList below:");
		Garage.readVeh();
		
		//Print Puma no of seats
		System.out.println("Puma has " + Puma.getNoOfSeats() + " seats");
		
		//Use method fixVehicle() ahd print new number of seats
		System.out.println("New number of seats is: " + Puma.fixVehicle());
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
