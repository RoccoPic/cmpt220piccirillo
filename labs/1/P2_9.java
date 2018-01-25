import java.util.Scanner;
public class P2_9 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		System.out.print("Enter v0 in meters/second, v1 in meters/second, and t in seconds:");
		double v0 = input.nextDouble();
		double v1 = input.nextDouble();
		double t = input.nextDouble();
		double a = (v1 - v0) / t;
		System.out.println("The average acceleration is " + a);
	}
	
}
