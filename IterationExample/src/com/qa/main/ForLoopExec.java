package com.qa.main;

public class ForLoopExec {

	
	// Coins
//	Given a cost and an amount, work out the change given in specific coinage.
//	For example; the cost is £4.58 and the customer pays with a £20 note so as change they receive:
//	1 £10 note
//	1 £5 note
//	2 20p's
//	1 2p
	
	
	
	public static void Coins(float pay, float cost) {
		
		//double pay = 20;
		//double cost = 4.58;
		
		int note10 = 10;
		int note5 = 5;
		int coin20 = 20;
		int coin2 = 2;
		
		double change = pay - cost;
		
		while (change > 10) {
			System.out.println( "$" + note10 +" note");
			change -= 10;			
		}
		
		while (change > 5) {
			System.out.println("$" + note5 + " note");
			change -= 5;
		}
		
		while (change > 0.20) {
			System.out.println(coin20 + "p coin");
			change -= 0.20;
		}
		
		while (change > 0.01) {
			System.out.println(coin2 + "p coin");
			change -= 0.02;
		}
		
		
		
	}
	
	
	
	//ANother exercise
	
//	Create a method that can print out the numbers 1-10 10 times each.
	
	
	public static void flowChartDemo() {
		
		for(int i = 1; i < 10; i++) {
			
			for (int y = 1; y <= 10; y++) {
				System.out.println("value of i is: " + i);
			}
			
			System.out.println("end of 10 times");
			
		}
		
	}
	
	
	
	//Another exercise - flowchart
	
	
	public static void flowCh(){
		
		int a = 100;
		
		if (a > 200) {
			
		}
		
	}
	
	
	
	
	
	
	
}
