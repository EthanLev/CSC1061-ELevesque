import java.time.LocalDate;

public class Transaction {
	private LocalDate date;
	private String type;
	private double amount;
	private double balance;
	
	public Transaction(String type, double amount, double balance) {
		date = LocalDate.now();
		this.type = type;
		this.amount = amount;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Transaction on " + date + ", type:" + type + ", amount:" + amount + ", balance:" + balance;
	}
}
