package exceptionhandling;

import exceptionhandling.InvalidBOXException.BOX;

public class ExceptionTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			Box B1= new Box(0,0,0);
		
		}catch(InvalidBOXException e ) {
			System.out.println("Box dimentions are invalid");
			
		}
		
		try{
			Box B2 = new Box(2,3,4);
			System.out.println("Area of B2"+B2.Area());
		}catch(InvalidBOXException e) {
			
		}
		
		

	}

}
