package javaassignment;

public class ArmStrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number=153,originalNumber,remainder,result =0;
		originalNumber =number;
		while(originalNumber != 0) {
			remainder= originalNumber/10; //1  //0 //0 //4
			result += Math.pow(remainder,3); //1 //64
			
			originalNumber/=10; //3 ////4
			
		}
		if (result == number) {
			System.out.println(number + "Number is armstrong Number");
			
		}else {
			System.out.println(number + "Number is not armstrong number");
		}
		

	}

}
