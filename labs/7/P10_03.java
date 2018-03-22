
public class P10_03 {
	public static void main(String[]args) {
	//test values 
	int[] values = {1, 2, 3, 4, 5,};
	
	//isEven,Odd,Prime(int)
	System.out.print("isEven(int) tests if the values are even:\n");
	for (int i = 0; i <values.length; i++) {
		System.out.println(values[i] + " is even: " + MyInteger.isEven(values[i]));
	}
	System.out.print("isOdd(int) tests if the values are odd:\n");
	for (int i = 0; i < values.length; i++) {
		System.out.println(values[i] + " is odd: " + MyInteger.isOdd(values[i]));
	}
	System.out.print("isPrime(int) tests if the values are prime:\n");
	for (int i = 0; i < values.length; i++) {
		System.out.println(values[i] + " is prime: " + MyInteger.isPrime(values[i]));
	}
	//MyInteger(), isEven(), isOdd(), isPrime(), and getValue()
	System.out.print("isEven() test to see if values are even:\n");
	for (int i = 0; i < values.length; i++) {
		// Create a MyInteger
		MyInteger value = new MyInteger(values[i]);
		System.out.println(value.getValue() + " is even: " + value.isEven());
	}
	System.out.print("isOdd() test to see if values are odd:\n");
	for (int i = 0; i < values.length; i++) {
		// Create a MyInteger
		MyInteger value = new MyInteger(values[i]);
		System.out.println(value.getValue() + " is odd: " + value.isOdd());
	}
	System.out.print("isPrime() test to see if values are prime:\n");
	for (int i = 0; i < values.length; i++) {
		// Create a MyInteger
		MyInteger value = new MyInteger(values[i]);
		System.out.println(value.getValue() + " is prime: " + value.isPrime());
	}
	//tests isEven,isOdd,isPrime(MyInteger)
	System.out.print("isEven(MyInteger) test to see if values are even:\n");
	for (int i = 0; i < values.length; i++) {
		// Create a MyInteger
		MyInteger value = new MyInteger(values[i]);
		System.out.println(value.getValue() + " is even: " + MyInteger.isEven(value));
	}
		System.out.print("isOdd(MyInteger) test to see if values are odd:\n");
		for (int i = 0; i < values.length; i++) {
			// Create a MyInteger
			MyInteger value = new MyInteger(values[i]);
			System.out.println(value.getValue() + " is odd: " + MyInteger.isOdd(value));
		}
			System.out.print("isPrime(MyInteger) test to see if values are prime:\n");
			for (int i = 0; i < values.length; i++) {
				// Create a MyInteger
				MyInteger value = new MyInteger(values[i]);
				System.out.println(value.getValue() + " is prime: " + MyInteger.isPrime(value));
			}
	//tests equals(int, MyInteger)
			int[] values2 = {2, 4, 6};
			MyInteger value = new MyInteger(6);
			System.out.print("Test if " + value.getValue() + " is equal to the specified value:\n");
			for (int i = 0; i < values2.length; i++) {
				System.out.println(values2[i] + " = 6: " + value.equals(values2[i]));
			}
			System.out.print("Test if " + value.getValue() + " is equal to the specified value:\n");
			for (int i = 0; i < values2.length; i++) {
				MyInteger myInteger = new MyInteger(values2[i]);
				System.out.println(values2[i] + " = 6: " + value.equals(myInteger));
			}
	//tests parseInt(char[] and parseInt(String)	
	System.out.println("Tests parseInt(char[]) and parseInt(String):");
	//character array
	char[] numChar = {'1', '3', '7'};
	//string creation
	String numString = "123";
	System.out.print("\'");
	for (int i = 0; i < numChar.length; i++) {
			System.out.print(numChar[i] + "");
	}
	System.out.println("\' + \"" + numString + "\" = " + (MyInteger.parseInt(numChar) + MyInteger.parseInt(numString)));
}
}