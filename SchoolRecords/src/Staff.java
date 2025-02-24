
public class Staff extends Employee {

	private String title;
	
	public Staff(String name, String address, String phoneNum, String email, 
				 String office, double salary, String date, String title) {
		super(name, address, phoneNum, email, office, salary, date);
		this.title = title;
	}

	// GETTERS AND SETTERS
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	
	
	public String toString() {
		return "Staff [title=" + title + "]";
	}
}
