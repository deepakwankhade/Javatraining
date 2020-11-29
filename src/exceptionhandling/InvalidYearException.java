package exceptionhandling;

public class InvalidYearException extends InvalidIdException {
	InvalidYearException(String msg)
	{
	super(msg);
	System.out.println(msg);
	}

}
