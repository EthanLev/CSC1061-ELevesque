/**
 *  
 */

public class CreditUnion extends FIAbstract{
	private double interestRate;
	
	public CreditUnion(String fiName, long fiId, long routingNum, Address address, double interestRate) {
		super(fiName, fiId, routingNum, address);
		this.interestRate = interestRate;
	}

	@Override
	public double getInterestRate() {
		return interestRate;
	}
}
