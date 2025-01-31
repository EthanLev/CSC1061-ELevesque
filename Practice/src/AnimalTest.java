
public class AnimalTest {

	public static void main(String[] args) {
		Cat cat = new Cat("Pongo", 2, 6.5, "Tuxedo", true);
		Dog dog = new Dog("Koda", 4, 12.5, "Mini Aussie", true);	
		Horse horse = new Horse("Bandit", 3, 1100.0, true);
		
		System.out.println(cat);
		System.out.println(cat.makeSound());
		
		System.out.println(dog);
		System.out.println(dog.makeSound());
		
		System.out.println(horse);
		System.out.println(horse.makeSound());
		
		Animal[] animals = new Animal[3];
		
		animals[0] = dog;
		animals[1] = cat;
		animals[2] = horse;
		
		System.out.println();
		
		for (int i = 0; i < animals.length; i++) {
			// System.out.println(animals[i]);
		}
		
		String animalType = identifyAnimal(animals[0]);
		System.out.println(animalType);
		String animalType1 = identifyAnimal(animals[1]);
		System.out.println(animalType1);
		String animalType2 = identifyAnimal(animals[2]);
		System.out.println(animalType2);
	}
	
	public static String identifyAnimal(Animal animal) {
		String str = animal.getName() + " is a ";
		
		if (animal instanceof Dog) {
			return str + "dog";
		}
		
		if (animal instanceof Cat) {
			return str + "cat";
		}
		
		if (animal instanceof Horse) {
			return str + "horse";
		}
		
		return null;
	}

}
