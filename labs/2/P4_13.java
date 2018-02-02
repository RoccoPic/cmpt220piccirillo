import java.util.Scanner;
public class P4_13 {
 public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		int runloop =  0;
		while (runloop == 0) {
			
		System.out.println("Please input a letter: ");
			char letter = input.next().charAt(0);
			char upperletter = Character.toUpperCase(letter);
		
			if(Character.isLetter(letter) == false) {
				System.out.println(letter + " is not a valid input.");
			} else if (upperletter == 'A' || upperletter == 'E' || upperletter == 'I' ||  upperletter == 'O' ||  upperletter == 'U')
				{
				System.out.println(letter + " is a vowel.");
				runloop = 1;
			} else {
				System.out.println(letter + " is a consonent.");
				runloop = 1;
			}
		}
 	}
}
