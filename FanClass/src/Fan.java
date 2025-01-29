
class Fan {
	public static final int SLOW = 1;
	public static final int MEDIUM = 2;
	public static final int FAST = 3;
	
	private int speed = SLOW;
	
	private boolean isOn = false;
	
	private double radius = 5;
	
	private String color = "blue";
	
	private static int idCount = 1;
	private int id = 1;
	
	// Constructor
	public Fan() {
		this.id = idCount++;
	}

	// Getters and Setters
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public boolean isOn() {
		return isOn;
	}

	public void setOn(boolean on) {
		this.isOn = on;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	// To String
	public String toString() {
		if(isOn) {
			return "Fan " + id + " speed:" + speed + " color:" + color + " radius:" + radius;
		} else {
			return "Fan " + id + " speed:" + speed + " color:" + color + " radius:" + radius + " fan is off";
		}
	}
	
	
	
	

}
