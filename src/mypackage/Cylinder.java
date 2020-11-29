package mypackage;

public class Cylinder extends Circle {
	
	private static final int π = 0;
	private double Height;
	
	public Cylinder(double Height) {
		super();
		this.Height= Height;
		
	}
	
	public Cylinder() {
		super();
		this.Height = 7;
		
		}
	
	public Cylinder(int radius, String color,double cyHeight) {
		
		super(radius,color);
		this.setcolor("Black");
		
		this.Height=cyHeight;
		
	}
	
	/*public Cylinder(int radius, double cyHeight) {
		
		this.Height= cyHeight;
		
	}*/

	public double getHeight() {
		return Height;
	}

	public void setHeight(double Height) {
		//if(Height > 10 && super.getradius() >5)
		this.Height = Height;
	}
	
	
	public double calculateVol() {
		
		double vol;
		
		vol=calculateArea()*Height;
		
		return vol;
	}
	
	@Override
	
	public double calculateArea() {
		double radius = 5.2;
		
		double areaCylinder;
		//A=2πrh+2πr2
		
		areaCylinder= 2*3.14*radius*Height+2*3.14*radius*radius;
		return areaCylinder ;
		
	}
	
	
	
	
	
		
}

	
	


