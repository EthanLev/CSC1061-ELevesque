
public class AccountDriver {

	public static void main(String[] args) throws OverdraftException, OverdrawnException {
		CheckingAccount checking = new CheckingAccount(1111, 2000.00, 200.00);
		checking.setAnnualInterestRate(0.5);
		checking.withdraw(2200.00); // 2201 will throw Overdraft Exception
		checking.deposit(3000.00);
		System.out.println(checking);
		
		
		SavingsAccount savings = new SavingsAccount(1100, 500.00, 200.00);
		savings.setAnnualInterestRate(1.0);
		savings.withdraw(300.00); // 301 will throw Overdrawn Exception
		System.out.println(savings);
		
		CheckingAccount checking1 = new CheckingAccount(2222, 1000.00, 200.00, "George");
		checking1.setAnnualInterestRate(1.5);
		checking1.deposit(30.00);
		checking1.deposit(40.00);
		checking1.deposit(50.00);
		
		checking1.withdraw(5.0);
		checking1.withdraw(4.0);
		checking1.withdraw(2.0);
		
		//System.out.println(checking1);
		checking1.printAccountSummary();
		
	}
}
