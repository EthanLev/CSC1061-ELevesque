import java.util.ArrayList;

public class User {
	private int userId;
	private String username;
	private ArrayList<Product> cart;
	
	public User(int id, String username) {
		this.userId = id;
		this.username = username;
		cart = new ArrayList<>();
	}
	
	
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public ArrayList<Product> getCart() {
		return cart;
	}

	public void setCart(ArrayList<Product> cart) {
		this.cart = cart;
	}


	public void addToCart(Product product) {
		cart.add(product);
		System.out.println(product.getName() + " added to cart");
	}
	
	public void removeFromCart(Product product) {
		cart.remove(product);
		System.out.println(product.getName() + " removed from cart");
	}
	
	public void displayCart() {
		System.out.println("\n" + username + "'s Cart:");
		for (Product product : cart) {
			System.out.println(product);
		}
		
		System.out.println("Total: " + calculateTotal());
		System.out.println();
	}
	
	public double calculateTotal() {
		double total = 0;
		for (Product product : cart) {
			total += product.getPrice();
		}
		
		return total;
	}
}
