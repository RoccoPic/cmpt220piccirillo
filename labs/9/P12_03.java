import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class P12_03 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		boolean runLoop = true;
		do {
			System.out.print("Enter an index");
			int index = input.nextInt();
			int array[] = new int[100]; //array made with 100 values
			for(int i = 0; i < array.length; i++) {
			array[i] = (int) ((Math.random() * 10) + 1); //assigns each index a value from 0-99
			}
		
			try { //tries the code, sort of like an if else
			System.out.print(array[index]); 
			runLoop = false;
			} catch (Exception ex){ //catches if there's an error of any kind
			System.out.print("Out of bounds.\n"); }
			} while(runLoop == true);
	}
}
	
	
	
	

