import java.util.Scanner;
import java.util.ArrayList;
public class P7_3 
{
	public static void main(String args[]) 
		{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the integers between 1 and 100: ");
		//declares the array
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		boolean runloop = true;
		while (runloop == true)
		{
			 int answer = input.nextInt();
			if (answer == 0) 
			{
				runloop = false; 
			} else 
				{
				numbers.add(answer);
				runloop = true;
				}
		
		}
		int count;
		int location;
			for(int i =1; i<=100; i++) 
			{
				count = 0; 
				while(numbers.contains(i) == true) 
				{
					location = numbers.indexOf(i);
					numbers.remove(location);
					count++;
					if(numbers.contains(i) == false && count > 1)
					{
					System.out.println(i + " occurs " + count + " times");
				} else if (numbers.contains(i) == false && count == 1){
					System.out.println(i + " occurs " + count + " time");
				}
				}
			}
	}
}
