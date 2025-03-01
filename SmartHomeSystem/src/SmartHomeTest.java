
public class SmartHomeTest {

	public static void main(String[] args) {
		SmartLight light = new SmartLight();
		SmartThermostat thermostat = new SmartThermostat();
		SecurityCamera camera = new SecurityCamera();
		
		SmartHomeHub hub = new SmartHomeHub();
		
		hub.add(light);
		hub.add(thermostat);
		hub.add(camera);
		
		System.out.println(hub.turnAllOn());
		
		System.out.println(light.setBrightness(5));
		System.out.println(thermostat.setTemp(69));
		System.out.println(camera.toggleRecording());
		
		System.out.println(hub.showAllStatuses());
		
		System.out.println(hub.turnAllOff());
	}
}
