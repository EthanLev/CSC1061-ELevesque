import java.util.ArrayList;

public class OnlineStore {
	private ArrayList<Product> inventory;
	
	public OnlineStore() {
		inventory = new ArrayList<>();
	}
	
	public ArrayList<Product> getInventory() {
		return inventory;
	}

	public void setInventory(ArrayList<Product> inventory) {
		this.inventory = inventory;
	}


	public void addProduct(Product product) {
		inventory.add(product);
		System.out.println(product.getName() + " added to store inventory");
	}
	
	public void displayInventory(ArrayList<Product> inventory) {
        System.out.println("\nAvailable Products:");
        
        if (inventory.isEmpty()) {
        	System.out.println("No products available");
        } else {
        	for (Product product : inventory) {
            	System.out.println(product);
            }
        }
        
        System.out.println();
    }
	
	public void addToCart(User user, Product product) {
		user.addToCart(product);
	}
	
	public void checkOut(User user) {
		System.out.println("Thank you for your purchase, " + user.getUsername() + "!");
		user.displayCart();
		
		for (Product product : user.getCart()) {
			inventory.remove(product);
		}
	}
}
