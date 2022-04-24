//Author Name: Sorosh Khalili

//Date: 04/10/2022

//Course ID: CS-320-T4514
 

package module6;

import java.util.concurrent.atomic.AtomicLong;

// Task class to create and store task.
public class Task {
	private final String taskID;
	private String taskName;
	private String description;
	private static AtomicLong uniqueID = new AtomicLong();

	// Task class Constructor
	public Task(String taskName, String description)  {

		// Generate a unique ID and set its appropriate variable.
		this.taskID = String.valueOf(uniqueID.getAndIncrement());

		// The null or blank name will be set to "NULL".
		if (taskName == null || taskName.isBlank()) {
			this.taskName = "NULL";
		} 
		// It shortens longer than 20 characters' names to the first 20 characters.
		else if(taskName.length() > 20) {
			this.taskName = taskName.substring(0,20);
		} 
		else {
			this.taskName = taskName;
		}

		// The null or blank description will be set to "NULL".
		if (description == null || description.isBlank()) {
			this.description = "NULL";
		}
		// It shortens longer than 50 characters' description to the first 50 characters.
		else if(description.length() > 50) {
			this.description = description.substring(0,50);
		} 
		else {
			this.description = description;
		}
	
	}

	//	Getters
	public String getTaskID() {
		return taskID;
	}

	public String getTaskName() {
		return taskName;
	}

	public String getDescription() {
		return description;
	}

	
	// Setters
	public void setTaskName(String taskName) {
		if (taskName == null || taskName.isBlank()) {
			this.taskName = "NULL";
		} 
		else if(taskName.length() > 20) {
			this.taskName = taskName.substring(0,20);
		} 
		else {
			this.taskName = taskName;
		}
	}

	public void setDescription(String description) {
		if (description == null || description.isBlank()) {
			this.description = "NULL";
		} 
		else if(description.length() > 50) {
			this.description = description.substring(0,50);
		} 
		else {
			this.description = description;
		}
	}

}