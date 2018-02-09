import java.util.Scanner;
public class P5_1 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer, end with 0: ");
		int positive = 0;
		int negative = 0; 
		double total = 0;
		double average = 0;
		int count = 0;
		boolean runloop = true;
		while (runloop == true) 
		{
			int num = input.nextInt();
			
			if (num > 0) 
			{
				positive++;
				count++;
				total = total + num;
			} 
			else if (num < 0)
			{
				negative++;
				count++;
				total = total + num;
			}	 
			else if (num == 0) 
			{
			runloop = false;
			} 	
		} 
		average = total / count;
		System.out.println("The number of positives is " + positive +"\nThe number of negatives is " + negative + "\nThe total is " + total + "\nThe average is " + average);
	
	}
}
