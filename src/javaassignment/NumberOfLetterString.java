package javaassignment;

public class NumberOfLetterString {

	public static void main(String[] args) {
		
		String SearchMe = "SELENIUM";
		int max = SearchMe.length();
		System.out.println(SearchMe);
		//System.out.println("The length of the String " + max);
		int numEs=0;
		for(int i =0; i < max; i++) {
			
			if(SearchMe.charAt(i)!= 'E')
			{
				continue;
			}
			numEs++;
		}
		
		System.out.println("Number of Es in the String"+ numEs);
	}

}
