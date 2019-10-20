package ch4homework;

import java.util.Scanner;

public class MeasurementConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter a measurement in meters : ");
		
		double measurementMeters = in.nextDouble();
		
		double miles = measurementMeters*0.000621; // 1 meter = 0.000621 miles
		
		double feet = measurementMeters*3.281; // 1 meter = 3.281 feet 
		
		double inches = measurementMeters*39.37; // 1 meter = 39.37 inches
		
		System.out.println("Your measurement in miles is : " + miles);
		
		System.out.println("Your measurement in feet is : " + feet);
		
		System.out.println("Your measurement in inches is : " + inches);
		
		
		
		
		
		
		
		
		
		

	}

}
