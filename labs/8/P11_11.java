import java.util.ArrayList;

import java.util.Scanner;
public class P11_11 {
 public static void main(String args[]) {
	 Scanner input = new Scanner(System.in); 
	 ArrayList<Integer> list = new ArrayList<Integer>();
	 
	 System.out.print("Enter five numbers in any order");
	 for(int i = 0; i < 5; i++) {
		 list.add(input.nextInt());
	 }
	 //calls the method
	 sort(list);
	
	 System.out.print(list);
 }
 //sorts the array from min to max
	 public static void sort(ArrayList<Integer> list) {
		 java.util.Collections.sort(list);
	 
 }
}
