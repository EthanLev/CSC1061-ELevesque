
public class Driver {

	public static void main(String[] args) {
		
		Garage garage = new Garage();
		
		garage.add(new Car("BMW", "328i", 2020));
		garage.add(new Truck("Toyota", "Tundra", 2024));
		garage.add(new Motorcycle("Honda", "Fury", 2022));
		
		System.out.println(garage);
        System.out.println("Starting all vehicles:\n" + garage.startAllCars());
        System.out.println("Driving all vehicles:\n" + garage.driveAllCars());
        System.out.println("Stopping all vehicles:\n" + garage.stopAllCars());
	}
}
