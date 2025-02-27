
public class Dog extends Animal {

	public Dog(String animalName, double weight) {
		super(animalName, weight);
	}

	@Override
	public void feed(int numGallons) {
		System.out.println("Dog fed " + numGallons + " gallons of food");
	}

}
