
public class Test {

	public static void main(String[] args) {
		
		Bike bike = new Bike("white", 1);
		Car car = new Car("black", 2, 16);
		Motorbike motorbike = new Motorbike("red", 3, 12);
		
		Dog dog = new Dog("Dog", 15.0);
		
		try {
			bike.feed(2);
		} catch (UnsupportedOperationException e) {
			System.out.println(e.getMessage());
			System.out.println();
		}
		
		bike.drive(5);
		
		car.feed(16);
		System.out.println("Gallons in tank: " + car.getGallonsInTank());
		car.drive(10);
		System.out.println("Gallons in tank: " + car.getGallonsInTank());
		
		System.out.println(dog.getWeight());
		dog.feed(5);
		System.out.println("Dog's weight: " + dog.getWeight());
	}
}
