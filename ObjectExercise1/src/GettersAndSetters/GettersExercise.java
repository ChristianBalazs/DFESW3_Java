package GettersAndSetters;

public class GettersExercise {
	
	
	//Exercise:
	
	//Task - Add Getters and Setters to your 
	//constructor class and make your fields private

	//Then from your main method print out some of the getters and setters

	//Tip - Right Click - > Source -> Generate getters and Setters
	
	
	// Setting the PRIVATE fields
	
	private String type;
	private int HP; 
	private boolean isEV;
	private String colour;
	
	
	//Created Getter for isEV variable
	
	public boolean isEV() {
		return isEV;
	}

	//Created Setter for isEV variable
	public void setEV(boolean isEV) {
		this.isEV = isEV;
	}


	//Created Getter for colour variable
	public String getColour() {
		return colour;
	}


	//Created Setter for colour variable
	public void setColour(String colour) {
		this.colour = colour;
	}



	//Create the constructor		
	public GettersExercise(String type,int HP, boolean isEV, String colour ) {
		this.type = type;
		this.HP = HP;
		this.isEV = isEV;
		this.colour = colour;
	}
	
	
	
	

}
