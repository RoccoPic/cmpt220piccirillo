import java.util.Scanner;

public class P2_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter temperature in degress Celcius: ");
		double celcius = input.nextDouble();
		
		double farenheit = 9.0 / 5 * celcius + 32;
		
		System.out.print("The current temperature in Farenheit is: " + farenheit);
}
	}