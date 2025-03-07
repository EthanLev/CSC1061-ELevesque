import java.io.IOException;

public class Test {

	public static void main(String[] args) {
		ReceiptFileHandler fileHandler = new ReceiptFileHandler("receipt.txt");
		
		Receipt receipt = new Receipt("Shirt", 15.00, 2);
		Receipt receipt1 = new Receipt("Pants", 25.00, 1);		
		
		try {
			System.out.println("Writing receipts to csv file");
			fileHandler.writeToCSV(receipt);
			fileHandler.writeToCSV(receipt1);
			fileHandler.writeToCSV(new Receipt("Hat", 10.00, 1));
			System.out.println("File written successfully");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
        for (Receipt r : fileHandler.readFromCSV()) {
        	System.out.println("Printing receipts");
            System.out.println(r);
        }
	}
}
