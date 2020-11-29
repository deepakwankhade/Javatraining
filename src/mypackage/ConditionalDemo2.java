package mypackage;
// This is a comment which goes beyong the normal view of a developer.
// If this happens then developer finds it difficult to read

public class ConditionalDemo2 {
	//ternary (condition)? v1:v2
	public static void main(String[] args) {
	    int value1 = 7;
        int value2 = 4;
        int result;
        //boolean evaluate = true;
        boolean someCondition = (value1 < value2);//false
        result = someCondition ? value1 : value2;
        
      //  (condition)? v1:v2
     /*   if (someCondition)
        	result = value1;
        else
        	result = value2;*/
        System.out.println(result);//
	}

}
