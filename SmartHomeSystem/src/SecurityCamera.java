
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
		return "Security Camera is turned on";
	}

	@Override
	public String turnOff() {
		return "Security Camera is turned off";
	}

	@Override
	public String getStatus() {
		return "Security Camera Status: " + isOn;
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
			return "Security Camera is not recording";
		}
	}
}
