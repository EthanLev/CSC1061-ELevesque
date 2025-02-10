import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {
	public static void main(String[] args) {

		File readFile = new File("fileWriteTest.txt");
		Scanner input = null;
		try {
			input = new Scanner(readFile);
		}
		catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			System.exit(-1);
		}
		while(input.hasNextLine()) {
			String line = input.nextLine();
			System.out.println(line);
		}

		input.close();
	}
}
