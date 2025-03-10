/*
 *  Copyright
 */

/**
 *  Methods for converting between inches and centimeters
 *  @author Ethan Levesque
 */


public class Convertor {
	
	public static final double CENTIMETER_PER_INCH = 2.54;
	public static final int INCH_PER_FOOT = 12;
	
	/**
	 * Converts centimeters to inches
	 * @param length in centimeters (double cm)
	 * @return length in inches
	 */
	public static double ToInches(double cm) {
		return cm/CENTIMETER_PER_INCH;
	}
	
	/**
	 * Converts feet and inches to centimeters
	 * @param feet length in feet (int)
	 * @param inch length in inches (int)
	 * @return length in centimeters
	 */
	public static double ToCentimeters(int feet, int inch) {
		int total = INCH_PER_FOOT * feet + inch;
		return total * CENTIMETER_PER_INCH;
	} 
}
