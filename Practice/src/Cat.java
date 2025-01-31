
public class Cat extends Animal {
	private String coloring;
	private boolean isDeclawed;
	
	public Cat(String name, int age, double weight, String coloring, boolean isDeclawed) {
		super(name, age, weight);
		this.coloring = coloring;
		this.isDeclawed = isDeclawed;
	}
	
	public String makeSound() {
		String str = "Meow";
		return getName() + " the cat says " + str;
	}

	@Override
	public String toString() {
		return "\nCat\nName: " + getName() + 
				"\nAge: " + getAge() + 
				"\nWeight: " + getWeight() + 
				"\nColor: " + coloring + 
				"\nDelcawed: " + isDeclawed;
	}
}
