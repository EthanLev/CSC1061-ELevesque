
public class TempConverter {

	public static void main(String[] args) {
		double result = 0.0;
		
		if (args.length < 2) {
			System.out.println("Usage:");
			System.out.println("\t -f temp  Convert celcius to fahrenheit");
			System.out.println("\t -c temp  Convert fahrenheit to celcius");
			
			System.exit(0);
		}
		
		switch(args[0]) {
		case "-c":
			result = ConvertCelToFah(Double.parseDouble(args[1]));
			System.out.println("The celcius is " + result);
			break;
		case "-f":
			result = ConvertCelToFah(Double.parseDouble(args[1]));
			System.out.println("The fahrenheit is " + result);
			break;
		default:
			System.out.println("Unknown command");
			break;
 		}
	}
	
	
	public static double ConvertFahToCel(double num) {
		return ((num - 32) * (5.0/9.0));
	}
	
	public static double ConvertCelToFah(double num) {
		return ((num * (9.0/5.0)) + 32);
	}
}
