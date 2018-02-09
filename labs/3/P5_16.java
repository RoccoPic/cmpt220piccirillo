import java.util.Scanner;

public class P5_16 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Input integer");
		int num = input.nextInt();
		int factorTest = 2;
		System.out.print("The smallest factors of " + num + " are: ");
		while (num / factorTest !=  1) {
		
		if (num % factorTest == 0) {
			System.out.print(factorTest + ", ");
			num = num/ factorTest;
		}
		else
		{
			factorTest++;
		} 
		
	}
		System.out.println("and " + num + ".");
		
}
}