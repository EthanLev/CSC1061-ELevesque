import java.util.HashMap;
import java.util.Map;

public class TaskChecklist {
	/**
	 * Map to store tasks and their completion status
	 */
	private Map<String, Boolean> tasks;
	
	public TaskChecklist() {
		this.tasks = new HashMap<>();
	}
	
	public void addTask(String task) {
		tasks.put(task, false);
	}
	
	public void markTaskComplete(String task) {
		tasks.replace(task, true);
	}
	
	public String displayTasks() {
		// returns string of all tasks with their completion
		// status.displayIncompleteTasks();
		
		for (int i = 0; i < tasks.size(); i++) {
			String status = "Incomplete";
			
			if (tasks.containsValue(true)) {
				status = "Complete";
			}
			
			System.out.println(i + " ");
			System.out.println(status + " ");
			
			return status;
		}
		
		return null;
	}
}
