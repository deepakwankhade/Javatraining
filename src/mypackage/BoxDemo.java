package mypackage;

import java.util.Scanner;

public class BoxDemo {
	static int length = 50;
	public static void main(String[] args) {
		length = 10;
		// TODO Auto-generated method stub
		Box myBox = new Box(2,3);//all variables gets default value, zero for integers
		//myBox is called object reference i.e. it is referencing an object
		System.out.println(myBox.readLength());//2
		Box myBox2;//variable of type Box
		myBox.setLength(15);
		myBox.setBoxName("White");
		myBox.setBoxName();
		myBox.boxID = 5;
		System.out.println(myBox.readLength());//2
		myBox.boxID = 7;
		myBox2 = new Box(5,4);
		myBox = myBox2;
		
		
		
		//unless you create an object you cannot use data inside the class
		//boxName will be null
		//Java by default initializes the non-primitive
		//variables to null
	//	System.out.println(myBox.length);//23
	/*	myBox.length = -1;
		myBox.width= 20;
		myBox.height = 5;*/
	//	System.out.println(myBox.length);//10
		myBox.printDim();
	//	myBox.keyboard.next();
		Box myBox1 = new Box();//java creates one copy each of all the variables in every object
	//	System.out.println(myBox1.length);//23
		myBox1.printDim();
		myBox.boxID = 9;
		System.out.println(myBox.boxID);
		System.out.println(myBox1.boxID);
		System.out.println(myBox2.boxID);
		
		myBox.boxID = 90;
		System.out.println(myBox.boxID);
		System.out.println(myBox1.boxID);
		System.out.println(myBox2.boxID);
		System.out.println(Box.boxID);
		
		
		
		Box myBox5 = new Box(10,0,0,"");
	/*	Box myBox7 = new Box(3,1,1);
		Box myBox8 = new Box(5,2,8);*/
		
		
		Box b1 = new Box();
		b1 = new Box(2,3,4,"Hi");
		b1 = new Box(3,2);
		Box b2 = b1;
	//	b1.
		
		
		
		//Neha is saying there are two length variables?
		//instance 
		
	//	myBox.;
		
		
		//new keyword creates an object in memory and allocates memory for variables defined
		// inside class
		
		
/*		Scanner keyboard;
		keyboard = new Scanner(System.in);
		keyboard.next()*/
	}

}
