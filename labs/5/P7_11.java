import java.util.Scanner;

public class P7_11 {
	public static void main(String args []) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please Enter 10 Numbers: ");
		double[] numbers = new double[10];
		
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextDouble();
		}
		System.out.printf("The mean is %.2f\n " , mean(numbers));
		System.out.printf("The standard deviation is %.5f", deviation(numbers));
		
	}
	public static double mean(double[] x) {
		double sum = 0;
		for(double i : x) {
				sum +=i;
		}
		return sum / x.length;	}
	public static double deviation(double[] x) {
		double mean = mean(x);
		double dev = 0;
		for(double i : x) {
			dev += Math.pow(i - mean, 2);
		}
		return Math.sqrt(dev / (x.length-1));
	}
}
	