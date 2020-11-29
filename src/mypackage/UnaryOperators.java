package mypackage;

public class UnaryOperators {
	static int  result;
	public static void main(String[] args) {
		int result = 3;
		result += 51;//result = result + 51;
		System.out.println(result);//54
		result =+ 51; // 
		result = +51;
		result = 51;
		
		System.out.println(result);//51
		
		result = 1;
		System.out.println(result);//1
		result = +1;//
		System.out.println(result);//1
	    result--;//result = result - 1
        System.out.println(result);//0
        result++; //result = result + 1; 
        System.out.println(result);//1
        result = -result;//
        System.out.println(result);//-1
        result =- result; 
        result = -result;
        result = -(-1);
        result = 1;
        System.out.println(result);//1        
        result -= 4;//
        result = result -4;
        result = 1 - 4;
        result= -3;
        System.out.println("MyResult " + result);//

        boolean success = false;
       
        System.out.println(success);//false
               
        boolean failure = !success;//true
        System.out.println(success);//false
        System.out.println(failure);//true
        System.out.println(!success);// true 
        System.out.println(!(5>4));//false
	}

}
