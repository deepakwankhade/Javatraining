package mypackage;

import mypackage.Bicycle;

public class MountainBikeInhertiedDemo {
	public static void main(String[] args) {
		MountainBike mbike = new MountainBike(5);
		mbike.printBicycleStatistics();
		System.out.println(mbike.getSeatHeight());
		MountainBike mbike1 = new MountainBike(5);
		
		System.out.println(mbike1.getSpeed());
		
		
		
		MountainBike mbike3 = new MountainBike();
		MountainBike mbike4 = new MountainBike(4);
		MountainBike mbike5 = new MountainBike(51,2,5);
		//MountainBike mbike6 = new Bicycle(51,2);not allowed
		//Bicycle bike10 = new MountainBike(43,2,2);allowed
		mbike5.setSeatHeight(100);
		System.out.println(mbike5.getSeatHeight());
		
		mbike5.setGear(40);//child's setGear
		
		
		Bicycle bike1 = new Bicycle();//this does not know anything about child
			bike1.setGear(4);	//parent's setGear()
		
		
		//Vinit is saying what if I need a different 
		//value of speed and gear then what is mentioned in the
		// child constructors call to parent constructor. i.e
		//super(4,5) in this case.
		
		//can I pass 3 parameters to MountainBike
		//constructor
		
	}
	
}
