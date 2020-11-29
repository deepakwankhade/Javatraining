package mypackage;

public class CylinderDemo {

	public static void main(String[] args) {
	
		Cylinder cy1 = new Cylinder();
		System.out.println(cy1.getcolor("Blue"));
		cy1.setcolor("Pink");
		
		Cylinder cy2 = new Cylinder(12,"Red",5.5);
		System.out.println(cy2.calculateArea());
		cy2.setradius(6);
		
		
		Cylinder cy3 = new Cylinder();
		System.out.println(cy3.getHeight());
		
		cy3.setHeight(15);

	}

}
