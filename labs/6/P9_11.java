import java.util.Scanner;
public class P9_11 {
public static void main (String args[]) {
	//test values
	//9.0 4.0 3.0 -5.0 -6.0 -21.0
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter a value for a ");
	double a = input.nextDouble();
	
	System.out.print("Enter a value for b ");
	double b = input.nextDouble();

	System.out.print("Enter a value for c ");
	double c = input.nextDouble();
	
	System.out.print("Enter a value for d ");
	double d = input.nextDouble();
	
	System.out.print("Enter a value for e ");
	double e = input.nextDouble();
	
	System.out.print("Enter a value for f ");
	double f = input.nextDouble();
	LinearEquation linearEquation = new LinearEquation(a, b, c, d, e, f);
	
	
	if(linearEquation.isSolvable()) {
		System.out.print("X: " + linearEquation.getX() + "\nY: " + linearEquation.getY());
	} else {
		System.out.print("The equation has no solution");
	}
}
}
