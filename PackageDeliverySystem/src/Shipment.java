import java.util.ArrayList;
import java.util.List;

public class Shipment {
	private List<Package> packages;
	
	public Shipment() {
		packages = new ArrayList<>();
	}
	
	public void addPackage(Package pkg) {
		packages.add(pkg);
	}
	
	public double getTotalCost() {
		double total = 0;
		
		for (Package pkg : packages) {
			total += pkg.calculateCost();
		}
		
		return total;
	}
	
	public void updateStatus(String newStatus) {
		for (Package pkg : packages) {
			pkg.updateStatus(newStatus);
		}
	}

	public String toString() {
		return "\nShipment packages: " + packages;
	}
}
