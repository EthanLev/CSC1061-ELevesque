
public class SalariedEmployee extends Employee {
	private double weeklySalary;

	public SalariedEmployee(String firstName, String lastName, long ssNum, double weeklySalary) {
		super(firstName, lastName, ssNum);
		this.weeklySalary = weeklySalary;
	}

	public double getWeeklySalary() {
		return weeklySalary;
	}
	public void setWeeklySalary(double weeklySalary) {
		this.weeklySalary = weeklySalary;
	}
	
	public double getPaymentAmount() {
		return weeklySalary;
	}

	@Override
	public String toString() {
		return "Salaried Employee " + super.toString() + 
				"Salary: " + getPaymentAmount() + "\n";
	}
}
