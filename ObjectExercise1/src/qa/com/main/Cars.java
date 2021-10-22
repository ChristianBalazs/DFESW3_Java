package qa.com.main;

public class Cars {
	
	
	//Exercise:
	
	//Create a class with that name Car etc

	//Create atleast 4 fields and 1 method (syso something..)

	//Create a constructor with some values

	//With your main method, create an object and 
	//syso the values and run the method
	
	
	// Create 4 fields
	public String type;
	public int HP; 
	public boolean isEV;
	public String colour;
	
	//Create 1 method
	public void increaseHP() {
		HP = HP + 50;
		System.out.println("New HP is: " + HP);
	}
	
	//Create constructor
//	public Cars() {
//		type = "saloon";
//		HP = 340;
//		isEV = true;
//		colour = "red";
//	}
	
	//Modify Constructor to define from main method 
	// the values of the object
	
	public Cars(String type,int HP, boolean isEV, String colour ) {
		this.type = type;
		this.HP = HP;
		this.isEV = isEV;
		this.colour = colour;
	}
	
	//Create 2nd method 
	public void changeHP() {
		HP = HP + 80;
		System.out.println("Changed HP is: " + HP);
	}
	
	
	

}
