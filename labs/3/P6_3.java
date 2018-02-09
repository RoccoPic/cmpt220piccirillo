import java.util.Scanner;

public class P6_3 {
public static void main(String args[]) {
	Scanner input = new Scanner(System.in);
	System.out.print("Enter a number to see if it is a palindrome: ");
	int num = input.nextInt();
	boolean isPalindrome = isPalindrome(num) ;
	if (isPalindrome == true) {
		System.out.print(num + " is a palindrome");
	} else {
		System.out.print(num + " is not a palindrome");
	}
}
//Reverse Method - Reverses number and returns the reversed number
public static int reverse(int number) {
	int palindrome = number;
	int reversedNum = 0;
	int remainder = 0;
	
	while(palindrome != 0) {
		remainder = palindrome % 10;
		reversedNum = reversedNum * 10 + remainder;
		palindrome = palindrome / 10;
	}
		return reversedNum;
}
//isPalindrome Method - Returns a Boolean Value for whether or not the number is a palindrome
public static boolean isPalindrome(int number) {
	int reversedNum = reverse(number);
	if (reversedNum == number) {
		return true;
	} else {
		return false;
	}
}
}
