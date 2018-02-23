import java.util.Scanner;
public class P8_01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a 3-by-4 matrix row by row");
		double[] array1 = new double[4];
		double[] array2	= new double[4];
		double[] array3 = new double[4];
		for(int x =0; x < array1.length; x++) {
			double num1 = input.nextDouble();
			array1[x] = num1;
		}
		for(int y = 0; y < array2.length; y++) {
			double num2 = input.nextDouble();
			array2[y] = num2;
		}
		for(int z = 0; z < array3.length; z++) {
			double num3 = input.nextDouble();
			array3[z] = num3;
		}
		double multiArray [][] = {array1,array2,array3};
		double columnTotal = 0;
		for(int column = 0; column < 4; column++) {
			columnTotal = sumColumn(multiArray, column);
			System.out.println("Sum of the elements at column " + column + " is " + columnTotal);
		}
	}
	public static double sumColumn(double[][] m, int columnIndex) {
		double total = 0;
		for(int row = 0; row < m.length; row++) {
			total = total + m[row][columnIndex];
		}
		return total;
	}
}
