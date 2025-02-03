
public class BasePlusCommissionEmployee extends CommissionEmployee {
	private double basePay;
	
	public BasePlusCommissionEmployee(String firstName, String lastName, long ssNum, 
									  double grossSales, double commissionRate, double basePay) {
		super(firstName, lastName, ssNum, grossSales, commissionRate);
		this.basePay = basePay;
	}

	public double getBasePay() {
		return basePay;
	}
	public void setBasePay(double basePay) {
		this.basePay = basePay;
	}
	
	public double getPaymentAmount() {
		return basePay + super.getPaymentAmount(); //super.getCommissionRate();
	}

	@Override
	public String toString() {
		return "Base + " + super.toString();
	}
}
