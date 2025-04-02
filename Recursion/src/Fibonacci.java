
public class Fibonacci {
	private static long counter = 0;
	private static long[] termArray = new long[200];
	
	public static void main(String[] args) {
		System.out.println("The answer is " + fibIterator(45));
		
		System.out.println("Call counter:" + counter);
		
		System.out.println("The answer is " + fibDynamic(45));
		
		System.out.println("Call counter:" + counter);
	}

	public static long fibRecurse(int n) {
		counter++;
		
		if (n <= 1) { // Base case
			return n;
		} 
		
		long ans = fibRecurse(n - 1) + fibRecurse(n - 2);
		return ans;
	}
	
	public static long fibDynamic(int n) {
		if (n < 2) { // Base case
			return n;
		} 
		
		if (termArray[n] > 0) {
			return termArray[n];
		}
		
		counter++;
		long ans = fibDynamic(n - 1) + fibDynamic(n - 2);
		termArray[n] = ans;
		return ans;
	}
	
	public static long fibIterator(int n) {
		if (n < 2) {
			return n;
		}
		
		long prevTerm1 = 1;
		long prevTerm2 = 0;
		long currentTerm = 0;
		
		for (int i = 2; i <= n; i++) {
			currentTerm = prevTerm1 + prevTerm2;
			prevTerm2 = prevTerm1;
			prevTerm1 = currentTerm;
		}
		
		return currentTerm;
	}
}
