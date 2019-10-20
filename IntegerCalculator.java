package ch4homework;

import java.util.Scanner;

public class IntegerCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter an integer: ");
		int x = in.nextInt();
		
		System.out.print("Please enter another integer: ");
		double y = in.nextInt();
		
		double sum = x + y; 
				
		double difference = x - y; 
		
		double product = x*y;
		
		double average = (x+y)/2;
		
		double distance = Math.abs(average);
		
		double maximum = Math.max(x,y);
		
		double minimum = Math.min(x,y);
		
		System.out.println("The sum of your two numbers is : " + sum);
		
		System.out.println("The difference of your two numbers is : " + difference);
		
		System.out.println("The product of your two numbers is : " + product);
		
		System.out.println("The average of your two numbers is : " + average);
		
		System.out.println("The distance of your two numbers is : " + distance);
		
		System.out.println("The maximum of your two numbers is : " + maximum);
		
		System.out.println("The minimum of your two numbers is : " + minimum);
		
		
		
		
	}

}
