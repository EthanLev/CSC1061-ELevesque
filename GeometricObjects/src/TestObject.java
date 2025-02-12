import java.io.FileNotFoundException;

public class TestObject {

	public static void main(String[] args) {
		
		Circle circle = new Circle(5.5);
		circle.setFilled(true);
		circle.setColor("Black");
		
		Circle circle2 = new Circle("Black", true, 5.5);
		
		Rectangle rect = new Rectangle();
		Rectangle rect2 = new Rectangle("Black", true, 2.0, 5.0);
		
		System.out.println(circle);
		System.out.println("Area: " + circle.getArea());
		
		System.out.println(circle2);
		System.out.println("Area: " + circle2.getArea());
		
		System.out.println(rect);
		System.out.println("Area: " + rect.getArea());
		//System.out.println("Area Doubled: " + rect.scaledArea(2));
		System.out.println("Perimeter: " + rect.getPerimeter());
		
		System.out.println(rect2);
		System.out.println("Area: " + rect2.getArea());
		//System.out.println("Area Tripled: " + rect2.scaledArea(3));
		System.out.println("Perimeter: " + rect2.getPerimeter());
		
		System.out.println();
		
		
		//DataBase dataBase = new DataBase();
		
		try {
			DataBase.writeGeometricObject(circle2);
			DataBase.writeGeometricObject(rect);
		} catch (GeometricObjectDBException e) {
			System.out.println(e.getMessage());
			System.exit(-1);
		}
		
		
		try {
			GeometricObject obj = DataBase.readGeometricObject();
			System.out.println(obj);
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
}
