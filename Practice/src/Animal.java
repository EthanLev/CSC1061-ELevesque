
public class Animal {
	private String name;
	private int age;
	private double weight;
	
	public Animal(String name, int age, double weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	
	public Animal() {
		name = "N/A";
		age = 0;
		weight = 0.0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	
	// Returns a string for the animals sound
	public String makeSound() {
		return " ";
	}
	public String toString() {
		return "\nName: " + name + "\nAge: " + age + "\nWeight: " + weight;
	}
	
	
}
