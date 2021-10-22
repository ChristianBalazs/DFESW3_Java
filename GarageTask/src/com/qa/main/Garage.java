package com.qa.main;

import java.util.ArrayList;

//Exercise:

//The task is to create a garage class with methods for the following:
//- Adding Vehicles to garage
//- Removing vehicles
//- Updating vehicles
//- Reading vehicle
//- Removing all vehicles
//- Running vehicle.fixVehicle() custom method


//Vehicles
//Vehicle should be a base class (parent) with atleast 3 fields
//and a fixVehicle() method
//
//You should create atleast 3 child classes extending off of Vehicle 
//(car, bike, helicopter)
//Each child class should inherit the fields AND have 2 specific fields




public class Garage {
	
	public static ArrayList<Vehicles> garageList = new ArrayList<>();
	
	
	
	
	
	//Methods:
	public static void addVeh(Vehicles veh) {
		garageList.add(veh);
		//System.out.println("Vehicle " + veh + " added to the Garage");
		
	}
	
	
	public void removeVeh(String veh) {
		garageList.remove(veh);
		//System.out.println("Vehicle " + veh + " removed from the Garage");
	}

	
	public void updateVeh(Vehicles veh, int index ) {
		garageList.set(index, veh);
		System.out.println("Vehicle at index position " + index + " updated to: " + veh);
		
	}
	
	public static void readVeh() {
		System.out.println(garageList);
	}
	
	
	public void removeAll() {
		garageList.clear();
		System.out.println("Garage list after clean: " + garageList);
	}
	
	
	
	
	
	
	
}
