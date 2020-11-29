package exceptionhandling;

public class UsingLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			//opening a file, DB
			//do some operations
			//close the file
			methodA();
			
		}catch (InvalidLoginException e) {
			System.out.println("Invalid User ID while login");
			throw e;
		} finally {//housekeeping
			//Irrespective of whether exception occurs or not
			//code inside finally will always execute
			System.out.println("This will always appear on console");
		}
		System.out.println("This will always appear on console");
	}
	
	
	public static void methodA() {
		String userID="xyz";
		String password = "ABC";
		if (!userID.equals("abc"))
			throw new InvalidLoginException("Invalid User");
		else if (!password.equals("xyz")) {
			InvalidLoginException e = new InvalidLoginException("Invalid Password");
			throw e;
		}
			
	}

}
