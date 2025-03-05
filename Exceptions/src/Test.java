
public class Test {

	public static void main(String[] args) throws NegativeAgeException {
		try {
			validateAge(-5);
		} catch (NegativeAgeException e){ // "Exception" will catch all exceptions
			System.out.println("Age cannot be negative");
		}
	}
	
	private static void validateAge(int age) throws NegativeAgeException {
		if (age < 0) {
			throw new NegativeAgeException("Age cannot be negative!", new RuntimeException());
			
		}
	}
}
