package practiceproblemsforfinal;
import java.util.Scanner;
public class E611 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
System.out.println("Please enter a word and I will determine how many vowels are in that word");
		
		Scanner input = new Scanner(System.in);
        String word = input.next();
        input.close();
        
        for (int i = 0; i < word.length(); i++) {
        	if (word.charAt(i) == 'a' || word.charAt(i) == 'o' || word.charAt(i) == 'e'||
                    word.charAt(i) == 'u' || word.charAt(i) == 'i' || word.charAt(i) == 'y') {
                    System.out.print(word.charAt(i) + " ");
	}

}
	}
	
}
