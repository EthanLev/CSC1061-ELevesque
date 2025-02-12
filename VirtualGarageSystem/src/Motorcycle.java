
public class Motorcycle extends Vehicle {
	
	public Motorcycle(String make, String model, int year) {
		super(make, model, year);
	}
	
	// Methods
	@Override
	public String startEngine() {
		return "Motorcycle started";
	}
	@Override
	public String stopEngine() {
		return "Motorcycle turned off";
	}
	@Override
	public String drive() {
		return "Motorcycle is driving";
	}
}
