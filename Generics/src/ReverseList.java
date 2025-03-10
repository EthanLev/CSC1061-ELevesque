import java.util.ArrayList;
import java.util.List;

public class ReverseList<E> {
	
	private List<E> list = new ArrayList<E>();
	
	public void add(E input) {
		list.add(0, input);
	}
	
	public List<E> getList() {
		return list;
	}
}
