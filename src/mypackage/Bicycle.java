package mypackage;

public class Bicycle {
	//instance variables
	// fields
	// member variables
	private int speed;
	

	private int gear;
	private int cadence;
	//?? are instance variables are always private
	//Ans - No. public, good practice to have them private
	
	//This is a special method, constructor
	//Constructor is identified by two things
	//1. name of the method is same as class name - Bicycle
	//2. It does not mention return type, not even void
	//Constructor gets called during object creation process
	//Objective of constructor is to initialize the state of the object
	//state of the object is nothing but values of instance variables
	public Bicycle () {
		System.out.println(speed);
		System.out.println(gear);
		System.out.println(cadence);
		this.speed = 50;
		this.gear = 3;
		this.cadence = 70;	
		System.out.println(speed);
		System.out.println(gear);
		System.out.println(cadence);		
	}

	
	//public Bicycle ( int startGear, String speed, int cadence)
	public Bicycle(int speed, int startGear, int cadence) {
		// TODO Auto-generated constructor stub
		System.out.println(this.speed);
		System.out.println(this.gear);
		System.out.println(this.cadence);
		System.out.println(speed);
		System.out.println(startGear);
		System.out.println(cadence);
		
		this.speed = speed;
		gear = startGear;
		this.cadence = cadence;	
		
		System.out.println(this.speed);
		System.out.println(gear);
		System.out.println(this.cadence);
		
	}
	
	public Bicycle(int speed, int gear) {
		this.speed = speed;
		this.gear = gear;
		cadence = 80;
	}
	
	public void changeSpeed(int speed) {
		if (speed < 180)
			this.speed = speed;
		else
			System.out.println("Error - speed exceeds maximum limit");
		System.out.println(this.speed);
	}
	
	
	public void changegear(int gear) {
		if (gear < 6)
			this.gear = gear;
		else
			System.out.println("Error - gear exceeds maximum");
		System.out.println(this.gear);
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public int getCadence() {
		return cadence;
	}
	
	public int getGear() {
		return gear;
	}
	
	public void  setGear() {
		
	}
	
	public void changeColorOfBicycle() {
		
	}
	
	public void parkBicycle() {
		
	}

}
