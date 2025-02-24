
public class Student extends Person {
	
	private Status status;
	
	
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


	public String toString() {
		return super.toString() + "\nStatus: " + status + "\n";
	}
}
