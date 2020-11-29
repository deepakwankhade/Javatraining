package mypackage;

public class BoxDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Box.boxID);
			
		Box myBox;
		myBox = new Box();
		System.out.println(myBox.getHeight());
		System.out.println(myBox.boxID);
		System.out.println(Box.boxID);//readability
		
		Box myBox1;
		System.out.println(Box.boxID);
		//There is no need to create an object
		
	}

}
