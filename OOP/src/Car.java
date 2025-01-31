
public class Car {
	// Properties
	private String make;
	private int year;
	private String color;
	private int currentMiles;
	private double gallonsOfGas;
	private boolean isClean;
	
	public Car() {
		make = "null";
		year = 2000;
		color = "White";
		currentMiles = 0;
		gallonsOfGas = 100.0;
		isClean = true;
	}
	
	public Car(String make, int year, String color, int currentMiles, double gallonsOfGas, boolean isClean) {
		this.make = make;
		this.year = year;
		this.color = color;
		this.currentMiles = currentMiles;
		this.gallonsOfGas = gallonsOfGas;
		this.isClean = isClean;
	}

	// GETTERS AND SETTERS
	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getCurrentMiles() {
		return currentMiles;
	}

	public void setCurrentMiles(int currentMiles) {
		this.currentMiles = currentMiles;
	}

	public double getGallonsOfGas() {
		return gallonsOfGas;
	}

	public void setGallonsOfGas(double gallonsOfGas) {
		this.gallonsOfGas = gallonsOfGas;
	}

	public boolean isClean() {
		return isClean;
	}

	public void setClean(boolean isClean) {
		this.isClean = isClean;
	}

	@Override
	public String toString() {
		return year + " " + make + ", Color: " + color + ", Current Miles: " + currentMiles + ", Cleaned: " + isClean;
	}

	
	
}
