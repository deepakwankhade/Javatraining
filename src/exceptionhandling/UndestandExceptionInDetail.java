package exceptionhandling;

public class UndestandExceptionInDetail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methodB();
		
	}
		public static void methodA() throws ArithmeticException {
			int a,b,c,d;
			a=b=5;
			c=10;
			
			try {
				d= c/(a-b);
			} catch(ArithmeticException e) {
	 		//	e.printStackTrace();
				System.out.println("Please make sure value of and b are not same.");
				
				throw e;
			
			}
			System.out.println("Value of c is - " + c);
			
		}
		
		public static void methodC() {
			methodA();
			
		}
		public static void methodB() {
			
			
				try {
					methodA();
			
					}catch (ArithmeticException e){
						System.out.println("This is the handlind done in method B");
						
					}
				//throw new AirthmeticException("/by zero");
				//e1= new ArithmeticException("/by zero");
				//e =e1;
			
			
			
			
			
		}


	

}
