
public class TestSchoolRecords {

	public static void main(String[] args) {
		
		Student student1 = new Student("Bobby Bob", "123 Main St", "555-1234", "bobby@gmail.com", Status.SENIOR);
        Student student2 = new Student("Billy Bill", "456 Elm St", "555-5678", "billy@gmail.com", Status.SOPHOMORE);

		Database db = new Database();
		db.writePerson(student1);
		db.writePerson(student2);
	}
}
