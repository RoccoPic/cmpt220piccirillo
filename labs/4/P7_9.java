import java.util.Scanner;
public class P7_9 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 10 numbers");
		double [] num = new double	 [10];
			
			for (int i = 0; i < num.length; i++) {
				num[i] = input.nextDouble();
			}
		System.out.println("The minimum number is " + min(num));
	}
	public static double min(double[] array) {
		double smallestNum = array[0];
		for (int i = 0; i < array.length; i++) {
			smallestNum = Math.min(array[(int) i], smallestNum);
			}
			return smallestNum;
		
	}
}
