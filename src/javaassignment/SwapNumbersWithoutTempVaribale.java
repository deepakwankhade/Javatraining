package javaassignment;

public class SwapNumbersWithoutTempVaribale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Before swapping");
		int x= 10;
		int y=20;
		
		System.out.println("Value of x " + x);
		System.out.println("Value of y " + y);
		System.out.println("After swapiing");
		x= x+y;
		y= x-y;
		x= x-y;
		System.out.println("Value of x "+ x);
		System.out.println("Value of y " + y);
		
		

	}

}
