import java.util.ArrayList;

@SuppressWarnings("serial")
public class Garage extends ArrayList<Vehicle> {
	
	public String startAllCars() {
		String result = "";
		for (Vehicle vehicle : this) {
			result += vehicle.startEngine() + "\n";
		}
		
		return result;
	}
	
	public String stopAllCars() {
		String result = "";
		for (Vehicle vehicle : this) {
			result += vehicle.stopEngine() + "\n";
		}
		
		return result;
	}
	
	public String driveAllCars() {
		String result = "";
		for (Vehicle vehicle : this) {
			result += vehicle.drive() + "\n";
		}
		
		return result;
	}
	
	public String toString() {
		String result = "Garage:\n";
		
		for (Vehicle vehicle : this) {
			result += vehicle.toString() + "\n";
		}
		
		return result;
	}
}
