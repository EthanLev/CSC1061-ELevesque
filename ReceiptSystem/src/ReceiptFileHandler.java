import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReceiptFileHandler {
	
	private final String fileName;
	
	FileWriter writer = null;
	Scanner scnr = null;
	
	public ReceiptFileHandler(String fileName) {
		this.fileName = fileName;
		tryCreateFile();
	}
	
	public void writeToCSV(Receipt receipt) throws IOException {
		try {
			writer = new FileWriter(fileName, true);
			//writer.write(receipt.toString());
			writer.write(receipt.getItemName() + ", " +
						 receipt.getPrice() + ", " +
						 receipt.getQuantity() + ", " +
						 receipt.getTotal() + "\n");
			writer.flush();
		} catch (IOException e) {
			throw e;
		} finally {
			if (writer != null) {
				writer.close();
			}
		}
	}
	
	public List<Receipt> readFromCSV() {
	    List<Receipt> receipts = new ArrayList<>(); // List of receipts
	    try (Scanner scanner = new Scanner(new File(fileName))) {
	        while (scanner.hasNextLine()) {
	            String line = scanner.nextLine().trim(); // Trim to remove white space around string
	            String[] data = line.split("\\s*,\\s*"); // Split from commas and trim spaces
	            if (data.length == 4) {
	                String itemName = data[0]; // Get the item form receipt
	                double price = Double.parseDouble(data[1]);
	                int quantity = Integer.parseInt(data[2]);
	                receipts.add(new Receipt(itemName, price, quantity)); // Add new receipt object
	            }
	        }
	    } catch (IOException e) {
	        System.out.println("Error reading file: " + e.getMessage());
	    }
	    return receipts;
	}

	
	private void tryCreateFile() {
		File file = new File(fileName);
		try {
			if (!file.exists()) {
				file.createNewFile();
				System.out.println("File Created");
			} else {
				System.out.println("Updating existing file");
			}
		} catch (IOException e) {
			System.out.println("Error creating file: " + e.getMessage());
		}
	}
}
