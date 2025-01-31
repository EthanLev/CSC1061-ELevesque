
public class CarDriver {

	public static void main(String[] args) {
		Car car = new Car("BMW", 2024, "Pink", 1000, 90.0, false);
		
		Car car1 = new Car("Audi", 2025, "Black", 500, 100.0, true);
		
		Car car2 = new Car();
		
		System.out.println(car.toString());
		System.out.println();
		System.out.println(car1.toString());
		System.out.println();
		System.out.println(car2.toString());
	}
}
