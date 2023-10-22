package app.mobile;

import java.util.ArrayList;
import java.util.List;

/**
 * TaskService follows the singleton pattern.
 * It is used to hold multiple Task instances
 * @see Task
 * 
 * @author eduardo.rodrigues1@snhu.edu
 */
public class TaskService {

	/**
	 * <p>A list of Task objects
	 */
	public List<Task> tasks = new ArrayList<Task>();

	public int nextTaskId = -1;

	public static TaskService TaskServiceInstance = new TaskService();
	//public TaskService TaskServiceInstance = new TaskService();
	/**
	 * The private constructor enables a unique instantiation 
	 * of a TaskService object from within TaskService. Allowing the
	 * IE the singleton pattern.
	 */
	/**
	 * @return a unique TaskService instance
	 */
	//public TaskService(){}
	public TaskService(){}
	public static synchronized TaskService getTaskServiceInstance() {
		return TaskServiceInstance;
	}
//	
	public void reset() {
		nextTaskId = -1;
		tasks = new ArrayList<Task>();
	}
	
	/**
	 * Construct a new contact instance
	 * 
	 * @param name 
	 * @param description 
	 * @return the contact instance with a unique id
	 */
	public Task addTask(String name, String description) {
		// add a contact
		nextTaskId++;
		String StringId = Integer.toString(nextTaskId);
		Task task = new Task(StringId, name, description);
		tasks.add(task);
		// return the new/existing contact instance to the caller
		return task;
	}
	public void delContact(String id) {
		int delimiter = 0;
		for(Task entry : tasks) {
			if(entry.getid().contentEquals(id)) {
				tasks.remove(delimiter);
				break;
			}
			delimiter++;
		}
	}
	
	public void setname(String id, String mod) {
		int delimiter = 0;
		for(Task entry : tasks) {
			if(entry.getid().contentEquals(id)) {
				tasks.get(delimiter).setname(mod);
				break;
			}
			delimiter++;
		}
	}
	
	public void setdescription(String id, String mod) {
		int delimiter = 0;
		for(Task entry : tasks) {
			if(entry.getid().contentEquals(id)) {
				tasks.get(delimiter).setdescription(mod);
				break;
			}
			delimiter++;
		}
	}
	
	// for testing purposes to access the arrayList and to make separate copies of the singleton
	public Task getContact(int index)throws IndexOutOfBoundsException {
		return tasks.get(index);
	}
	
	public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
	

}//EOF TaskService Class
