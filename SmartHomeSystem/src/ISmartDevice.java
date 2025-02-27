
public interface ISmartDevice {
	/**
	 * Turns the device on
	 * @return Returns a string message
	 */
	public String turnOn();
	
	/**
	 * Turns the device off
	 * @return Returns a string message
	 */
	public String turnOff();
	
	/**
	 * Returns the device's current state
	 * @return Returns device's current state
	 */
	public String getStatus();
}
