/**
 * Employee class with office details, salary, and hire date
 * Extends Person
 */
public class Employee extends Person {

	private String office;
	private double salary;
	private String date;
	
	/**
     * Constructor for Employee data.
     * @param name The name of the employee.
     * @param address The address of the employee.
     * @param phoneNumber The phone number of the employee.
     * @param email The email address of the employee.
     * @param office The office location of the employee.
     * @param salary The salary of the employee.
     * @param dateHired The hire date of the employee.
     */
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

	
	/**
	 * @return String of Employee object with office, salary, and hire date
	 */
	public String toString() {
		return super.toString() + 
				"\nOffice: " + office + 
				"\nSalary: " + salary + 
				"\nHired Date: " + date;
	}
}
