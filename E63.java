package practiceproblemsforfinal;

import java.util.Scanner;

public class E63 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int input = 0;
		int smallestInput = 999999;
		int largestInput = -999999;
		int evenInput = 0;
		int oddInput = 0;
		int sum = 0; 
		int previousInput = 999999;
		String sumTotal = "";
		String adjacentDuplicates = ""; 
		
		// Activating scanner 
		Scanner sc = new Scanner(System.in);
		
		// Asking for user inputs 
		System.out.println("Please enter integers,and I will tell you the smallest and largest of the inputs, the number of even and odd inputs, cumulative totals, as well as adjacent duplicates (ENTER 'STOP' to quit");
		
		//starting while loop 
		while (sc.hasNextInt()) { 
			input = sc.nextInt();
			
			// Test for largest and smallest integers
			largestInput = Math.max(largestInput, input);
			smallestInput = Math.min(smallestInput, input);
			
			// Test for number of even and odd inputs 
			
			if (input % 2 == 0)  {
				evenInput++;
			}
			else 
				oddInput++;
			
			// Test for cumulative totals
			
			sum += input;
			sumTotal += sum + " ";
			previousInput = input;
			
			// Test for adjacent Duplicates
			
			if (input == previousInput)
				adjacentDuplicates += input + "";

		} // while loop
		
		//Printing out requirements 
		System.out.println("The largest input is : " + largestInput);
		System.out.println("The smallest input is : " + smallestInput);
		System.out.println("The cumulative total is :  " + sumTotal);
		System.out.println("The number of even numbers is : " + evenInput);
		System.out.println("The number of odd numbers is : " + oddInput);
		
		//Checking for adjacent duplicates
		
		if (adjacentDuplicates != "") {
            System.out.printf("Adjacent duplicates: " + adjacentDuplicates);
        }
        else {
            System.out.println("There are no adjacent duplicates.");
        }
	}

}
