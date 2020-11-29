package exceptionhandling;

public class MultipleCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		args[1] = "2";
		int a[]= {5,1};
		
		try
		{
		int b= Integer.parseInt(args[0]);
		int x = a[b]/(b-a[1]);
		System.out.println("x="+x);
		}
		
		catch(ArithmeticException e)
		{
		System.out.println(e.toString());
		}
		catch(NumberFormatException e)
		{
		System.out.println(e.toString());
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
		System.out.println(e.toString());
		}
		System.out.println("Hello This is Exception Test");
	} // End of main() method

		

}
