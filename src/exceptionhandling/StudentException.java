package exceptionhandling;

public class StudentException extends Exception {
	
	private static String msg;

	StudentException(){
		super(msg);
		System.out.println(msg);
	}

}
