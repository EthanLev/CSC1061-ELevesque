import java.util.Random;

public class Package {
	private Destination destination;
	private double weight; // kilograms
	private double costPerKg; // per kilogram
	private String status;
	private int trackingNum;
	
	public Package(Destination destination, double weight, double costPerKg, String status) {
		this.destination = destination;
		this.weight = weight;
		this.costPerKg = costPerKg;
		this.status = status;
		this.trackingNum = generateTrackingNumber();
	}
	
	public String getStatus() {
		return status;
	}
	
	public void updateStatus(String status) {
		this.status = status;
	}
	
	public int getTrackingNumber() {		
		return trackingNum;
	}
	
	private int generateTrackingNumber() {
		Random rnd = new Random();
		
		return 100000000 + rnd.nextInt(100000000);
	}
	
	public double calculateCost() {
		if (weight <= 0) {
			return 0.0;
		}
		
		return costPerKg * weight;
	}

	@Override
	public String toString() {
		return "\n" + destination.toString() + "\nWeight: " + weight +
				"\nCost per Kg: " + costPerKg +
				"\nStatus: " + status +
				"\nTracking Number: " + trackingNum;
	}
}
