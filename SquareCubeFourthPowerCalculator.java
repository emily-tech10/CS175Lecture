package ch4homework;

import java.util.Scanner;

public class SquareCubeFourthPowerCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner in = new Scanner(System.in);

	System.out.print("Please enter a number of your choice :  ");
	double x = in.nextDouble();
	
	double squareRoot = x*x;
	
	double cubedRoot = x*x*x; 

	double fourthRoot = Math.pow(x,4);
	
	System.out.println("The value of your number squared is: " + squareRoot);
	
	System.out.println("The value of your number cubed is: " + cubedRoot);
	
	System.out.println("The value of your number raised to the fourth power is: " + fourthRoot);
	
	
	
	
	

	
	
	}

}
