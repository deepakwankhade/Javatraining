package mypackage;

import java.util.Scanner;

public class Box {
	
	//Instance variables, fields, member variables
	private int length=23;//32 bit
	private int width=10;//32 bit
	private int height=10;//32 bit
	private String boxName;
	private Scanner keyboard = new Scanner(System.in);
	public static int boxID;
	
	
	//no return type given, method should start with lower case
	//special method - Constructor of class
	//Use of constructor to initialize the instance variables
	// Constructors initialize the state of the object
	public Box(int l, int width, int height, String boxName) {//local variable
	if (l > 0 & width > 0 & height > 0) {
		this.length = l;
		this.width = width;
		this.height = height;//parameter - both are parameter 
	}
	}
	
	public Box() {
		this.length = 4;
		width = 6;
		height =2;
	}
	
	public Box(int l, int w) {
		this.length = l;
		width = w;
		height =2;
	}
	
	//setter method
	public void setLength(int length) {
		if (length > 0)
			this.length = length;
		else
			System.out.println("Invalid length");
	}
	
	//getter
	public int readLength() {
		return length;
	}
	
	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getBoxName() {
		return boxName;
	}

	public void setBoxName(String boxName) {
		this.boxName = boxName;
	}
	
	public void setBoxName() {
		this.boxName = "Black";
	}
	

	public Scanner getKeyboard() {
		return keyboard;
	}

	public void setKeyboard(Scanner keyboard) {
		this.keyboard = keyboard;
	}

	public int getWidth() {
		return width;
	}
	
	public void setWidth(int width) {
		if (width > 0)
			this.width = width;
	}
	
	
	//"this" keyword referes to object reference
	
	//can we initialize the variables inside the class
	//Yes
	//What is it that happens when you pass System.in in Scanner
	//Can we create a method inside Box class and then call that method from BoxDemo, Yes
	//Do we need to release the memory - No - Java takes care of it. - GC- Garbage collection
	
	//Why Box() is not accepting System.in while Scanner() is accepting System.in
	public void printDim() {
		//int i;//both y and i are local variables, they are not instance variables
		
		System.out.println("Lenght is - " + length);
		System.out.println("Width is - " + width);
		System.out.println("Height is - " + height);
	}
	
	
	//getter method - reading the value of an instance variable
	//setter method - changing the value of an instance variable
	
	//I will explain Box myBox = new Box()
	
	
}
