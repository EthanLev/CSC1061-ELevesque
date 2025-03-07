import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class Account {

	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private LocalDate dateCreated;
	private String customerName =  "";
	private List<Transaction> transactions = new LinkedList<>();
	
	public Account() {
		dateCreated = LocalDate.now();
	}
	
	public Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
		dateCreated = LocalDate.now();
	}
	
	public Account(int id, double balance, String name) {
		this.id = id;
		this.balance = balance;
		this.customerName = name;
		dateCreated = LocalDate.now();
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

	public double getAnnualInterestRate() {
		return annualInterestRate/100;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate/100;
	}

	public LocalDate getDateCreated() {
		return dateCreated;
	}
	
	public String getName() {
		return customerName;
	}
	
	public void setName(String name) {
		this.customerName = name;
	}

	public double getMonthlyInterestRate() {
		return getAnnualInterestRate()/12;
	}
	
	public double getMonthlyInterest() {
		return getBalance() * (getMonthlyInterestRate()/100);
	}
	
	public List<Transaction> getTransactions() {
		return transactions;
	}
	
	public void withdraw(double amount) throws OverdraftException, OverdrawnException {
		balance -= amount;
		
		Transaction transaction = new Transaction("W", amount, balance);
		transactions.add(transaction);
	}
	
	public void deposit(double amount) {
		balance += amount;
		
		Transaction transaction = new Transaction("D", amount, balance);
		transactions.add(transaction);
		
		//System.out.println("Deposited $" + amount);
	}
	
	public void printAccountSummary() {
		System.out.println("Account " + id + 
						   ", Customer: " + customerName +
				           ", Balance: " + balance +
				           ", Annual Interest Rate: " + getAnnualInterestRate() + "\n");	
		for (Transaction transaction : transactions) {
			System.out.println(transaction);
		}
	}

	@Override
	public String toString() {
		return  "Account " + id + 
				", Date Created: " + dateCreated + 
				", Balance: " + balance +
				", Monthly Interest Rate: " + getMonthlyInterestRate() + "\n";
	}
}
