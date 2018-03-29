
public class P11_03 {
	public static void main(String args[]) {
	Account account = new Account(1029, 20000);
	SavingsAccount savings = new SavingsAccount(0731, 20000);
	CheckingAccount checking = new CheckingAccount(0326, 20000, -20);
	
	account.setAnnualInterestRate(4.5);
	savings.setAnnualInterestRate(4.5);
	checking.setAnnualInterestRate(4.5);
	
	account.withdraw(1500);
	savings.withdraw(1500);
	checking.withdraw(1500);
	
	account.deposit(2000);
	savings.deposit(2000);
	checking.deposit(2000);
	
	System.out.println(account.toString());
	System.out.println(savings.toString());
	System.out.println(checking.toString());
}
}