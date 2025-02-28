/**
 * Faculty class with rank and office hours
 * Extends Employee
 */
public class Faculty extends Employee {

	private Rank rank;
	
	private String officeHours;
	
	/**
     * Constructor for Faculty data.
     * @param name The name of the faculty member.
     * @param address The address of the faculty member.
     * @param phoneNumber The phone number of the faculty member.
     * @param email The email address of the faculty member.
     * @param office The office of the faculty member.
     * @param salary The salary of the faculty member.
     * @param dateHired The hire date of the faculty member.
     * @param officeHours The office hours of the faculty member.
     * @param rank The rank of the faculty member (junior, senior).
     */
	public Faculty(String name, String address, String phoneNum, String email, 
				   String office, double salary, String date, String hours, Rank rank) {
		
		super(name, address, phoneNum, email, office, salary, date);
		this.officeHours = hours;
		this.rank = rank;
	}

	// GETTERS AND SETTERS
	public String getOfficeHours() {
		return officeHours;
	}

	public void setOfficeHours(String officeHours) {
		this.officeHours = officeHours;
	}

	public Rank getRank() {
		return rank;
	}

	public void setRank(Rank rank) {
		this.rank = rank;
	}
	
	
	/**
	 * @return String of Faculty object with rank and office hours
	 */
	public String toString() {
		return super.toString() + 
				"\nOffice Hours: " + officeHours + 
				"\nRank: " + rank + "\n";
	}
}
