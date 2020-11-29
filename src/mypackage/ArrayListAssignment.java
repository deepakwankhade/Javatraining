package mypackage;

import java.util.ArrayList;
import java.util.List;

public class ArrayListAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Circle> listOfCircles = new ArrayList<Circle>();
		
		listOfCircles.add(new Circle());
		listOfCircles.add(new Circle(4,"red"));
		listOfCircles.add(new Circle(6,"blue"));
		listOfCircles.add(new Circle(5,"pink"));
		
		
		for(int i=0; i<listOfCircles.size();i++) {
			System.out.println(listOfCircles.get(i).getradius());
		}
		
		System.out.println("Other way to do it ");
		for (Circle c1 : listOfCircles) {
			System.out.println(c1.getradius());
		}

	}

}
