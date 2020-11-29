package mypackage;

public class PrePostDemo {

	public static void main(String[] args) {
		 int i = 3;	     		 
		    i++;
	        System.out.println(i);//4
	        ++i;		   	        
	        System.out.println(i);  //5
	       
	        System.out.println(++i);//6
	        //First increment and then use/print
	        
	        System.out.println(i++);//6, i=7
	        //first use/print and then increment
	        System.out.println(i);//7
	        i = 5;
	        int j = ++i;//increment first - 6 and then
	        //assign to j
	        System.out.println("Value of j is - " + j);//6
	        System.out.println(++i);//6
	        j=3;
	        j = i++; //j=6, i=7
	        System.out.println("Value of j is - " + j);//
	        System.out.println(i);   //
	        
	        i=7;	        
	        j=++i + i++; //
	        j = 8 + i++;
	        j = 8 + i++;
	        j =16;
	        i = 9;
	        
	        j=++i + ++i; //
	        j=8 + ++i;
	        j = 8 + 9;
	        j =17;		
	        i=9;
	        
	       // j=++i + ++i; //
	        //
	        System.out.println("value of J is - " + j);//
	        System.out.println(i);//
	        i=4;
	        j=5;
	        j = ++i + i++ + j++;//

	        System.out.println("j =" + j);//
	        System.out.println("i =" + i);//
	}

}
