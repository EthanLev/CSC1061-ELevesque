import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileOutputStream;

public class FileWriter {

	public static void main(String[] args) {
	    File myFile = new File("C:\\fileWriteTest.txt");
	    
	    PrintWriter pWriter = null;
	    
	    // Declare a FileOutputStream variable for writing to the file
	    FileOutputStream fout;
	    
	    if (!myFile.exists()) {
	        try {
	            // Create a new file on disk
	            myFile.createNewFile();
	            
	            // Open a FileOutputStream in append mode (true means append to file)
	            fout = new FileOutputStream(myFile, true);
	            
	            // Initialize the PrintWriter with the FileOutputStream for writing text to the file
	            pWriter = new PrintWriter(fout);    
	        }
	        catch (FileNotFoundException e) {
	            // Handle case where the file is not found (shouldn't occur here after createNewFile())
	            System.out.println(e.getMessage());
	            e.printStackTrace();            
	        }
	        catch (IOException e) {
	            // Handle other I/O errors (e.g., file creation problems)
	            System.out.println(e.getMessage());
	            e.printStackTrace();
	            System.out.println("Cannot write to " + myFile.getName());
	            // Exit the program with an error code if writing is not possible
	            System.exit(-1);                
	        }
	    }
	    
	    // Write a line of text to the file using the PrintWriter
	    pWriter.println("The moon is full today");
	    
	    // pWriter.printf("The answer is %d", 3 + 2);
	    
	    // Flush any remaining data and close the PrintWriter to release system resources
	    pWriter.close();
	}

}