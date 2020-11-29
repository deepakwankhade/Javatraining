package mypackage;

class ComparisonDemo {

	public static void main(String[] args) {
		int value1 = 5;
		int value2 = 7;
		if (value1 == value2)
			System.out.println("value1 == value2 - Line 9");
		value1 = 9 - value2; //4	
		
	//Which system.out.println will be used in the program. 
			//15,21
		if (value1 != value2) //
			System.out.println("value1 != value2 - Line 15"); //
		else if (value1 > value2) {
			System.out.println("value1 > value2 - Line 17");
			value1 = value2 - 1;//
		}
		if (value1 < value2)
			System.out.println("value1 < value2 - Line 21"); //
		else if (value1 >= value2)
			System.out.println("value1 <= value2 - Line 23"); //
		else
			System.out.println("Whatever - Line 25");
	}

}
