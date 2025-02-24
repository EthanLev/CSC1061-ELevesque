/**
 *  
 */

public class Bank extends FIAbstract {
	private double interestRate;
	
	public Bank(String fiName, long fiId, long routingNum, Address address, double interestRate) {
		super(fiName, fiId, routingNum, address);
		this.interestRate = interestRate;
	}

	@Override
	public double getInterestRate() {
		return interestRate;
	}
}
