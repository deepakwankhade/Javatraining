package exceptionhandling;

public class InvalidIdException extends StudentException {
	InvalidIdException(String msg)
	{
	super();
	System.out.println(msg);
	}

}
