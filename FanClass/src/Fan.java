
public class Fan {
	private static final int SLOW = 1;
	private static final int MEDIUM = 2;
	private static final int FAST = 3;
	
	private int speed = SLOW;
	private boolean isOn;
	private double radius = 5.0;
	String color = "blue";
	private static int idCount = 1;
	private final int id;
	
	public Fan() {
		this.id = idCount++;
	}


	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public boolean isOn() {
		return isOn;
	}

	public void setOn(boolean isOn) {
		this.isOn = isOn;
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

	public String toString() {
		if(isOn) {
			return "Fan " + id + " speed:" + speed + " color:" + color + " radius:" + radius;
		} else {
			return "Fan " + id + " speed:" + speed + " color:" + color + " radius:" + radius + " fan is off";
		}
	}
	
	
}
