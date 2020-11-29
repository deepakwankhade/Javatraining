package exceptionhandling;

public class CustomException extends RuntimeException
 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public  CustomException(String msg)
	  {
	     super();
	     System.out.println("An attempt is made to create an Invalid BOx object ");
	  }


}
