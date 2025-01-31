import java.util.Scanner;

public class CreditCardValidation {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter credit card number");
		String cardNum = input.nextLine();
		
		// print if card number is valid or not
		
	}
	
	// Return true if card number is valid
	public static boolean isValid(String cardNum) {
		// must have 13-16 digits
		if (cardNum.length() < 13 || cardNum.length() > 16) {
			return false;
		}
		
		// must start with 4, 5, 6, or 37
		char firstDigit = cardNum.charAt(0);
		if (!(firstDigit == '4' || firstDigit == '5' || firstDigit == '6' || cardNum.startsWith("37"))) {
			return false;
		}
		
		// if divisible by 10, is valid
		return true;
	}
	
	// double every second digit from right to left
	// if doubling makes a 2 digit number, add them to get a single digit
	
	// add all single digit numbers
	
	// add all digits in odd places from right to left
	
	// add results
	
}
