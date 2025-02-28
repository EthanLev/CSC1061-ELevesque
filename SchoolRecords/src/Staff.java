/**
 * Staff class with title
 * Extends Employee
 */
public class Staff extends Employee {

	private String title;
	
	/**
     * Constructor for Staff data
     * @param name The name of the staff member.
     * @param address The address of the staff member.
     * @param phoneNumber The phone number of the staff member.
     * @param email The email address of the staff member.
     * @param office The office of the staff member.
     * @param salary The salary of the staff member.
     * @param dateHired The hire date of the staff member.
     * @param title The title of the staff member.
     */
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

	
	/**
	 * @return String of Staff object with title
	 */
	public String toString() {
		return super.toString() + 
				"\nTitle: " + title + "\n";
	}
}
