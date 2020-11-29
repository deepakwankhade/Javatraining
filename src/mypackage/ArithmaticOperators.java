package b_Operators;

public class ArithmaticOperators {
	//static int result3;
	int result;
	public static void main(String[] args) {
		System.out.println();
		// TODO Auto-generated method stub
		int result = 1 + 2;
		//result is a local variable having no existence outside this method
//		result123 = 6;
		// result is now 3
    //    i=10;
		System.out.println("1 + 2 = " + result );
        int original_result = result;
        int result1;
        result1= getValueOfI(result);//result remains 3 but result1 becomes 4
        //Above you are not passing variable(not passing result), 
        // you are passing value of the variable i.e. 3
        System.out.println("Checking this - value of result variable is - " + result);//3
   //     Thread.sleep(5000);
        System.out.println("value of result1 variable is - " + result1);
        System.out.println("value of orignal_result variable is - " + original_result);
        getValueOfI(10);
        result1 = getValueOfI(result);
        System.out.println("value of result variable is - " + result);
        System.out.println("value of result1 variable is - " + result1);
        getValueOfI(result1);
        System.out.println(getValueOfI(result1));
       // System.out.println(printMyName("Ketan"));
        result = 3;
        result = result - 1;
        // result is now 2
        System.out.println(original_result + " - 1 = " + result);
        original_result = result;

        result = result * 2;
        // result is now 4
        System.out.println(original_result + " * 2 = " + result);
        printMyName("Ketan");
        original_result = result;

        result = result / 2;
        // result is now 2
        System.out.println(original_result + " / 2 = " + result);
        original_result = result;
        int sum = sum(3,4);
        result = result + 8;
        // result is now 10
        System.out.println(original_result + " + 8 = " + result);
      
        original_result = result;

        result = result % 7;//10/7 remainder is 3 
        // result is now 3
        System.out.println(original_result + " % 7 = " + result);
        System.out.println();
        //comment.Comment
        
	}//End of main()
	
	//Method declaration
	public static int getValueOfI(int result) {	//result = 3	
		//int result = 6;
		//another variable is born with the same name - result
		//this result is a local variable for method getValueOfI()
			System.out.println(result);
		return result = result + 1;//result 4
		//return "Hi";//died - does not have any existence 
	}
	
	public String toUpperCase(String input) {
	//	result = 6;
	//	result = 7;
		return input.toUpperCase();
	//	System.out.println("Hi");
				
	}
	
	public static void printMyName(String name) {
		//result = 10;
		String result;
		System.out.println(name);
		result = "5";
		
	}
	
	public void printCompanyName() {
		System.out.println("Niche Thyself");
		result = 5;
	
	}
	
	public  static int sum(int i,int j) {
	//	result = 5;
		return i+j;	
	}
	
	public int method1(int i, int j) {
		printCompanyName();
		int myName;
		sum(4,5);
		result = 7;
		return 78;
	}
	
}
