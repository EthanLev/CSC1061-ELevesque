import java.util.HashMap;
import java.util.Map;

public class MyHashMapTest {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		
		map.put("1", 1);
		map.put("2", 2);
		map.put("3", 3);
		map.put("4", 4);
		map.put("5", 5);
		
		System.out.println(map);
		
		map.remove(3);
		
		System.out.println(map);
	}

}
