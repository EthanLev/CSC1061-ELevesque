import java.util.HashMap;
import java.util.Map;

/**
 * 	O(n) complexity
 */
public class Dooubloon {

	public static void main(String[] args) {
		System.out.println(isDooubloon("ABBA"));
	}
	
	/**
	 * Checks if the input string is a "Dooubloon", a word where each letter appears exactly twice.
	 *
	 * @param str Input string to check.
	 * @return true if every character in the string appears exactly twice, false otherwise.
	 */
	public static boolean isDooubloon(String str) {
	    // Map to store the frequency of each character in the string.
	    Map<Character, Integer> frequency = new HashMap<>();
	    
	    // Loop through each character in the string.
	    for (int i = 0; i < str.length(); i++) {
	        char letter = str.charAt(i);  // Get the character at the current index.
	        
	        // If the character is not already in the map, add it with a frequency of 1.
	        if (!frequency.containsKey(letter)) {
	            frequency.put(letter, 1);
	        } else {
	            // If the character is already in the map, increment its frequency by 1.
	            frequency.replace(letter, frequency.get(letter) + 1);
	        }
	    }
	    
	    // Check if all characters in the string appear exactly twice.
	    return frequency.values().stream().allMatch(frq -> frq == 2);
	}
}
