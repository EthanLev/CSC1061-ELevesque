
public class Bike extends Vehicle {

	public Bike(String color, int id) {
		super(color, id);
	}
	
	
	// METHODS
	@Override
	public void drive(int numMiles) {
		for (int i = 0; i < numMiles; i++) {
			System.out.println("| ' |");
		}
		System.out.println("Bike rode " + numMiles + " miles");
	}

	@Override
	public void feed(int numGallons) throws UnsupportedOperationException {
		throw new UnsupportedOperationException("Bike cannot be fed anything");
	}
}
