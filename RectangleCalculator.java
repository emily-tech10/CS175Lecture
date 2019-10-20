package ch4homework;

import java.util.Scanner;

public class RectangleCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter the length of the rectangle : ");
		
		double lengthRectangle = in.nextDouble();
		
		System.out.println("Please enter the width of the rectangle : ");
		
		double widthRectangle = in.nextDouble();
		
		double area = lengthRectangle*widthRectangle;
		
		double perimeter = 2*(lengthRectangle+widthRectangle);
		
		double lengthSquared = Math.pow(lengthRectangle, 2);
		
		double widthSquared = Math.pow(widthRectangle,2);
		
		double diagonal = Math.sqrt(lengthSquared + widthSquared);
		
		System.out.println("The area of the rectangle is : " + area);
		
		System.out.println("The perimeter of the rectangle is : " + perimeter);
		
		System.out.println("The diagonal of the rectangle is : " + diagonal);
		
		
		
		
		
		
		
		

	}

}
