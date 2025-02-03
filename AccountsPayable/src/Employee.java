
public class Employee {
	private String firstName;
	private String lastName;
	private long ssNum;
	
	public Employee() {
		firstName = "John";
		lastName = "Doe";
		ssNum = 0000000000;
	}
	
	public Employee(String firstName, String lastName, long ssNum) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.ssNum = ssNum;
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public long getSsNum() {
		return ssNum;
	}
	public void setSsNum(long ssNum) {
		this.ssNum = ssNum;
	}

	
	public double getPaymentAmount() {
		return 0.0;
	}
	
	public String toString() {
		return  "\n" + firstName + 
				"\n" + lastName + 
				"\nSSN: " + ssNum + "\n";
	}
}
