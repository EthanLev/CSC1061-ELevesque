
public abstract class Vehicle implements Feedable {
	private String color = "null";
	private int id = 0;
	
	public Vehicle(String color, int id) {
		this.color = color;
		this.id = id;
	}
	
	// GETTERS AND SETTERS
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}


	public int getId() {
		return id;
	}

	
	// METHODS
	public abstract void drive(int numMiles);

	public abstract void feed(int numGallons);
}
