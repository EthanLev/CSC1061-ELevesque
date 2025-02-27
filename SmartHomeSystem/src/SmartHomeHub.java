import java.util.ArrayList;

@SuppressWarnings("serial")
public class SmartHomeHub<E extends ISmartDevice> extends ArrayList<E> {
	
	public SmartHomeHub() {
		
	}
	
	/**
	 * Turns on all smart devices in hub
	 * @return Returns string that all devices are on
	 */
	public String turnAllOn() {
		for (ISmartDevice device : this) {
			System.out.println(device.turnOn());
			device.turnOn();
		}
		
		return "All smart devices turned on";
	}
	
	/**
	 * Turns off all smart devices in hub
	 * @return Returns string that all devices are off
	 */
	public String turnAllOff() {
		for (ISmartDevice device : this) {
			System.out.println(device.turnOff());
			device.turnOff();
		}
		
		return "All smart devices turned off";
	}
	
	/**
	 * Prints all devices in hub status
	 * @return Returns status of all devices in hub
	 */
	public String showAllStatuses() {
		for (ISmartDevice device : this) {
			System.out.println(device.getStatus());
			String str = device.getStatus();
			return str;
		}

		return null;
	}
}
