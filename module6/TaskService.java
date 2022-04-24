//Author Name: Sorosh Khalili

//Date: 04/10/2022

//Course ID: CS-320-T4514


package module6;

import java.util.ArrayList;

public class TaskService {

	// ArrayList of task to hold the list of tasks.
	public ArrayList<Task> taskList = new ArrayList<Task>();
/*
	// Display the full list of tasks.
	public void displayTaskList() {
		for(int i = 0; i < taskList.size(); i++) {
			System.out.println("\t Task ID: " + taskList.get(i).getTaskID());
			System.out.println("\t Task Name: " + taskList.get(i).getTaskName());
			System.out.println("\t Task Description: " + taskList.get(i).getDescription() + "\n");
		}
	}
*/
	// Creates a new task and adds it to the list.
	public void addTask(String taskName, String description) {
		
		// Create a new task.
		Task task = new Task(taskName, description);
		// Adds a new task to the array list.
		taskList.add(task);
	}

	// Using Task ID, return a task object.
	public Task getTask(String taskID) {
		
		// Creates a new task object with default values.
		Task task = new Task(null,null);
		for(int i = 0; i < taskList.size(); i++) {
			// If a match is found, replace the new task object with default values with it.
			if(taskList.get(i).getTaskID().contentEquals(taskID)) {
				task = taskList.get(i);
			}
		}
		return task;
	}

	// Delete task.
	public void deleteTask(String taskID) {
		for(int i = 0; i < taskList.size(); i++) {
			// If a match is found, it will be deleted.
			if(taskList.get(i).getTaskID().equals(taskID)) {
				taskList.remove(i);
				break;
			}
			// If no match is found after reaching the end of the list, it will prompt an error message.
			if(i == taskList.size()-1) {
				System.out.println("Task ID: " + taskID + " does not exist.");
			}
		}
	}

	// Update the task name.
	public void updateTaskName(String newTaskName, String taskID) {
		for(int i = 0; i < taskList.size(); i++) {
			// If a match is found, its task name will be updated.
			if(taskList.get(i).getTaskID().equals(taskID)) {
				taskList.get(i).setTaskName(newTaskName);
				break;
			}
			// If no match is found after reaching the end of the list, it will prompt an error message.
			if(i == taskList.size()-1) {
				System.out.println("Task ID: " + taskID + " does not exist.");
			}
		}
	}

	// Update the description.
	public void updateDescription(String newDescription, String taskID) {
		for(int i = 0; i < taskList.size(); i++) {
			// If a match is found, its description will be updated.
			if(taskList.get(i).getTaskID().equals(taskID)) {
				taskList.get(i).setDescription(newDescription);
				break;
			}
			// If no match is found after reaching the end of the list, it will prompt an error message.
			if(i == taskList.size()-1) {
				System.out.println("Task ID: " + taskID + " does not exist.");
			}
		}
	}

}