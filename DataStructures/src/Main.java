import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(Integer.valueOf(1));
		list.add(Integer.valueOf(2));
		list.add(Integer.valueOf(3));
		
		System.out.println(getListSize(list));
	}
	
	public static int getListSize(ArrayList list) {
		return list.size();
	}
}
