import java.util.Scanner;
public class P4_9 {
 public static void main(String[] args) {
	 Scanner input = new Scanner(System.in);
	 
	 System.out.println("Please input a character: ");
	 char character = input.next().charAt(0);
	 
	 System.out.println("The unicode for the character " + character + " is " + (int)character + ".");
 }
}
