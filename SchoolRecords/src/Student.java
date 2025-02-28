/**
 * Student class with grade status and Person information
 * Extends Person
 */
public class Student extends Person {
	
	private Status status;
	
	/**
	 * Constructor for Student data
	 * @param name The name of the student
	 * @param address The address of the student
	 * @param phoneNum The phone number of the student
	 * @param email The email of the student
	 * @param status The grade of the student (freshman, sophomore, junior, senior)
	 */
	public Student(String name, String address, String phoneNum, String email, Status status) {
		
		super(name, address, phoneNum, email);
		this.status = status;
	}

	// GETTERS AND SETTERS
	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	/**
	 * @return String of Student object with status
	 */
	public String toString() {
		return super.toString() + 
				"\nStatus: " + status + "\n";
	}
}
