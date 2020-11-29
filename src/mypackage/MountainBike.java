package mypackage;

import mypackage.Bicycle;

public class MountainBike extends Bicycle {
	private int seatHeight;
	
	public MountainBike(int seatHeight) {
	super();
//This is a call to parent's no parameter constructor
		this.seatHeight = seatHeight;
	}
	
	public MountainBike() {
		super();
		this.seatHeight = 7;
	}
	
	public MountainBike(int speed, int gear, int height) {
		super(speed, gear);
		this.setGear(5);
		this.seatHeight = height;
	}
	

	public int getSeatHeight() {		
		return seatHeight;
		
	}

	public void setSeatHeight(int seatHeight) {
		if (seatHeight > 10 && super.getSpeed() > 50)
			this.seatHeight = seatHeight;
		//setSeatHeight(4);
	}
	//Method overriding  - polymorphism
	
	@Override  //Override annotation - 
	public void setGear(int gear) {
		if (gear < 4)
			super.setGear(gear) ;//parent's setGear(), or child's setGear()
		//recursive
	}
	
	
	
	
//MountainBike is a Child class and Bicycle is a parent class
//MountainBike is subclass and Bicycle is a superclass
}
