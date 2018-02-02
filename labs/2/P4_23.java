import java.util.Scanner;
public class P4_23 {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter employee's name:");
		String name = input.nextLine();
		System.out.println("Enter number of hours worked in a week");
		double hours = input.nextDouble();
		System.out.println("Enter hourly pay rate:");
		double rate = input.nextDouble();
		System.out.println("Enter federal tax witholding rate:");
		double fedTax = input.nextDouble();
		System.out.println("Enter state tax witholding rate:");
		double stateTax = input.nextDouble();
		double grossPay = (hours * rate);
		double fedPercent = (fedTax * 100);
		double statePercent = (stateTax * 100);
		double fedWithhold  = (grossPay * fedTax);
		double stateWithhold = (grossPay * stateTax);
		double overallTax = (fedWithhold + stateWithhold);
		double netPay = (grossPay - overallTax);
		System.out.println("Employees Name: " + name + "\nHours Worked: " + hours + "\nPay Rate: $" + rate + "\nGross Pay: $" + grossPay + "\nDeductions:\n" + "Federal Witholding (" + fedPercent + "%): $" + fedWithhold + "\nState Withholding (" + statePercent + "%): $" + stateWithhold  + "\nTotal Deduction: $" + overallTax + "\nNet Pay: $" + netPay);
	}
}
