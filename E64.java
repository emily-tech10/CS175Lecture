package practiceproblemsforfinal;
import java.util.Scanner;
public class E64 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		String uppercase = "";
		String secondLetter = ""; 
		String underscore = null; 
		String vowelPosition = "";
		int vowelCount = 0;
		
		System.out.println("Please enter a string and I will print out characteristics of the string: ");
		String input = sc.nextLine();

		//Part a: Prints out only uppercase letters in the string 
		for (int i = 0; i < input.length(); i++) {
			if (Character.isUpperCase(input.charAt(i))) {
				uppercase += input.charAt(i) + " ";
			}
		}
		System.out.println("Uppercase letters: " + uppercase);
		
		//Part b: Prints out second letter of every string
		if (input.length() < 2) {
			System.out.print("The string only contains one character.");
		}
		else {
			for (int i = 1; i < input.length(); i += 2) {
				secondLetter += input.charAt(i) + " ";
			}
			System.out.println("Every second letter: " + secondLetter);
		}
		
		//Part c: Print out has all the vowels replaced by underscores 
		underscore = input.replaceAll("a|e|i|o|u|A|E|I|O|U", "_");
		System.out.println("All vowels replaced by underscores: " + underscore);
		
		//Part d & e : number of vowels + vowel position 
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == 'a' || input.charAt(i) == 'A' || 
					input.charAt(i) == 'e' || input.charAt(i) == 'E' ||
					input.charAt(i) == 'i' || input.charAt(i) == 'I' || 
					input.charAt(i) == 'o' || input.charAt(i) == 'O' ||
					input.charAt(i) == 'u' || input.charAt(i) == 'U') {
				vowelCount++;
				vowelPosition += (i + 1) + " ";
			}
		}
		System.out.println("Number of vowels: " + vowelCount);
		System.out.println("Vowel positions: " + vowelPosition);
		
		
					
		}
		
		
		

	}

	
