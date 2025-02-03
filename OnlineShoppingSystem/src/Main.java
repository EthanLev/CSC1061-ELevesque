
public class Main {

	public static void main(String[] args) {
		Electronics laptop = new Electronics(1, "Laptop", 1200.00, 2);
        Electronics smartphone = new Electronics(2, "Smartphone", 699.99, 1);
        Electronics headphones = new Electronics(3, "Headphones", 129.99, 2);
        Electronics smartwatch = new Electronics(4, "Smartwatch", 249.99, 3);
        
        Clothing tshirt = new Clothing(5, "T-Shirt", 25.00, "M", "Red");
        Clothing jeans = new Clothing(6, "Jeans", 49.99, "L", "Blue");
        Clothing jacket = new Clothing(7, "Jacket", 79.99, "M", "Black");
        Clothing hoodie = new Clothing(8, "Hoodie", 39.99, "S", "Grey");
        Clothing shorts = new Clothing(9, "Shorts", 29.99, "M", "Green");
		
		OnlineStore store = new OnlineStore();
		
		store.addProduct(laptop);
		store.addProduct(smartphone);
		store.addProduct(headphones);
		store.addProduct(smartwatch);
		store.addProduct(tshirt);
		store.addProduct(jeans);
		store.addProduct(jacket);
		store.addProduct(hoodie);
		store.addProduct(shorts);
		
		store.displayInventory(store.getInventory());
		
		User user1 = new User(1, "User 1");
		User user2 = new User(2, "User 2");
		User user3 = new User(3, "User 3");
		
		user1.addToCart(tshirt); // user method
		user1.addToCart(shorts);
		user1.addToCart(smartwatch);
		user1.displayCart();
		
		store.addToCart(user2, jeans); // store method
		store.addToCart(user2, hoodie);
		store.addToCart(user2, headphones);
		user2.displayCart();
		
		user3.addToCart(smartphone);
		store.addToCart(user3, laptop);
		user3.displayCart();
		
		store.checkOut(user1);
		store.checkOut(user2);
		store.checkOut(user3);
		
		store.displayInventory(store.getInventory());
	}
}
