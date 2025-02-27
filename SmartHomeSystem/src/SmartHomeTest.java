
public class SmartHomeTest {

	public static void main(String[] args) {
		SmartLight light = new SmartLight();
		SmartThermostat thermostat = new SmartThermostat();
		SecurityCamera camera = new SecurityCamera();
		
		SmartHomeHub hub = new SmartHomeHub();
		
		hub.add(light);
		hub.add(thermostat);
		hub.add(camera);
		
		hub.turnAllOn();
		hub.turnAllOff();
		hub.showAllStatuses();
	}
}
