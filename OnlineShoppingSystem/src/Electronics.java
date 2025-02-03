
public class Electronics extends Product {

	private int warrantyPeriod; // in years
	
	public Electronics(int id, String name, double price, int warrantyPeriod) {
		super(id, name, price);
		this.warrantyPeriod = warrantyPeriod;
	}

	public int getWarrantyPeriod() {
		return warrantyPeriod;
	}

	public void setWarrantyPeriod(int warrantyPeriod) {
		this.warrantyPeriod = warrantyPeriod;
	}

	
	public String toString() {
		if (warrantyPeriod > 1) {
			return super.toString() + 
					" Warranty: " + warrantyPeriod + " years";
		} else {
			return super.toString() + 
					" Warranty: " + warrantyPeriod + " year";
		}
	}
}
