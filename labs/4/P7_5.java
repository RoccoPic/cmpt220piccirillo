import java.util.Scanner;
import java.util.ArrayList;
public class P7_5 
{
	public static void main(String args[]) 
		{
		Scanner input = new Scanner(System.in);
		
		//declares the array
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		ArrayList<Integer> distinct = new ArrayList<Integer>();
		
		System.out.println("Enter 10 numbers: ");
		//collects all the numbers
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		int num4 = input.nextInt();
		int num5 = input.nextInt();
		int num6 = input.nextInt();
		int num7 = input.nextInt();
		int num8 = input.nextInt();
		int num9 = input.nextInt();
		int num10 = input.nextInt();
		
		//add thems to the array list
		numbers.add(num1);
		numbers.add(num2);
		numbers.add(num3);
		numbers.add(num4);
		numbers.add(num5);
		numbers.add(num6);
		numbers.add(num7);
		numbers.add(num8);
		numbers.add(num9);
		numbers.add(num10);
		
		int distinctNumbers = 0;
		int location = 0;
		for(int i = 1; i <= 10; i++) {
			while (numbers.contains(i) == true) {
				location = numbers.indexOf(i);
				numbers.remove(location);
				
				if(numbers.contains(i) == false)
				{ 
					distinct.add(i);
					distinctNumbers++;
					
				}
			}
		}
		System.out.println("The number of distinct numbers is " + distinctNumbers);
		System.out.println("The distinct numbers are: " + distinct.toString().replace("[", "").replace("]", ""));
		}
}