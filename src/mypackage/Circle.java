package mypackage;

public class Circle {
	
	 private double radius =10;
	 private String color ="Green";
	
	public Circle() {
		this.radius= 5;
		this.color = "Black";
		
		
	}
	
	public Circle(double radius,String color) {
		if(radius>2) {
			this.radius= radius;
			this.color =color;
		}
		
	}
	
	public double getRadius() {
		return radius;
		
	}
	
	public void setRadius(double radius) {
		
		if (radius > 2) {
			
			this.radius= radius;
			
		}
		else {
			System.out.println("Invalid radius");
			
		}
					
		}
	
		
	public String getColor(String color) {
		return color;
		
	}
	public void setColor(String color) {
		
		if (color=="Black") {
			this.color= color;
					}
		else {
			
			System.out.println("Invalid color");
		}
		
	}
	
	public double calculateArea() {
		
		double area;
		
		area=radius*radius*Math.PI;
		
		return area;
	}
	
	
	
	

}
