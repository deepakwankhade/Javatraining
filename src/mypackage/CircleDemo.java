package mypackage;

public class CircleDemo {

	public static void main(String[] args) {
		
		Circle c1 = new Circle();
		System.out.println(c1.getradius());
		c1.setradius(1.5);
		
		c1.setcolor("Black");
		c1.setcolor("Blue");
		
		Circle c2 = new Circle(5,"Red");
		System.out.println(c2.getcolor("black"));
		
		System.out.println(c2.calculateArea());
		

	}

}
