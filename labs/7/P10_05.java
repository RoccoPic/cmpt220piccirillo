import java.util.Scanner;
public class P10_05 {
	public static void main (String args[]) {
		Scanner input = new Scanner(System.in);
			System.out.print("Enter a positive integer: ");
			int num = input.nextInt();
			
		System.out.print("The given integer is " + num + " and the smallest factors are: ");
		
		StackOfIntegers stack = new StackOfIntegers(num);

		int factorTest = 2;
		//finds smallestFactors and pushes them
		while (num / factorTest !=  1) {
			
			if (num % factorTest == 0) {
				stack.push(factorTest);
				num = num/ factorTest;
			}
			else
			{
				factorTest++;
			} 
		}
		stack.push(num);
		
		while(!stack.empty())
			System.out.print(stack.pop() + " ");
	}
}
