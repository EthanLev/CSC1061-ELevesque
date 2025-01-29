
public class CarDriver {

	public static void main(String[] args) {
		Car car = new Car("BMW", 2024, "Pink", 1000, 50.0, false, true);
						
		System.out.println(car.toString());
		//car.drive(1);
		car.clean();
		car.getRadio().setVolume(5);
		
		System.out.println(car.getRadio());
		car.setWheels(15.5, true);
		CarWheel[] wheels = car.getWheels();
		for(CarWheel wheel : wheels) {
			System.out.println(wheel);
		}
	}
}
