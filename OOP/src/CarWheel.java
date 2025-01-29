
public class CarWheel {
	// Properties
	private double radius;
	private boolean clean;
	
	// Constructor
	public CarWheel() {
		radius = 0;
		clean = true;
	}
	
	public CarWheel(double width, boolean clean) {
		this.radius = width;
		this.clean = clean;
	}

	@Override
	public String toString() {
		return "Wheels radius=" + radius + " inches" + ", clean=" + clean;
	}
	
	
}
