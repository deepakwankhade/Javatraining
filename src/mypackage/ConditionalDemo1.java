package mypackage;

class ConditionalDemo1 {
	
    public static void main(String[] args){
        int value1 = 1;
        int value2 = 2;
        if((value1 == 1) && (value2 == 2) )
            System.out.println("value1 is 1 AND value2 is 2 - Line 9");
        value1 = value2;  
        
                   
        //
        if((value1 == 1) || (value2 == 1))  { 
            System.out.println("value1 is 1 OR value2 is 1 - Line 14");
        	value2 = 5 -value1 ;           
        }
                          
        if ((value1 == 2) || (value2 ==3)) {
        	System.out.println("Line 19");
        	}
    }
    

}


















