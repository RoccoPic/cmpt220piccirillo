import java.util.Scanner;
import java.util.Random;
public class P6_17 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter n: ");
		
		int n = input.nextInt();
		printMatrix(n);
		
	}
	public static void printMatrix(int n) {
		int cubed = n * n;
		Random rand = new Random();
		
		for (int i =1; i<=cubed; i++) {
			int randomNumber = rand.nextInt(2);
			System.out.print(randomNumber + " ");
			if (i % n == 0) {
				System.out.print("\n");
			}
		}
		}
	}

