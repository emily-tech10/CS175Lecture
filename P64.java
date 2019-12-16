package practiceproblemsforfinal;
import  java.util.Scanner;;
public class P64 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer and I will display the factors of it: ");
		int integerInput = input.nextInt();
		int test = 2; 

		
		while (integerInput / test != 1) {
			
			if (integerInput % test == 0) {
				System.out.print(test + ", ");
				integerInput/= test; 
			}
			else
				test++; 
		}
		System.out.println(integerInput);
	}

}
