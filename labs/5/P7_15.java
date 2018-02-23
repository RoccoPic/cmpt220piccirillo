import java.util.Arrays;
import java.util.Scanner;

public class P7_15 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		int numbers[] = new int[10];
		
		System.out.println("Enter 10 numbers: ");
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextInt();
			//what this does is it takes 10 values for the array and runs until it is full
		}
		int[] distinctNum = eliminateDuplicates(numbers);
		
		System.out.print("The distinct numbers are: ");
		for (int i = 0; i < distinctNum.length; i++) {
			//checks if a value repeats more than once 
			
				//prints if the value is repeated more than one time
				System.out.print (distinctNum[i] + ", ");
		}

	}
	public static int[] eliminateDuplicates(int[] list) {
		int numCheck = list.length;
		for(int x = 0; x < numCheck; x++) {
			for (int y = x + 1; y < numCheck; y++) {
				if (list[x] == list[y]) {
					list[y] = list[numCheck -1];
							numCheck--;
							y--;
				}
			 }
		 }
		int[] duplicate = Arrays.copyOf(list, numCheck);
		return duplicate;
	}
	
		}
	

