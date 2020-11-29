package mypackage;

import java.util.ArrayList;
//import java.util.List;
//import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

//import a_basics.Circle;
//import d_classDemo.AclassNinheritance.Bicycle;

public class ArrayListExampleFinal {//extends Object
//Object
	public static void main(String[] args) { //int
		//        ArrayList Creation
		//WebDriver driver = new FirefoxDriver();
		Float f;
		Boolean b;
		List firstList = new ArrayList(); //raw list, Object
		List<Integer> myIntegers = new ArrayList();//Generics
		List<String> arraylistB = new ArrayList(); //list using generics //type safety
		//List<Double> arraylistD = new ArrayList<>();
		List<Bicycle> arrayOfBicycles = new ArrayList();
		List<Circle> arrayOfCircles = new ArrayList<Circle>();
		//        Adding elements to the ArrayList
		/*
		 * listOfCircle.add()
		 An ArrayList capacity is the size of the array used to store the 
		 elements in the list.As elements are added to an ArrayList, its 
		 capacity grows automatically.It is an Array based implementation
		 where elements of the List can be accessed directly through
		 get() method.
		 A[2], firstList.get(2), firsList.size(), A.length
		 */
		for (int i = 0; i < 5; i++) {
			firstList.add(new Integer(i));//wrapper class for int 
		//	firstList.add(i);//autoboxing & autounboxing
			//myIntegers.add(i);
		}
		int k = (int)firstList.get(3);
		//int m = myIntegers.get(3);
	//	int m = myIntegers.get(3) + 5;
	//	firstList.add(new Circle(3,"Red"));
		//firstList.add(new Bicycle(3,4,5));
//*		Bicycle bike111 = new Bicycle(4,5,2);
//		firstList.add(bike111);
	//	Circle c3 = (Circle)firstList.get(4);
		
	//	Bicycle I3 = (Bicycle)firstList.get(5);
	//	firstList.add(firstList.get(4))
//		Integer b2 = (Integer)firstList.get(5);
		//int z1 = (Integer)firstList.get(4);
		
		arraylistB.add("beginner");
		arraylistB.add("java");
		arraylistB.add("tutorial");
		arraylistB.add("make");
		arraylistB.add("java");
		arraylistB.add("very");
		arraylistB.add("easy");
		String tutorialValue = arraylistB.get(2); //Object
		//arraylistB.add(new Integer(25));
		Bicycle bike1 = new Bicycle(10,10,10);
		//arraylistB.add(bike1);
		
		//arraylistB.add(new Bicycle(10,10,10));
	//	Bicycle b1 = new Bicycle(10,10,10);
	//	b1.getCadence();
		//arrayOfBicycles.add(b1);  //cadence, speed, gear
		arrayOfBicycles.add(new Bicycle(4,3,6));
		arrayOfBicycles.add(new Bicycle(1,2,6));
		arrayOfBicycles.add(new Bicycle(10,9,8));
		arrayOfBicycles.add(new Bicycle(1,6));
		int ket = arrayOfBicycles.get(2).getCadence();
		//Bicycle bike1 = new Bicycle(3,4,5);
		//bike1.getCadence();
		//Bicycle keto = arrayOfBicycles.get(2);
		//int ket = keto.getCadence();
		//arrayOfBicycles.get(2).setGear(20);
		
		arrayOfCircles.add(new Circle(2,"Black"));
		arrayOfCircles.add(new Circle());
		arrayOfCircles.add(new Circle(16,"Red"));
		arrayOfCircles.add(new Circle(8,"Yellow"));
		
		double radius = arrayOfCircles.get(2).getRadius();
		//String color = arrayOfCircles.get(3).getColor();
		
		System.out.println();
		System.out.print("ArrayList firstList --> ");
		for (int j = 0; j < firstList.size(); j++) {//5
			System.out.print(firstList.get(j) + " , ");//assignment is remove last comma which comes in the output
		}
		
		for(Object oneObjectAtATime:firstList ) {
			System.out.println(oneObjectAtATime + " , ");
		}
		
		
		
		
		
		
		System.out.println();
		
		for (int j = 0; j < arrayOfBicycles.size(); j++) {
			System.out.println("Cadence of Bicycle " + j + " is - " + arrayOfBicycles.get(j).getCadence() + " , ");
		}
		
		for (Bicycle oneBicycleAtATime: arrayOfBicycles) {
			System.out.println("Cadence of Bicycle is - " + oneBicycleAtATime.getCadence() );
		}
		
		for (String oneStringAtATime : arraylistB) {
			System.out.println(oneStringAtATime);
		}
		
		for (Bicycle bike: arrayOfBicycles) {
			System.out.println(bike.getCadence());
		}
		
		System.out.println();
		int index = arraylistB.indexOf("java");//
		System.out.println("'java' was found at : " + index);
		int lastIndex = arraylistB.lastIndexOf("java");//4
		System.out.println("'java' was found at : " + lastIndex
				+ " from the last");
		System.out.println();
		//        Getting the subList from the original List
		List subList1 = firstList.subList(3, firstList.size());
		System.out.println("New Sub-List(firstList) from index 3 to "
				+ firstList.size() + ": " + subList1);
		System.out.println();
		//        Sort an ArrayList
		System.out.print("Sorted ArrayList firstList --> ");
		//Collections mycoll = new Collections();
		//mycoll.sort(list);;
		Collections.sort(firstList);//Collections is a class//0,1,2,3,4
		Collections.sort(arraylistB);//alphabetically
		//Any class we use inside sort method 
		//should implement Comparable interface. 
		//Comparable interface has a method, compareTo()
		//This method will provide the logic for sorting
		//Collections.sort(arrayOfBicycles);
		//Collections.sort(arrayOfCircles);
		//Circle class should implement Comparable interface
		//and implement compareTo() method
		
		System.out.print(firstList);
		System.out.println();
		//      Reversing an ArrayList
		System.out.print("Reversed ArrayList firstList --> ");
		Collections.reverse(firstList);
		System.out.println(firstList);
/*		List<Scanner> myInputList = new ArrayList();
		Collections.sort(myInputList);*/
		System.out.println();
		//		Checking emptyness of an ArrayList
		System.out.println("Is firstList empty?   "
				+ firstList.isEmpty()); //false
		System.out.println();
		//        Checking for Equality of ArrayLists
		//ArrayList arraylisC = firstList;
		List arraylistC = new ArrayList(firstList);                                //create a copy of arraylist
		//We are not using generics
		//parent reference pointing to child object
		//
		//	arraylistC.add(new Integer(4));
		System.out.println("firstList.equals(arraylistC)? "
				+ firstList.equals(arraylistC));//True/False
		System.out.println();
		//        Converting an ArrayList to an Array
		Object[] array = firstList.toArray();
	//	Object[] circleArray = arrayOfCircles.toArray();
		for (int i = 0; i < array.length; i++) {
			System.out.println("Array Element [" + i + "] = " + array[i]);
		}
		System.out.println();
		//        Clearing ArrayList Elements
		firstList.clear();
		System.out.println("firstList after clearing  : " + firstList);
		System.out.println();
		List<String> stringData = new ArrayList();
		
		
		List<Circle>  myCircles= new ArrayList();
		
		myCircles.add(new Circle(4,"Red"));
		myCircles.add(new Circle(6,"Black"));
		myCircles.add(new Circle(2,"White"));
		
		for (Circle oneCircle:myCircles) {
			System.out.println(oneCircle.calculateArea());
		}
		
		
	}
}