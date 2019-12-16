package practiceproblemsforfinal;
import java.util.Scanner; 
public class E66 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		float input = 0;
		float sum = 0;
		float average = 0;
		float largest = -999999;
		float smallest = 999999;
		float range = 0;
		int count = 0;
		
		System.out.println("Enter a set of floating-point values and I will compute the average of the values, the smallest of the values, the largest of the values, and the range of the values: ");
		
		while (sc.hasNextFloat()) {
			input = sc.nextFloat();
			//Calculates sum and count to use for average calculation
			sum += input;
			count++;
			
			//Calculates smallest and largest values
			largest = Math.max(largest, input);
			smallest = Math.min(smallest, input);
		}
		
		//Calculates average value and range between smallest and largest
		average = sum / count;
		range = largest - smallest;
		
		//Prints all calculations to user
		System.out.println("The average value in your set is : " + average);
		System.out.println("The smallest value in your set is : " + smallest);
		System.out.println("The largest value in your set is " + largest);
		System.out.println("The range between the largest and smallest value in your set is " + range);
		
		

	}

}
