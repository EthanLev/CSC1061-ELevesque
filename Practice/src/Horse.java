
public class Horse extends Animal {
	private boolean isRunner;
	
	public Horse(String name, int age, double weight, boolean isRunner) {
		super(name, age, weight);
		this.isRunner = isRunner;
	}
	
	public String makeSound() {
		String str = "Neigh";
		return getName() + " the horse says " + str;
	}

	@Override
	public String toString() {
		return "\nHorse\nName: " + getName() + 
				"\nAge: " + getAge() + 
				"\nWeight: " + getWeight() + 
				"\nRunning Horse: " + isRunner;
	}
}
