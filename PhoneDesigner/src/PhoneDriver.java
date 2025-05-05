import java.util.ArrayList;
import java.util.Random;

public class PhoneDriver {
	public static void main(String[] args) {
		FlipModel flip = new FlipModel(createIMEI());
		FoldModel fold = new FoldModel(createIMEI());
		BarModel bar = new BarModel(createIMEI());
		
		System.out.println(flip);
		System.out.println(fold);
		System.out.println(bar);
		
		FlipModel clone = (FlipModel) flip.clone(); // Clone
		
		ArrayList<Character> newImei = createIMEI();
		clone.setIMEI(newImei);
		
		System.out.println("Original: " + flip);
		System.out.println("Clone: " + clone);
		
		// Compare flip and bar models
		System.out.println("\nFlip Phone vs Bar Phone Comparison: " + flip.compareTo(bar));
		
		// Print repair methods and costs
		System.out.println("\nFlip Phone Repair: " + flip.howToRepair() +  "\nCost: " + flip.repairCost());
		System.out.println("\nBar Phone Repair: " + bar.howToRepair() +  "\nCost: " + bar.repairCost());
	}
	
	public static ArrayList<Character> createIMEI() {
		ArrayList<Character> imei = new ArrayList<>();
		Random rndm = new Random();
		
		String digits = "0123456789";
		
		for (int i = 0; i < 15; i++) {
			int index = rndm.nextInt(10); // Generate number between 0 and 9
			imei.add(digits.charAt(index));
		}
		
		return imei;
	}
}
