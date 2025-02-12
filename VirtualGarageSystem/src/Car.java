
public class Car extends Vehicle {

	public Car(String make, String model, int year) {
		super(make, model, year);
	}
	
	// Methods
	@Override
	public String startEngine() {
		return "Car started";
	}
	@Override
	public String stopEngine() {
		return "Car turned off";
	}
	@Override
	public String drive() {
		return "Car is driving";
	}
	
}
