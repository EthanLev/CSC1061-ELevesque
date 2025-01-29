
public class CarRadio {
	// Properties
	private final int MAX_VOLUME = 10;
	private final int MIN_VOLUME = 0;
	
	private int currentVolume = 0;
	private boolean hasAppleSupport;
	private boolean hasAndroidSupport;
	
	// Constructor
	public CarRadio() {
		currentVolume = 0;
		hasAppleSupport = false;
		hasAndroidSupport = false;
	}
	
	public CarRadio(boolean appleSupp, boolean androidSupp) {
		currentVolume = 0;
		this.hasAppleSupport = appleSupp;
		this.hasAndroidSupport = androidSupp;
	}

	// Getters and Setters
	public int getVolume() {
		return currentVolume;
	}

	public void setVolume(int volume) {
		if (volume < MIN_VOLUME) {
			this.currentVolume = 0;
		}
		if (volume > MAX_VOLUME) {
			this.currentVolume = 10;
		} else {
			this.currentVolume = volume;
		}
	}


	public boolean isHasAppleSupport() {
		return hasAppleSupport;
	}

	public void setHasAppleSupport(boolean hasAppleSupport) {
		this.hasAppleSupport = hasAppleSupport;
	}

	public boolean isHasAndroidSupport() {
		return hasAndroidSupport;
	}

	public void setHasAndroidSupport(boolean hasAndroidSupport) {
		this.hasAndroidSupport = hasAndroidSupport;
	}
	
	// Methods
	

	@Override
	public String toString() {
		return "Radio currentVolume=" + currentVolume + ", " + "hasAppleSupport=" + hasAppleSupport
				+ ", hasAndroidSupport=" + hasAndroidSupport;
	}
	
	
}
