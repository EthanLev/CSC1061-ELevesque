
public class Faculty extends Employee {

	private enum Rank {
		junior,
		senior
	}
	
	private String officeHours;
	private Rank rank;
	
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
	
	

	public String toString() {
		return "Faculty [officeHours=" + officeHours + ", rank=" + rank + "]";
	}
}
