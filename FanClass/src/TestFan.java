
public class TestFan {

	public static void main(String[] args) {
		//Fan fan1 = new Fan(1, 3, "yellow", 10, true);
		//Fan fan2 = new Fan(2, 2, "blue", 5, false);
		
		//System.out.println(fan1.toString());
		//System.out.println(fan2.toString());
		
		Fan fan1 = new Fan();
		
		fan1.setSpeed(3);
		fan1.setRadius(10);
		fan1.setColor("yellow");
		fan1.setOn(true);
		
		System.out.println(fan1.toString());
		
		Fan fan2 = new Fan();
		
		fan2.setSpeed(2);
		fan2.setRadius(5);
		fan2.setColor("blue");
		fan2.setOn(false);
		
		System.out.println(fan2.toString());
		
		Fan fan3 = new Fan();
		
		fan3.setSpeed(1);
		fan3.setRadius(7);
		fan3.setColor("red");
		fan3.setOn(true);
		
		System.out.println(fan3.toString());

	}
}
