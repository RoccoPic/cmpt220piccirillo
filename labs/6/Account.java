import java.util.Date;
public class Account {
	
	private int id;
	private double balance;
	private static double annualInterestRate;
	private Date dateCreated;
	
	public static double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		Account.annualInterestRate = annualInterestRate;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	Account() {
		id = 0;
		balance = 0;
		annualInterestRate = 0;
		dateCreated = new Date();
	}
		
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	Account(int id, double balance){
		this();
		this.id = id;
		this.balance = balance;
	}
	
	public double getMonthlyInterestRate() {
		return annualInterestRate / 12;
	}
	public double getMonthlyInterest() {
		return balance *(getMonthlyInterestRate() / 100);
	}
	public void withdraw(double amount) {
		balance -= amount;
	}
	public void deposit(double amount) {
		balance += amount;
	}
}
