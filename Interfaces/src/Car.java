
public class Car extends Vehicle {
	private int gallonsInTank;
	
	public Car(String color, int id, int gallonsInTank) {
		super(color, id);
		this.gallonsInTank = gallonsInTank;
	}

	// GETTERS AND SETTERS
	public int getGallonsInTank() {
		return gallonsInTank;
	}
	
	// METHODS
	@Override
	public void drive(int numMiles) {
		for (int i = 0; i < numMiles; i++) {
			System.out.println("| ' |");
		}
		System.out.println("Car drove " + numMiles + " miles");
	}
	
	@Override
	public void feed(int numGallons) {
		gallonsInTank += numGallons;
		System.out.println("Added " + numGallons + " gallons of gas to car");
	}
}
