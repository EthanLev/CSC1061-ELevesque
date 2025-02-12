import java.util.Date;

public class GeometricObject {
	private String color = "White";
	private boolean isFilled = false;
	private Date dateCreated = new Date(); // sets dateCreated to new Date object when constructor is called
	
	public GeometricObject() {
		
	}
	
	public GeometricObject(String color, boolean isFilled) {
		this.color = color;
		this.isFilled = isFilled; 
	}

	// Color
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	// Is Filled
	public boolean isFilled() {
		return isFilled;
	}

	public void setFilled(boolean isFilled) {
		this.isFilled = isFilled;
	}

	// Date 
	public Date getDateCreated() {
		return dateCreated;
	}

	
	
	public String toString() {
		return  "\nColor: " + color + 
				"\nIsFilled: " + isFilled + 
				"\nDate Created: " + dateCreated;
	}
}
