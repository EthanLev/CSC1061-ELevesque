
public class Truck extends Vehicle {
	
	public Truck(String make, String model, int year) {
		super(make, model, year);
	}
	
	// Methods
	@Override
	public String startEngine() {
		return "Truck started";
	}
	@Override
	public String stopEngine() {
		return "Truck turned off";
	}
	@Override
	public String drive() {
		return "Truck is driving";
	}
}
