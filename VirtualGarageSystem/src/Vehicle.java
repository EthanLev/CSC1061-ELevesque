
public class Vehicle {
	
	// Properties
	private String make;
	private String model;
	private int year;
	
	// Constructor
	public Vehicle(String make, String model, int year) {
		this.make = make;
		this.model = model;
		this.year = year;
	}

	
	// Getters and Setters
	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}


	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}


	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	
	// Methods
	public String startEngine() {
		return "Engine started";
	}
	
	public String stopEngine() {
		return "Engine stopped";
	}
	
	public String drive() {
		return "Vehicle is driving";
	}

	
	public String toString() {
		return year + " " + make + " " + model;
	}
	
	
	
}
