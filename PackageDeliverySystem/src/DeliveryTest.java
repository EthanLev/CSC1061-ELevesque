
public class DeliveryTest {

	public static void main(String[] args) {
		Destination home = new Destination("3521 Stanford Rd", "Fort Collins", "Colorado");
		Destination home1 = new Destination("458 Bexley St", "Highlands Ranch", "Colorado");
		Destination home2 = new Destination("10463 Isle St", "Parker", "Colorado");
		
		Package pkg1 = new Package(home, 5.0, 1.5, "READY");
		Package pkg2 = new Package(home1, 15.0, 2.75, "READY");
		Package pkg3 = new Package(home2, 10.0, 5.1, "READY");
		
		Shipment shipment = new Shipment();
		shipment.addPackage(pkg1);
		shipment.addPackage(pkg2);
		shipment.addPackage(pkg3);
		
		System.out.println("Total cost of shipment: " + shipment.getTotalCost());
        
        System.out.println("\nBefore status update:");
        System.out.println(shipment);

        shipment.updateStatus("DELIVERED");

        System.out.println("\nAfter status update:");
        System.out.println(shipment);
	}
}
