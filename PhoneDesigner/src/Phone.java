import java.util.ArrayList;

public abstract class Phone implements Cloneable, Comparable<Phone> {
	protected String phoneName;
	protected String processor;
	protected int cache;
	protected int storage;
	protected String cacheUnit;
	protected String storageUnit;
	protected ArrayList<Character> imei;
	
	public Phone(String phoneName, String processor, int cache, String cacheUnit, int storage, String storageUnit, ArrayList<Character> imei) {
        this.phoneName = phoneName;
        this.processor = processor;
        this.cache = cache;
        this.cacheUnit = cacheUnit;
        this.storage = storage;
        this.storageUnit = storageUnit;
        this.imei = new ArrayList<>(imei);
    }
	
	public void setIMEI(ArrayList<Character> imei) {
		this.imei = new ArrayList<>(imei);
	}
	
	public int compareTo(Phone phone) {
		if (this.cache != phone.cache) {
			return Integer.compare(this.cache, phone.cache);
		}
		
		// Cache is equal, compare storage
		return Integer.compare(this.storage, phone.storage);
	}
	
	// CLONE
	@Override
	public Phone clone() {
		try {
			Phone clone = (Phone) super.clone();
			
			clone.imei = new ArrayList<>(imei);
			
			return clone;
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public String toString() {
		return phoneName + ": " + processor + ", " + cache + cacheUnit + " cache, " + storage + storageUnit + " storage, IMEI: " + imei;
	}
}
