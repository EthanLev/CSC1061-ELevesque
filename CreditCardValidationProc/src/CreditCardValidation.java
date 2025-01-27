import java.util.Scanner;

public class CreditCardValidation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter credit card number");
		String cardNum = input.nextLine();
		
		// Check and print if card if valid or not
		if (isValid(cardNum)) {
			System.out.println("This number is valid");
		} else {
			System.out.println("This number is invalid");
		}
	}
	
	// Returns true if card number is valid
	public static boolean isValid(String num) {
		// must have 13 - 16 digits
		if (num.length() < 13 || num.length() > 16) {
			return false;
		}
		
		// must start with 4, 5, 6, or 37
		char firstNum = num.charAt(0);
		if (!(firstNum == '4' || firstNum == '5' || firstNum == '6' || num.startsWith("37"))) {
			return false;
		}
		
		// if result is divisible by 10, is valid
		return true;
	}
	
	// double every second digit from right to left
	// if doubling makes it a 2 digit number, add them to get a single digit
	
	// add all single digit numbers
	
	// add all digits in odd places from right to left
	
	// add results

}
