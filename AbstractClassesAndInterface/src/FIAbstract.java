
/**
 *  Financial Institution
 */

public abstract class FIAbstract implements Comparable<FIAbstract> {
	private String fiName;
	private long fiId;
	private long routingNum;
	private Address address;
	
	
	public FIAbstract(String fiName, long fiId, long routingNum, Address address) {
		super();
		this.fiName = fiName;
		this.fiId = fiId;
		this.routingNum = routingNum;
		this.address = address;
	}
	
	// GETTERS AND SETTERS
	public String getFiName() {
		return fiName;
	}
	public void setFiName(String fiName) {
		this.fiName = fiName;
	}
	public long getFiId() {
		return fiId;
	}
	public void setFiId(long fiId) {
		this.fiId = fiId;
	}
	public long getRoutingNum() {
		return routingNum;
	}
	public void setRoutingNum(long routingNum) {
		this.routingNum = routingNum;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}

	
	// METHODS
	public abstract double getInterestRate();
	
	@Override
	public int compareTo(FIAbstract fi) {
		if (fiId < fi.fiId) {
			return -1;
		}
		if (fiId > fi.fiId) {
			return +1;
		}
		return 0;
	}
	
	public String toString() {
		return "FIAbstract [fiName=" + fiName + ", fiId=" + fiId + ", routingNum=" + routingNum + ", address=" + address
				+ "]";
	}
}
