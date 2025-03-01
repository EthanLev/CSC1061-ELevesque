
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
		isOn = true;
		return "Smart Light turned on";
	}

	@Override
	public String turnOff() {
		isOn = false;
		return "Smart Light turned off";
	}

	@Override
	public String getStatus() {
		String str = "";
		
		if (isOn) {
			str = "Smart Light Status: ON";
		} else {
			str = "Smart Light Status: OFF";
		}
		return str;
	}
	
	/**
	 *  Sets brightness of SmartLight if isOn is true
	 *  @param level Brightness level of SmartLight
	 *  @return Returns a string of what brightness is set to
	 */
	public String setBrightness(int level) {
		if (isOn) {
			brightness = level;
			return "Smart Light brightness set to " + brightness;
		}
		
		return "Smart Light is turned off, can not adjust brightness";
	}
}
