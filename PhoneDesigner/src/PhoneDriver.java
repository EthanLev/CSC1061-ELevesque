
public class PhoneDriver {
	public static void main(String[] args) {
		FlipModel flip = new FlipModel("1234567890");
		FoldModel fold = new FoldModel("0987654321");
		BarModel bar = new BarModel("1029384756");
		
		System.out.println(flip);
		System.out.println(fold);
		System.out.println(bar);
	}
}
