import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;

public class BookTree implements Iterable<BookNode> {
	private BookNode root;
	
	public BookTree(String title) {
		root = new BookNode(title, 0, 0, 0);
	}
	
	public BookNode getBook() {
		return root;
	}
	
	public boolean addBookNode(String title, int cNum, int sNum, int ssNum) {
		BookNode node = new BookNode(title, cNum, sNum, ssNum);
		
		// Is this a chapter?
		if (sNum == 0) {
			root.getChildNodes().add(node);
			Collections.sort(root.getChildNodes());
			return true;
		}
		
		// Is this a section
		if (ssNum == 0) {
			for (BookNode chapter : root.getChildNodes()) {
				if (chapter.getChapNum() == cNum) {
					chapter.getChildNodes().add(node);
					Collections.sort(chapter.getChildNodes());
					return true;
				}
			}
		}
		
		// Is this a subsection
		for (BookNode chapter : root.getChildNodes()) {
			if (chapter.getChapNum() == cNum) {
				for (BookNode section : chapter.getChildNodes()) {
					if (section.getSecNum() == sNum) {
						section.getChildNodes().add(node);
						Collections.sort(section.getChildNodes());
						return true;
					}
				}
				
				return true;
			}
		}
		
		return false;
	}

	@Override
	public Iterator<BookNode> iterator() {
		return new BookNodeIterator(root);
	}
	
	private class BookNodeIterator implements Iterator<BookNode> {

		Deque<BookNode> stack;
		
		public BookNodeIterator(BookNode node) {
			stack = new ArrayDeque<>();
			stack.push(node); // Push node for root
		}
		
		@Override
		public boolean hasNext() {
			return !stack.isEmpty();
		}

		@Override
		public BookNode next() {
			BookNode node = stack.pop();
			
			List<BookNode> children = node.getChildNodes();
			
			List<BookNode> copy = new ArrayList<>(children); // Create copy of list 
			
			Collections.reverse(copy);
			
			for (BookNode child : copy) {
				stack.push(child);
			}
			
			return node;
		}
		
	}
}
