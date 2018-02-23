import java.util.Scanner;
public class P7_19 {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of the list: ");
		
		int listSize = input.nextInt();
		int numbers []= new int[listSize]; 
		
		System.out.println("Enter the contents of the list: ");
		//stores values into the array
		for(int i =0; i < listSize; i++) {
			int num = input.nextInt();
			numbers[i] = num;
		}
		//prints the values
		System.out.print("The list has " + listSize + " integers: " );
		for(int j = 0; j < numbers.length; j++) {
		System.out.print(numbers[j] + " ");
	}
		boolean isSorted = isSorted(numbers);
		if(isSorted == true) {
			System.out.println("\nThe list is sorted.");
		} else if (isSorted == false) {
			System.out.println("\n The list is not sorted.");
		}
	}
	
	public static boolean isSorted(int[] list) {
		for(int x = 0; x < list.length; x++) {
			for(int y = x+1; y <list.length; y++ ) {
				if(list[x] > list[y]) {
					return false;
				}
			}
		}
		return true;
	}
}
