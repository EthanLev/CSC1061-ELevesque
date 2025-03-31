
public class Fibonacci {

	public static void main(String[] args) {
		System.out.println("The answer is " + fibRecurse(5));
	}

	public static int fibRecurse(int n) {
		if (n <= 1) { // Base case
			return n;
		} 
		
		int ans = fibRecurse(n - 1) + fibRecurse(n - 2);
		return ans;
	}
}
