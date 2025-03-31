
public abstract class Phone implements Cloneable {
	protected String phoneName;
	protected String processor;
	protected int cache;
	protected String storage;
	protected String imei;
	
	public Phone(String phoneName, String processor, int cache, String storage, String imei) {
        this.phoneName = phoneName;
        this.processor = processor;
        this.cache = cache;
        this.storage = storage;
        this.imei = imei;
    }

	@Override
	public String toString() {
		return phoneName + ": " + processor + " processor, " + cache + "MB cache, " + storage + " storage, IMEI:" + imei;
	}
}
