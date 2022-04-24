//Author Name: Sorosh Khalili

//Date: 04/10/2022

//Course ID: CS-320-T4514


package test;

import org.junit.jupiter.api.Test;

import module6.Task;

import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

//import org.junit.jupiter.api.Assertions;

public class TaskTest {
	
	
	@Test
	@DisplayName("Create New Task")
	void testCreateNewTask() {
		Task task = new Task("Task Name", "Task Description");
		assertTrue(task.getTaskName().equals("Task Name"));
		assertTrue(task.getDescription().equals("Task Description"));
	}
		
	@Test
	@DisplayName("Task ID cannot have more than 10 characters")
	void testTaskIDWithMoreThanTenCharacters() {
		Task task = new Task("TaskName","Description");
		if(task.getTaskID().length() > 10) {
			fail("Contact ID has more than 10 characters.");
		}
	}

	@Test
	@DisplayName("Task Name cannot have more than 20 characters")
	void testTaskNameWithMoreThanTwentyCharacters() {
		Task task = new Task("TaskName has more than 20 characters","Description");
		if(task.getTaskName().length() > 20) {
			fail("Task Name has more than 20 characters.");
		}
	}

	@Test
	@DisplayName("Task Description cannot have more than 50 characters")
	void testTaskDescriptionWithMoreThanFiftyCharacters() {
		Task task = new Task("TaskName","The description for the task name is longer than 50 characters");
		if(task.getDescription().length() > 50) {
			fail("Task Description has more than 50 characters.");
		}
	}

	@Test
	@DisplayName("Task Name shall not be null")
	void testTaskNameNotNull() {
		Task task = new Task(null, "Description");
		assertNotNull(task.getTaskName(), "Task Name was null.");
	}

	@Test
	@DisplayName("Task Description shall not be null")
	void testTaskDescriptionNotNull() {
		Task task = new Task("TaskName", null);
		assertNotNull(task.getDescription(), "Task Description was null.");
	}

}

