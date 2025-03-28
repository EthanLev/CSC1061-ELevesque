
public class BookCreator {

	public static void main(String[] args) {
		
		BookTree book = new BookTree("My Book");
		
		book.addBookNode("Chapter 1", 1, 0, 0);
		book.addBookNode("Chapter 4", 4, 0, 0);
		book.addBookNode("Chapter 2", 2, 0, 0);
		book.addBookNode("Chapter 3", 3, 0, 0);
		book.addBookNode("Chapter 5", 5, 0, 0);
		
		book.addBookNode("Section 1", 1, 1, 0);
		book.addBookNode("Section 2", 2, 2, 0);
		book.addBookNode("Section 3", 3, 3, 0);
		book.addBookNode("Section 4", 4, 4, 0);
		book.addBookNode("Section 5", 5, 5, 0);
		
		book.addBookNode("Sub Section 1.1", 1, 1, 1);
		book.addBookNode("Sub Section 2.1", 2, 2, 2);
		book.addBookNode("Sub Section 3.1", 3, 3, 3);
		book.addBookNode("Sub Section 4.1", 4, 4, 4);
		book.addBookNode("Sub Section 5.1", 5, 5, 5);
		
		for (BookNode node : book) {
			System.out.println(node);
		}
	}
}
