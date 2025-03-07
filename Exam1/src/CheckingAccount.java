
public class CheckingAccount extends Account {
	private double overdraftLimit;
	
	public CheckingAccount(int id, double balance, double overdraftLimit) {
		super(id, balance);
		this.overdraftLimit = overdraftLimit;
	}
	
	public CheckingAccount(int id, double balance, double overdraftLimit, String name) {
		super(id, balance, name);
		this.overdraftLimit = overdraftLimit;
	}
	
	@Override
	public void withdraw(double amount) throws OverdraftException {
		double balance = super.getBalance();
		
		if (amount <= balance + overdraftLimit) { 
			balance -= amount;
			super.setBalance(balance); 
			
			Transaction transaction = new Transaction("W", amount, balance);
			super.getTransactions().add(transaction);
			
			//System.out.println("Withdrew $" + amount);
		} else {
			throw new OverdraftException("Overdraft limit hit");
		}
	}
}
