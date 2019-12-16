package practiceproblemsforfinal;
import java.util.Scanner;
public class StandardDeviation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
        System.out.print("Please enter a set of numbers and I will compute and print out the count, average , and standard deviation of the set : ");

        int countInput = 0;
        int sum = 0;
        double standardDev = 0;

        while (input.hasNextDouble()) {
            double number = input.nextDouble();
            standardDev += (number * number);
            sum += number;
            countInput++;
        }

        double average = sum / countInput;

        standardDev = standardDev - (1 / countInput) * Math.pow(sum, 2);
        standardDev = standardDev / (sum - 1);
        standardDev = Math.sqrt(standardDev);

        System.out.printf("Count of all values is: " + countInput);
        System.out.printf("Average of all values is: ", + average);
        System.out.printf("Standart deviation of all values is:" + standardDev);


	}

}
