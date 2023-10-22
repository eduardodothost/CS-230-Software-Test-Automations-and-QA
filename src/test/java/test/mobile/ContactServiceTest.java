/**
 *
 */
package test.mobile;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import app.mobile.ContactService;


class ContactServiceTest {
	
	
	final String character_10_long = "Charmander";
	final String character_30_long = "Vokalia and Consonantia, there";
	

	/**
	 * Test method for {@link app.mobile.ContactService#getContactServiceInstance()}.
	 */
	@Test
	final void testGetContactServiceInstance() {
		ContactService link = new ContactService();
		assertTrue(link instanceof ContactService);
	}
	
	/**
	 * Test method for {@link app.mobile.ContactService#addContact(java.lang.String, java.lang.String, java.lang.String, java.lang.String)}.
	 */

	@Test
	final void testAddContactfirstName() {
		ContactService link = new ContactService();
		int argument = 0;
		for(int i = 0; i<100; i++) {
			argument = i;
			link.addContact(character_10_long, character_10_long, character_10_long, character_30_long);
			assertTrue(link.getContact(argument).getfirstName().contentEquals(character_10_long));
		}
	}
	@Test

	final void testAddContactlastName() {
		ContactService link = new ContactService();
		int argument = 0;
		for(int i = 0; i<100; i++) {
			argument = i;
			link.addContact(character_10_long, character_10_long, character_10_long, character_30_long);
			assertTrue(link.getContact(argument).getlastName().contentEquals(character_10_long));
		}
	}
	@Test
	final void testAddContactphone() {
		ContactService link = new ContactService();
		int argument = 0;
		for(int i = 0; i<100; i++) {
			argument = i;
			link.addContact(character_10_long, character_10_long, character_10_long, character_30_long);
			assertTrue(link.getContact(argument).getphone().contentEquals(character_10_long));
		}
	}
	@Test
	final void testAddContactaddress() {
		ContactService link = new ContactService();
		int argument = 0;
		for(int i = 0; i<100; i++) {
			argument = i;
			link.addContact(character_10_long, character_10_long, character_10_long, character_30_long);
			assertTrue(link.getContact(argument).getaddress().contentEquals(character_30_long));
		}
	}
	@Test
	final void testGetUniqueContactid() {
		int argument = 0;
		ContactService link = new ContactService();
		int idInt = argument;
		String idString = Integer.toString(idInt);
		link.addContact(character_10_long, character_10_long, character_10_long, character_30_long);
		assertTrue(link.getContact(argument).getid().contentEquals(idString));
	}
	@Test
	final void testGetUniqueContactid2() {
		int argument = 1;
		ContactService link = new ContactService();
		int idInt = argument;
		String idString = Integer.toString(idInt);
		link.addContact(character_10_long, character_10_long, character_10_long, character_30_long);
		link.addContact(character_10_long, character_10_long, character_10_long, character_30_long);
		assertTrue(link.getContact(argument).getid().contentEquals(idString));
	}

	/**
	 * Test method for {@link app.mobile.ContactService#delContact(java.lang.String)}.
	 */
	@Test
	final void testDelContact() {
		ContactService link = new ContactService();
		//link.reset();
		link.addContact(character_10_long, character_10_long, character_10_long, character_30_long);
		assertThrows(IndexOutOfBoundsException.class, () -> {
			link.delContact("0");
			link.getContact(0);
    	});
	}

	/**
	 * Test method for {@link app.mobile.ContactService#setfirstName(java.lang.String, java.lang.String)}.
	 */
	@Test
	final void testSetfirstName() {
		//ContactService link = ContactService.getContactServiceInstance();
		ContactService link = new ContactService();
		link.addContact(character_10_long, character_10_long, character_10_long, character_30_long);
		link.setfirstName("0", "Amadeo");
		assertTrue(link.getContact(0).getfirstName().contentEquals("Amadeo"));
	}

	/**
	 * Test method for {@link app.mobile.ContactService#setlasttName(java.lang.String, java.lang.String)}.
	 */
	@Test
	final void testSetlasttName() {
		//ContactService link = ContactService.getContactServiceInstance();
		ContactService link = new ContactService();
		link.addContact(character_10_long, character_10_long, character_10_long, character_30_long);
		link.setlasttName("0", "Avogardo");
		assertTrue(link.getContact(0).getlastName().contentEquals("Avogardo"));
	}

	/**
	 * Test method for {@link app.mobile.ContactService#setphone(java.lang.String, java.lang.String)}.
	 */
	@Test
	final void testSetphone() {
		//link.reset();
		ContactService link = new ContactService();
		link.addContact(character_10_long, character_10_long, character_10_long, character_30_long);
		link.setphone("0", "5555555555");
		assertTrue(link.getContact(0).getphone() == "5555555555");
	}

	/**
	 * Test method for {@link app.mobile.ContactService#setaddress(java.lang.String, java.lang.String)}.
	 */
	@Test
	final void testSetaddress() {
		//ContactService link = ContactService.getContactServiceInstance();
		ContactService link = new ContactService();
		link.addContact(character_10_long, character_10_long, character_10_long, character_30_long);
		link.setaddress("0", "A wonderful serenity has taken");
		assertTrue(link.getContact(0).getaddress() == "A wonderful serenity has taken");
	}

}
