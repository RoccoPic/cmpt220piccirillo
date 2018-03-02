
public class P9_7 {
	public static void main(String args[]) { 
Account account1 = new Account(1122, 20000);
	account1.setAnnualInterestRate(4.5);
	account1.withdraw(2500);
	account1.deposit(3000);
	
System.out.println("ID number: " + account1.getId());
System.out.println("The balance: $" + account1.getBalance());
System.out.println("The annual interest rate: " + account1.getAnnualInterestRate() + "%");
System.out.println("The monthly interest rate: " + account1.getMonthlyInterest() + "%");
System.out.println("The date: " + account1.getDateCreated());

}
}
