
public class SmartThermostat implements ISmartDevice {

	/**
	 *  Boolean isOn 
	 *  Returns true or false if SmartThermostat is turned on or off
	 */
	private boolean isOn;
	/**
	 *  Double temperature
	 *  Temperature value of thermostat in fahrenheit
	 */
	private double temperature;
	
	
	public SmartThermostat() {
		isOn = false;
		temperature = 69;
	}
	
	@Override
	public String turnOn() {
		isOn = true;
		return "Thermostat turned on";
	}

	@Override
	public String turnOff() {
		isOn = false;
		return "Thermostat turned off";
	}

	@Override
	public String getStatus() {
		String str = "";
		
		if (isOn) {
			str = "Smart Thermostat Status: ON";
		} else {
			str = "Smart Thermostat Status: OFF";
		}
		return str;
	}
	
	/**
	 *  Sets temperature of SmartThermostat if isOn is true
	 *  @param level Temperature value of SmartThermostat
	 *  @return Returns a string of what temperature is set to
	 */
	public String setTemp(double level) {
		if (isOn) {
			temperature = level;
			return "Temperature set to " + temperature;
		}
		
		return "Thermostat is turned off, can not change temperature";
	}
}
