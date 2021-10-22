package com.qa.main;

import java.util.ArrayList;

public class ArrayListExercise {

	
	//Exercise
	
	//Exercise - You are running a succesful cafe called QA-Cafe. 
	//With a list of orders, 
	//create methods with paramaters that can do the following:
	
	//2 ArrayLists, one doneOrders and orders
	
	// Methods to run :
	//	- Add a new order to an orders array
	//	- Move an existing order to a 'Done orders array'
	//	- Return the name of an order
	//	- Modify the order by index with a new name
	//	- Remove the order from either arrays
	//	- Print the length of either arrays
	//	- Clear either arrays
	
	
	//Types of orders:
	//	Small Espresso
	//	Large Cold Brew
	//	Medium Cappucino
	//	Medium Flat White
	//	Large Choc Cookie Frappe
	//	Small Caramel Iced Latte
	//	Small Americano
	//	Large Cafe Au Lait
	//	Medium Strawberry Iced Tea
	
	
	
	// Create the two Array Lists
	public static ArrayList<String>Orders = new ArrayList<>();
	
	public static ArrayList<String>DoneOrders = new ArrayList<>();
	
	
	
	// Initialize "Orders" Array List
	public static void setupOrder() {
		Orders.add("Small Espresso");
		Orders.add("Large Cold Brew");
		Orders.add("Medium Cappucino");
		Orders.add("Medium Flat White");
		Orders.add("Large Choc Cookie Frappe");
		System.out.println(" ");
		System.out.println("Initial list of orders: " + Orders);
		
	}
	
	
	//Initialize "DoneOrders" Array List
	public static void DoneOrders() {
		DoneOrders.add("Medium Strawberry Iced Tea");
		DoneOrders.add("Large Cafe Au Lait");
		//DoneOrders.add("Small Americano");
		System.out.println("Orders already done: " + DoneOrders);
		System.out.println(" ");
	}
	
	
	//Method to Modify the order by index with a new name
	
	public static void modifDoneOrders(int a, String modifDrink) {
		DoneOrders.set(a, modifDrink);
		System.out.println("DONE orders list after including " +  modifDrink + " at " + a + " index position is: " + DoneOrders);
	}
	
	
	// Method to add a new order to "Orders" List	
	public static void addOrder(String newOrder) {
		Orders.add(newOrder);
		System.out.println("Updated list of orders: " + Orders);
	}
	
		
	
	// Method to return the name of an order	
	public static String orderName(int index) {
		return Orders.get(index);		
	}
	
	
	
	//Method to move an order to DoneOrder array	
	public static void moveOrder(String moveOrder) {
		Orders.remove(moveOrder);
		DoneOrders.add(moveOrder);
		System.out.println(" ");
		System.out.println("The order to move is: " + moveOrder);
		System.out.println("Order list after move: " + Orders);
		System.out.println("Orders DONE after move: " + DoneOrders);
		System.out.println(" ");
	}
	
	
	//Method to remove the order from either arrays
		public static void removeOrder(String remOrder) {
		Orders.remove(remOrder);
		System.out.println("New Orders list after removal:" + Orders);
	}
	
	
	//Method to print the length of either array
	public static void OrdersLength() {
		int len = Orders.size();
		System.out.println("Curent number of Orders on waiting list: " + len);
		System.out.println(" ");
	}
	
	
	
	
	
	
	
	
}
