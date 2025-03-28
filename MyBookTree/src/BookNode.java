import java.util.ArrayList;
import java.util.List;

public class BookNode implements Comparable<BookNode> {
	private String title;
	private int chapNum;
	private int secNum;
	private int subSecNum;
	private String text;
	private List<BookNode> childNodes;
	
	public BookNode(String title, int chapNum, int secNum, int subSecNum) {
		super();
		this.title = title;
		this.chapNum = chapNum;
		this.secNum = secNum;
		this.subSecNum = subSecNum;
		this.childNodes = new ArrayList<>();
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getChapNum() {
		return chapNum;
	}

	public void setChapNum(int chapNum) {
		this.chapNum = chapNum;
	}

	public int getSecNum() {
		return secNum;
	}

	public void setSecNum(int secNum) {
		this.secNum = secNum;
	}

	public int getSubSecNum() {
		return subSecNum;
	}

	public void setSubSecNum(int subSecNum) {
		this.subSecNum = subSecNum;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public List<BookNode> getChildNodes() {
		return childNodes;
	}

	public void setChildNodes(List<BookNode> childNodes) {
		this.childNodes = childNodes;
	}

	@Override
	public String toString() {
		if (chapNum == 0) {
			return title;
		}
		
		if (secNum == 0) {
			return ("\t" + chapNum + " " + title);
		}
		
		if (subSecNum == 0) {
			return ("\t\t" + chapNum + "." + secNum + " " + title);
		}
		
		return ("\t\t\t" + chapNum + "." + secNum + "." + subSecNum + " " + title);
	}

	@Override
	public int compareTo(BookNode o) {
		if (chapNum > o.getChapNum()) {
			return 1;
		} else if (chapNum < o.getChapNum()) {
			return -1;
		}
		
		if (secNum > o.getSecNum()) {
			return 1;
		} else if (secNum < o.getSecNum()) {
			return -1;
		}
		
		if (subSecNum > o.getSubSecNum()) {
			return 1;
		} else if (subSecNum < o.getSubSecNum()) {
			return -1;
		}
		
		return 0;
	}	
}
