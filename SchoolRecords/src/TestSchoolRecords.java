import java.util.ArrayList;

public class TestSchoolRecords {

	public static void main(String[] args) {

		Database db = new Database();
		
		Student s1 = new Student("Ethan", "123 St", "123-4567", "ethan@gmail.com", Status.SENIOR);
        Student s2 = new Student("Bob", "456 St", "987-6543", "bob@gmail.com", Status.SOPHOMORE);
        Faculty f1 = new Faculty("Maggie", "789 St", "555-5555", "maggie@gmail.com", "Office 1", 80000, "2010", "9AM-5PM", Rank.JUNIOR);
        Faculty f2 = new Faculty("Jason", "159 St", "666-6666", "jason@gmail.com", "Office 2", 75000, "2012", "10AM-4PM", Rank.SENIOR);
        Staff st1 = new Staff("April", "753 St", "777-7777", "april@gmail.com", "Office 1", 50000, "2015", "Manager");
        Staff st2 = new Staff("Jane", "951 St", "888-8888", "jane@gmail.com", "Office 2", 48000, "2018", "Assistant");
        
		db.writePerson(s1);
		db.writePerson(s2);
		db.writePerson(f1);
		db.writePerson(f2);
		db.writePerson(st1);
		db.writePerson(st2);
				
		db.readDatabase();
		
//		ArrayList<Person> people = db.readDatabase();
//        for (Person person : people) {
//            System.out.println(person);
//        }
	}
}
