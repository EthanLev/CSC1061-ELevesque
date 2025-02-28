/**
 * Person class with basic contact information
 */
public class Person {
	private String name;
	private String address;
	private String phoneNum;
	private String email;
	
	/**
	 * Constructor for Person data
	 * @param name The name of the person
	 * @param address The address of the person
	 * @param phoneNum The phone number of the person
	 * @param email The email of the person
	 */
	public Person(String name, String address, String phoneNum, String email) {
		this.name = name;
		this.address = address;
		this.phoneNum = phoneNum;
		this.email = email;
	}

	// GETTERS AND SETTERS
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	/**
	 * @return String of Person object
	 */
	@Override
	public String toString() {
		return "Name: " + name +
				"\nAddress: " + address + 
				"\nPhone: " + phoneNum + 
				"\nEmail: " + email;
	}
}
