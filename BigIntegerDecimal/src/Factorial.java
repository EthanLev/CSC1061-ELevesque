import java.math.BigInteger;

public class Factorial {

	public static void main(String[] args) {
		BigInteger fact = BigInteger.valueOf(40);
		System.out.println("The answer is " + factorial(fact));
	}
	
	public static BigInteger factorial(BigInteger num) {
		if (num.equals(BigInteger.ZERO)) { // Base case
			return BigInteger.ONE;
		} else {
			return num.multiply(factorial(num.subtract(BigInteger.ONE)));
		}
	}
}
