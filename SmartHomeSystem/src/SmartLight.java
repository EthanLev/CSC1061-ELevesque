
public class SmartLight implements ISmartDevice {
	
	/**
	 *  Boolean isOn 
	 *  Returns true or false if SmartLight is turned on or off
	 */
	private boolean isOn;
	/**
	 *  Integer brightness
	 *  Brightness level of SmartLight
	 */
	private int brightness;
	
	
	public SmartLight() {
		isOn = false;
		brightness = 50;
	}
	
	@Override
	public String turnOn() {
		return "Smart Light turned on";
	}

	@Override
	public String turnOff() {
		return "Smart Light turned off";
	}

	@Override
	public String getStatus() {
		return "Smart Light Status: " + isOn;
	}
	
	/**
	 *  Sets brightness of SmartLight if isOn is true
	 *  @param level Brightness level of SmartLight
	 *  @return Returns a string of what brightness is set to
	 */
	public String setBrightness(int level) {
		if (isOn) {
			brightness = level;
			return "Brightness set to " + brightness;
		}
		
		return "Light is turned off";
	}
}
