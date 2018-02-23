import java.util.Scanner;
public class P8_05 {

	// 1 2 3 4 5 6 7 8 9
	// 0 2 4 1 4.5 2.2 1.1 4.3 5.2
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
	//collects the matrix1 variables
		double matrix1 [][] = new double [3][3];
		System.out.println("Enter matrix1: ");
		for (int i = 0; i < matrix1.length;i++) {
			for(int j = 0; j < matrix1[i].length; j++) {
				matrix1[i][j] = input.nextDouble();
			}
		}
		
	//collects the matrix2 variables
		double matrix2 [][] = new double [3][3];
		System.out.println("Enter matrix2: ");
		for (int x = 0; x < matrix2.length; x++) {
			for(int y = 0; y < matrix2[x].length; y++) {
				matrix2[x][y] = input.nextDouble();
			}
		}
		double [][] sumMatrix = addMatrix(matrix1, matrix2);
		
		System.out.println("The matrices are added as follows");
		
		for(int a = 0; a < 3; a++) {
			for (int b = 0; b < 3; b++) {
				System.out.print(matrix1[a][b] + "    ");
				}
			if(a==1) {
				System.out.print("+  ");
			} else {
				System.out.print("\t");
			}
			for(int c = 0; c < 3; c++) {
				System.out.print(matrix2[a][c] + "    ");
			}
			if(a==1) {
				System.out.print("=  ");
			} else {
				System.out.print("\t");
			}
			for(int d = 0; d < 3; d++) {
				System.out.print(sumMatrix[a][d] + "    ");
			}
			System.out.print("\n");
			}
	}
	public static double[][] addMatrix(double[][] a, double[][] b){
		double[][] newMatrix = new double [3][3];
		
		for(int row = 0; row <3; row++) {
			for(int column = 0; column < 3; column++) {
			newMatrix[row][column] = a[row][column] + b[row][column];
		}
	}
	return newMatrix;
}
}

