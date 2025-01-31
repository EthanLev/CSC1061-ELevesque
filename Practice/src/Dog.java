
public class Dog extends Animal {
	private String breed;
	private boolean trained;
	
	public Dog(String name, int age, double weight, String breed, boolean trained) {
		super(name, age, weight);
		this.breed = breed;
		this.trained = trained;
	}
	
	public String makeSound() {
		String str = "Woof";
		return getName() + " the dog says " + str;
	}

	@Override
	public String toString() {
		return "\nDog\nName: " + getName() + 
				"\nAge: " + getAge() + 
				"\nWeight: " + getWeight() + 
				"\nBreed: " + breed + 
				"\nTrained: " + trained;
	}
}
