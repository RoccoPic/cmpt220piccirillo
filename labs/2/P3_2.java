import java.util.Scanner;
public class P3_2 {
public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
        int num1 = (int) (System.currentTimeMillis() % 10);
        int num2 = (int) (System.currentTimeMillis() / 10 % 10);
        int num3 = (int) (System.currentTimeMillis() / 10 / 10 % 10);

        System.out.print("What is " + num1 + " + " + num2 + " + " + num3 + "? ") ;
        int result = input.nextInt();
        System.out.println(num1 + " + " + num2 + " + " + num3 + " = " + result + " is " + (num1 + num2  + num3 == result));
    }

}