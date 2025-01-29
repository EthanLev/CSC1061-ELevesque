
public class Car {
	// Properties
	private String make;
	private int year;
	private String color;
	private int currentMiles;
	private double gallonsOfGas;
	private boolean isClean;
	
	private CarRadio radio;
	private CarWheel[]  wheels = new CarWheel[4];
	
	private final double MILES_PER_GALLON = 24;
	
	// Constructors
	public Car() {
		make = "null";
		year = 2000;
		color = "White";
		currentMiles = 0;
		gallonsOfGas = 50.0;
		isClean = true;
	}
	
	public Car(String make, int year, String color, int currentMiles, double gallonsOfGas, boolean isClean, boolean hasRadio) {
		this.make = make;
		this.year = year;
		this.color = color;
		this.currentMiles = currentMiles;
		this.gallonsOfGas = gallonsOfGas;
		this.isClean = isClean;
		
		if(hasRadio) {
			radio = new CarRadio(true, false);
		}		
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
	
	public CarRadio getRadio() {
		if(radio != null) {
			return radio;
		}
		
		return null;
	}
	
	public void setWheels(double radius, boolean clean) {
		for (int i = 0; i < wheels.length; i++) {
			wheels[i] = new CarWheel(radius, clean);
		}
	}
	
	public CarWheel[] getWheels() {
		return wheels;
	}
	
	// Methods
	public void drive(int numMiles) {
		System.out.println("Car has " + gallonsOfGas + " gallons of gas");

		for (int i = 0; i < numMiles; i++) {
			currentMiles += numMiles;
			System.out.println("| ' |");
		}
		
		gallonsOfGas -= numMiles / MILES_PER_GALLON;
		System.out.println("Car drove " + numMiles + " miles");
		System.out.println("Car has " + currentMiles + " miles");
		System.out.println("Car has " + gallonsOfGas + " gallons of gas");
		
		if (numMiles > 25) {
			isClean = false;
		}
	}

	public void clean() {
		isClean = true;
		System.out.println("Car has been cleaned");
	}
	
	// To String
	public String toString() {
		return year + " " + make + ", Color: " + color + ", Current Miles: " + currentMiles + ", Cleaned: " + isClean;
	}

	
	
}
