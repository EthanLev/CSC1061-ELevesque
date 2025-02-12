
public class Circle extends GeometricObject{
	private double radius = 1.0;
	
	public Circle() {
		
	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	
	public Circle(String color, boolean isFilled, double radius) {
		super(color, isFilled);
		this.radius = radius;
	}

	// Radius
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}


	
	
	public double getArea() {
		return Math.PI * (radius * radius);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Circle) return this.radius == ((Circle)obj).radius;
		return false;
	}
	
	
	public String toString() {
		return  "\nCircle" +
				super.toString() + 
				"\nRadius: " + radius;
	}
}
