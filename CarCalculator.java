package ch4homework;

import java.util.Scanner;

public class CarCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner (System.in);
		
		System.out.println("Please enter the number of gallons of gas in the tank : ");
		double gallonsOfGas = in.nextDouble();
		
		System.out.println("Please enter the fuel efficiency in miles per gallon : ");
		double fuelEfficiency = in.nextDouble();
		
		System.out.println("Please enter the price of gas per gallon : ");
		double priceGas = in.nextDouble();
		
		double costPerMiles = priceGas * 100;
		
		double carDuration = gallonsOfGas * fuelEfficiency;
		
		System.out.println("The cost per 100 miles of your car is : " + costPerMiles);
		
		System.out.println("Your car can go for " + carDuration + " miles with " + gallonsOfGas + " gallons of gas in the tank.");

	}

}
