package exceptionhandling;

public class InvalidBOXException extends RuntimeException {

	
	public  InvalidBOXException(String msg)
	  {
	     super(msg);
	     System.out.println("An attempt is made to create an Invalid BOx object ");
	  }
	class BOX
	{
	   private double length=2;
	   private double width =3;
	   private double height =4;
	   public BOX(double l, double w, double h)
	  {
	     If( l <=0 || w <= 0 || h <= 0);
	    throw new InvalidBOXException("Invalid BOX Object creation");
	    
	    
	}
	   
	double getLength() 
	{ return length; }
	   double getWidth()  { return width;  }
	   double getHeight() { return height; }

	   double Area()   { return 2*(length*width + width*height + height*length); }
	   double Volume() { return length*width*height ; }
	   }
	public void If(boolean b) {
		// TODO Auto-generated method stub
		
	}


	


}
