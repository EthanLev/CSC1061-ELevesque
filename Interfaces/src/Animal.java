
public class Animal implements Feedable {
	private String animalName = "null";
	private double weight = 0.0;
	
	public Animal(String animalName, double weight) {
		this.animalName = animalName;
		this.weight = weight;
	}
	
	// GETTERS AND SETTERS
	public String getAnimalName() {
		return animalName;
	}

	public void setAnimalName(String animalName) {
		this.animalName = animalName;
	}


	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}


	// METHODS
	public void feed(int numGallons) {
		weight += numGallons;
	}
}
