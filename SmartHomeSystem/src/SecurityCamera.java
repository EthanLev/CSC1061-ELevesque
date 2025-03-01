
public class SecurityCamera implements ISmartDevice {
	
	/**
	 *  Boolean isOn 
	 *  Returns true or false if SecurityCamera is turned on or off
	 */
	private boolean isOn;
	/**
	 *  Boolean isOn 
	 *  Returns true or false if SecurityCamera is recording or not
	 */
	private boolean isRecording;
	
	
	public SecurityCamera() {
		isOn = false;
		isRecording = false;
	}
	
	@Override
	public String turnOn() {
		isOn = true;
		return "Security Camera is turned on";
	}

	@Override
	public String turnOff() {
		isOn = false;
		return "Security Camera is turned off";
	}

	@Override
	public String getStatus() {
		String str = "";
		
		if (isOn) {
			str = "Security Camera Status: ON";
		} else {
			str = "Security Camera Status: OFF";
		}
		return str;
	}

	/**
	 *  Toggles isRecording from true and false;
	 *  @return Returns a string if camera is recording or not
	 */
	public String toggleRecording() {
		if (isOn) {
			isRecording = true;
			return "Security Camera is recording";
		} else {
			isRecording = false;
			return "Security Camera is off and not recording";
		}
	}
}
