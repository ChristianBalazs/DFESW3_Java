package com.qa.main;

public class Runner {

	public static void main(String[] args) {
		
		//Demo.arrayDemo();
		
		
		
		//1st Exercise
		//Demo.arrayExec1();
		
		
		ArrayLists.addPizza();
		
		System.out.println(ArrayLists.getPizza(0));
		
		
		//2nd Exercise
		ArrayListExercise.setupOrder();
		
		ArrayListExercise.DoneOrders();
		
		System.out.println("Order at index position: " + ArrayListExercise.orderName(1));

		ArrayListExercise.moveOrder("Small Espresso");
		
		ArrayListExercise.OrdersLength();
		
		ArrayListExercise.modifDoneOrders(0, "Hot Choco");
		
		
	}

}
