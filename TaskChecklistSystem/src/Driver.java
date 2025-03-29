
public class Driver {

	public static void main(String[] args) {
		TaskChecklist list = new TaskChecklist();
		
		list.addTask("Finish work");
		list.addTask("Make some food");
		list.addTask("Go poop");
		
		list.displayTasks();
		
		list.markTaskComplete("Go poop");
		
		list.displayTasks();
	}
}
