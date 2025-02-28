
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;


/**
 *  Database for reading and writing Person objects to and from a file
 */
public class Database {
	
	private static final String PERSON_FILE = "PersonDatabase.txt";
	private File file = new File(PERSON_FILE);
	
	PrintWriter writer = null;
	FileOutputStream fout;
	
	/** 
	 *  Constructor that creates new file if one doesn't already exist
	 */
	public Database() {
		try {
            if (!file.exists()) {
                boolean fileCreated = file.createNewFile();
                if (fileCreated) {
                    System.out.println("File created: " + PERSON_FILE);
                }
            }
            
            System.out.println("File already exists.\n" + file.getAbsolutePath());
            
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            System.out.println("An error occurred when creating the file");
            System.exit(-1);  
        }
	}
	
	/**
	 *  Writes a Person object to the .txt file
	 *  @param person The Person object to write to the file
	 */
	public void writePerson(Person person) {
		
		if (file.exists()) {
			try {
				fout = new FileOutputStream(file, true);
				writer = new PrintWriter(fout);
				
				writer.write(person.getClass().getSimpleName() + "\n");
				writer.write(person.toString() + "\n");
				
				writer.close();
				System.out.println(person.getName() + "'s information has been written to file");
				
			} catch (FileNotFoundException e) {
				System.out.println("File not found: " + e.getMessage());
	            e.printStackTrace();  
			}
		}
	} 
	
	/**
	 *  Reads all Person objects from .txt file
	 *  @return ArrayList of Person
	 */
	public ArrayList<Person> readDatabase() {
		ArrayList<Person> people = new ArrayList<>();
		
		return null;
	}
}
