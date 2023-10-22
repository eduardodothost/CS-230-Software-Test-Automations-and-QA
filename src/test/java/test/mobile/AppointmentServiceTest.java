/**
 * @author eduardo.rodrigues1@snhu.edu
 */
package test.mobile;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Calendar;
import java.util.Date;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import app.mobile.AppointmentService;

class AppointmentServiceTest {
	
	// global constants for testing parameter lengths
	final String character_10_long = "Charmander";
	final String character_50_long = "But I must explain to you how all this mistaken id";
	static Date futd;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {

		Calendar c_fut = Calendar.getInstance();
		c_fut.setTime(new Date()); // Now use today date.
		c_fut.add(Calendar.DATE, 15); //  15 days in future
		futd = c_fut.getTime();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
	
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link app.mobile.AppointmentService#getAppointmentServiceInstance()}.
	 */
	@Test
	final void testGetAppointmentServiceInstance() {
		AppointmentService link = new AppointmentService();
		assertTrue(link instanceof AppointmentService);
	}
	

	@Test
	final void testGetUniqueTaskidStep1() {
		int argument = 0;
		AppointmentService link = new AppointmentService();
		String idString = Integer.toString(argument);
		link.addAppointment(futd, "test");
		link.addAppointment(futd, "test");
		link.addAppointment(futd, "test");
		assertTrue(link.getContact(argument).getid().contentEquals(idString));
	}
	
	@Test
	final void testGetUniqueTaskid2() {
		int argument = 1;
		AppointmentService link = new AppointmentService();
		int idInt = argument;
		String idString = Integer.toString(idInt);
		link.addAppointment(futd, "test");
		link.addAppointment(futd, "test");
		assertTrue(link.getContact(argument).getid().contentEquals(idString));
	}

	/**
	 * Test method for {@link app.mobile.AppointmentService#delContact(java.lang.String)}.
	 */
	@Test
	final void testDelTask() {
		AppointmentService link = new AppointmentService();
		link.addAppointment(futd, "test");
		assertThrows(IndexOutOfBoundsException.class, () -> {
			link.delAppointment("0");
			link.getContact(0);
    	});
	}
}
