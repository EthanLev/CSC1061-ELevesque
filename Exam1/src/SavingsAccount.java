
public class SavingsAccount extends Account {
	private double minBalance;
	
	public SavingsAccount(int id, double balance, double minBalance) {
		super(id, balance);
		this.minBalance = minBalance;
	}
	
	public SavingsAccount(int id, double balance, double minBalance, String name) {
		super(id, balance, name);
		this.minBalance = minBalance;
	}
	
	@Override
	public void withdraw(double amount) throws OverdrawnException {
		double balance = super.getBalance();		
		double amountLeft = balance - amount;
		
		if (amountLeft >= minBalance) { 
			balance -= amount;
			super.setBalance(balance); 
			
			Transaction transaction = new Transaction("W", amount, balance);
			super.getTransactions().add(transaction);
			
			//System.out.println("Withdrew $" + amount);
		} else {
			throw new OverdrawnException("Overdrawn limit hit");
		}
	}
}
