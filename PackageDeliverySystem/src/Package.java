import java.util.Random;

public class Package {
	// Properties
	private Destination destination;
	
	private double weight = 0.0; // Kg
	private double cost = 0.0; // per Kg
	
	private String status = "";
	
	private int trackingNum = 0;
	
	// Constructor
	public Package(Destination destination, double weight, double cost, String status) {
		this.destination = destination;
		this.weight = weight;
		this.cost = cost;
		this.status = status;
		this.trackingNum = generateTrackingNumber();
	}
	
	// Methods
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
		return rnd.nextInt(900000000);
	}
	
	private void calculateCost() {
		
	}

	@Override
	public String toString() {
		return "Package destination=" + destination + ", weight=" + weight + ", cost=" + cost + ", status=" + status
				+ ", trackingNum=" + trackingNum;
	}
	
	
}
