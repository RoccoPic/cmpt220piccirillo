import java.util.Scanner;
public class P2_5 
{
	public static void main(String[] args) 
	{
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the subtotal and a gratuity rate:" );
		
		double subtotal = input.nextDouble();
		double gratuity = input.nextDouble();
		
		double gratuityRate = gratuity * 0.01; // JA
		double total = subtotal + subtotal * gratuityRate; // JA
		
		System.out.print("The Gratuity Rate is $" + (subtotal * gratuityRate) 
		+ " and the total is $" + total); // JA
	}
	
}
