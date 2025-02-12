
public class Rectangle extends GeometricObject {
	private double width = 1.0;
	private double height = 1.5;
	
	// Constructors
	public Rectangle() {
		
	}
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public Rectangle(String color, boolean isFilled, double width, double height) {
		super(color, isFilled);
		this.width = width;
		this.height = height;
	}

	// Getters and Setters
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	
	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}	
	
	// Methods
	public double getArea() {
		return width * height;
	}
	
	public double getPerimeter() {
		return (width + height) * 2;
	}
	
	public double scaledArea(int scaleAmount) {
		return scaleAmount * width * height;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Rectangle) return this.width == ((Rectangle)obj).width;
		return false; // Returns if width is the same
	}
	
	public String toString() {
		return  "\nRectangle" +
				super.toString() + 
				"\nWidth: " + width +
				"\nHeight: " + height;
	}
}
