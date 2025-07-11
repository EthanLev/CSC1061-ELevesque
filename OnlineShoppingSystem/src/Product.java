
public class Product {
	
	private int productId;
	private String name;
	private double price;
	
	public Product(int id, String name, double price) {
		this.productId = id;
		this.name = name;
		this.price = price;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	
	public String toString() {
		return  name + 
				" $" + price + 
				" ID:" + productId;
				
	}
}
