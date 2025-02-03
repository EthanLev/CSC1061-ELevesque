
public class HourlyEmployee extends Employee {
	private double hourlyWage;
	private int hours;
	
	public HourlyEmployee(String firstName, String lastName, long ssNum, 
						  double hourlyWage, int hours) {
		super(firstName, lastName, ssNum);
		this.hourlyWage = hourlyWage;
		this.hours = hours;
	}

	public double getHourlyWage() {
		return hourlyWage;
	}
	public void setHourlyWage(double hourlyWage) {
		this.hourlyWage = hourlyWage;
	}

	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	
	public double getPaymentAmount() {
		return hourlyWage * hours;
	}

	@Override
	public String toString() {
		return "Hourly Employee " + super.toString() + 
				"Salary: " + getPaymentAmount() + "\n";
	}
}
