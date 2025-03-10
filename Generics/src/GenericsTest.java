import java.util.ArrayList;
import java.util.List;

public class GenericsTest {

	public static void main(String[] args) {
		// Integer list
		List<Integer> ints = new ArrayList<>();
		
		int x = 2;
		Integer x_obj = Integer.valueOf(3);
		
		ints.add(1);
		ints.add(x);
		ints.add(x_obj);
		ints.add(Integer.valueOf(4));
		
		System.out.println("\nForward List");
		
		for (int num : ints) {
			System.out.println(num);
		}
		
		// Integer list reverse
		ReverseList<Integer> intList = new ReverseList<>();
		
		intList.add(1);
		intList.add(x);
		intList.add(x_obj);
		intList.add(Integer.valueOf(4));
		
		System.out.println("\nReverse List");

		for (int num : intList.getList()) {
			System.out.println(num);
		}
		
		// String list reverse
		ReverseList<String> strList = new ReverseList<>();
		
		strList.add("World");
		strList.add("Hello");
		
		System.out.println("\nReverse String List");
		
		for (String str : strList.getList()) {
			System.out.println(str);
		}
	}
}
