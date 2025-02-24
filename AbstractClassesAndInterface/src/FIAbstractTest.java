
public class FIAbstractTest {

	public static void main(String[] args) {
		FIAbstract[] institutions = new FIAbstract[3];
		
		institutions[0] = new Bank("First Bank", 1, 10200076, null, 2.67);
		institutions[1] = new CreditUnion("Credit Union", 2, 10500023, null, 3.23);
		institutions[2] = new Bank("Second Bank",3, 10800056, null, 2.87);
	}
}
