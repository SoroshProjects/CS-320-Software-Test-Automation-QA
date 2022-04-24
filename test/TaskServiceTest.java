//Author Name: Sorosh Khalili

//Date: 04/10/2022

//Course ID: CS-320-T4514


package test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

import module6.Task;
import module6.TaskService;

import org.junit.jupiter.api.Order;

	@TestMethodOrder(OrderAnnotation.class)
	public class TaskServiceTest {

		@Test
		@DisplayName("Test to Update task name.")
		@Order(1)
		void testUpdateTaskName() {
			TaskService service = new TaskService();
			service.addTask("Task one", "This is the Task one Description");
			service.updateTaskName("New Task", "0");
			//service.displayTaskList();
			assertEquals("New Task",service.getTask("0").getTaskName(), "Task name was not updated.");
		}

		@Test
		@DisplayName("Test to Update description.")
		@Order(2)
		void testUpdateDescription() {
			TaskService service = new TaskService();
			service.addTask("Task one", "This is the Task one Description");
			service.updateDescription("This is the New Task Description", "2");
			//service.displayTaskList();
			assertEquals("This is the New Task Description",service.getTask("2").getDescription(), "Description was not updated.");
		}


		@Test
		@DisplayName("Test to ensure that service correctly deletes task.")
		@Order(3)
		void testDeleteTask() {
			TaskService service = new TaskService();
			service.addTask("Task one", "This is the Task one Description");
			service.deleteTask("4");
			ArrayList<Task> taskListEmpty = new ArrayList<Task>();
			//service.displayTaskList();
			assertEquals(service.taskList, taskListEmpty, "The task was not deleted.");
		}

		@Test
		@DisplayName("Test to ensure that service can add a task.")
		@Order(4)
		void testAddTask() {
			TaskService service = new TaskService();
			service.addTask("New Task", "This is the New Task Description");
			//service.displayTaskList();
			assertNotNull(service.getTask("4"), "New task was not added correctly.");
		}

		@Test
		@DisplayName("Test to ensure that service can add multiple tasks.")
		@Order(5)
		void testAddMultipleTasks() {
			TaskService service = new TaskService();
			Task task1 = new Task("Task Name 1", "Task Name 1 Description");
			assertTrue(task1.getTaskName().equals("Task Name 1"));
			assertTrue(task1.getDescription().equals("Task Name 1 Description"));
			service.taskList.add(task1);
			
			Task task2 = new Task("Task Name 2", "Task Name 2 Description");
			assertTrue(task2.getTaskName().equals("Task Name 2"));
			assertTrue(task2.getDescription().equals("Task Name 2 Description"));
			service.taskList.add(task2);

			Task task3 = new Task("Task Name 3", "Task Name 3 Description");
			assertTrue(task3.getTaskName().equals("Task Name 3"));
			assertTrue(task3.getDescription().equals("Task Name 3 Description"));
			service.taskList.add(task3);

			//service.displayTaskList();
			assertNotNull(service.getTask("7"), "New task was not added correctly.");
			assertNotNull(service.getTask("8"), "New task was not added correctly.");
			assertNotNull(service.getTask("9"), "New task was not added correctly.");
		}

	}