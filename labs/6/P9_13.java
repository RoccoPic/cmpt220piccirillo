import java.util.Scanner;
public class P9_13 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of rows and columns in the array");
		int row = input.nextInt();
		int column = input.nextInt();
		
		double[][] matrix = new double [row][column];
		
		System.out.print("Enter the array: ");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = input.nextDouble();
			}
		}
		Location maxValue = locateLargest(matrix);
		System.out.print("The location of the largest element is " + maxValue.maxValue + " at (" + maxValue.row + "," + maxValue.column + ")");
	}
	public static Location locateLargest(double[][] a) {
		return new Location(a);
	}
}
