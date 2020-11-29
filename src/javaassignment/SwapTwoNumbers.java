package javaassignment;

import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y,t;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the two numbers x and y");
		x= sc.nextInt();
		y= sc.nextInt();
		System.out.println("Before swapping the numbers the value of x and y"+ x +" and"+ y);
		t=x;
		x=y;
		y=t;
		System.out.println("After the swappimng the numbers value of  x and y" + x +" and "+ y);
		System.out.println();

	}

}
