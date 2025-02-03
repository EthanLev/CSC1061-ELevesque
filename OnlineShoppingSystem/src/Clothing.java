
public class Clothing extends Product {

	private String size;
	private String color;
	
	public Clothing(int id, String name, double price, String size, String color) {
		super(id, name, price);
		this.size = size;
		this.color = color;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	
	public String toString() {
		return super.toString() +
				" Size:" + size + 
				" Color:" + color;
	}
}
