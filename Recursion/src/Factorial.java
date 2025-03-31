
public class Factorial {

	public static void main(String[] args) {
		System.out.println("The answer is " + factorial(4));
	}
	
	public static int factorial(int num) {
		if (num == 0) { // Base case
			return 1;
		} else {
			return num * factorial(num - 1);
		}
	}
}
