/**
 * 
 */
package test.mobile;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Field;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import app.mobile.TaskService;

/**
 * 
 */
@SuppressWarnings("unused")
class TaskServiceTest {
	
	
	final String character_10_long = "Charmander";
	final String character_20_long = "But I must explain t";
	final String character_50_long = "But I must explain to you how all this mistaken id";

	
	
	/**
	 * Test method for {@link app.mobile.TaskService#getTaskServiceInstance()}.
	 */
	@Test
	final void testGetTaskServiceInstance() {
		//TaskService link = TaskService.getContactServiceInstance();
		TaskService link = new TaskService();
		assertTrue(link instanceof TaskService);
	}
	
	/**
	 * Test method for {@link app.mobile.TaskService#addTask(java.lang.String, java.lang.String)}.
	 */

	@Test
	final void testAddTaskname() {
		TaskService link = new TaskService();
		int argument = 0;
		for(int i = 0; i<100; i++) {
			argument = i;
			link.addTask(character_20_long, character_50_long);
			assertTrue(link.getContact(argument).getname().contentEquals(character_20_long));
		}
	}
	@Test

	final void testAddTaskdescription() {
		TaskService link = new TaskService();
		int argument = 0;
		for(int i = 0; i<100; i++) {
			argument = i;
			link.addTask(character_20_long, character_50_long);
			assertTrue(link.getContact(argument).getdescription().contentEquals(character_50_long));
		}
	}
	@Test

	final void testGetUniqueTaskid() {
		int argument = 0;
		TaskService link = new TaskService();
		int idInt = argument;
		String idString = Integer.toString(idInt);
		link.addTask(character_20_long, character_50_long);
		assertTrue(link.getContact(argument).getid().contentEquals(idString));
	}

	/**
	 * Test method for {@link app.mobile.TaskService#delContact(java.lang.String)}.
	 */
	@Test
	final void testDelTask() {
		TaskService link = new TaskService();
		//link.reset();
		link.addTask(character_20_long, character_50_long);
		assertThrows(IndexOutOfBoundsException.class, () -> {
			link.delContact("0");
			link.getContact(0);
    	});
	}

	/**
	 * Test method for {@link app.mobile.TaskService#setname(java.lang.String, java.lang.String)}.
	 */
	@Test
	final void testSetname() {
		//TaskService link = TaskService.getContactServiceInstance();
		TaskService link = new TaskService();
		link.addTask(character_20_long, character_50_long);
		link.setname("0", "Hiking in Appalachia");
		assertTrue(link.getContact(0).getname().contentEquals("Hiking in Appalachia"));
	}


	/**
	 * Test method for {@link app.mobile.TaskService#setdescription(java.lang.String, java.lang.String)}.
	 */
	@Test
	final void testSetdescription() {
		//TaskService link = TaskService.getContactServiceInstance();
		TaskService link = new TaskService();
		link.addTask(character_10_long, character_50_long);
		link.setdescription("0", "Far far away, behind the word mountains, far from.");
		assertTrue(link.getContact(0).getdescription() == "Far far away, behind the word mountains, far from.");
	}

}
