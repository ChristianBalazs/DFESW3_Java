package qa.com.main;

import GettersAndSetters.GettersExercise;

public class Runner {

	public static void main(String[] args) {
		
		Cars Tesla = new Cars("estate", 200, true, "blue");
		
		System.out.println("Current HP is: " + Tesla.HP);
		
		Tesla.changeHP();
		
		
		
		//From GettersExercise
		
		GettersExercise Ford = new GettersExercise("pick-up", 150, false, "yellow");
		//System.out.println(Ford.colour); // error - colour not visible
		
		System.out.println("Original color: " + Ford.getColour()); // will print yellow
		
		Ford.setColour("orange");
		
		System.out.println("Revised color: " + Ford.getColour());

	}

}
