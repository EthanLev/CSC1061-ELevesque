
public class BinaryNumber {

	public static void main(String[] args) {

		printBinary(19);
	}
	
	public static void printBinary(int num) {
		if (num <= 0) {
			return;
		}
		
		printBinary(num/2);
		System.out.print(num % 2);
	}
}
