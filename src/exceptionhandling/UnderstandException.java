package exceptionhandling;

public class UnderstandException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			int a,b,c,d;
			a=b=5;
			c=10;
			
			try {
				d=c/(a-b);	
			}catch(ArithmeticException e){
				e.printStackTrace();
				
				System.out.println("Please make sure value of a and b are not same");
				throw e;
				
							
				
			}
			System.out.println("Vlaue of c is " + c);
					
			
			
		

	}

}
