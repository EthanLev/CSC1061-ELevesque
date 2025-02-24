
public class Employee extends Person {

	private String office;
	private double salary;
	private String date;
	
	public Employee(String name, String address, String phoneNum, String email,
					String office, double salary, String date) {
		super(name, address, phoneNum, email);
		this.office = office;
		this.salary = salary;
		this.date = date;
	}

	// GETTERS AND SETTERS
	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	
	
	public String toString() {
		return super.toString() + "\nOffice: " + office + "\nSalary: " + salary + "\nHired Date: " + date + "\n";
	}
}
