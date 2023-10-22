package app.mobile;

import java.util.ArrayList;
import java.util.List;

/**
 * ContactService follows the singleton pattern.
 * It is used to hold multiple Contact instances
 * @see Contact
 * 
 * @author eduardo.rodrigues1@snhu.edu
 */
public class ContactService {

	/**
	 * <p>A list of Contact objects
	 */
	public List<Contact> contacts = new ArrayList<Contact>();

	public int nextContactId = -1;

	public static ContactService ContactServiceInstance = new ContactService();
	//public ContactService ContactServiceInstance = new ContactService();
	/**
	 * The private constructor enables a unique instantiation 
	 * of a ContactService object from within ContactService. Allowing the
	 * IE the singleton pattern.
	 */
	/**
	 * @return a unique ContactService instance
	 */
	//public ContactService(){}
	public ContactService(){}
	public static synchronized ContactService getContactServiceInstance() {
		return ContactServiceInstance;
	}
//	
	public void reset() {
		nextContactId = -1;
		contacts = new ArrayList<Contact>();
	}
	
	/**
	 * Construct a new contact instance
	 * 
	 * @param firstName 
	 * @param lastName 
	 * @param phone 
	 * @param address 
	 * @return the contact instance with a unique id
	 */
	public Contact addContact(String firstName, String lastName, String phone, String address) {
		// add a contact
		nextContactId++;
		String StringId = Integer.toString(nextContactId);
		Contact contact = new Contact(StringId, firstName, lastName, phone, address);
		contacts.add(contact);
		// return the new/existing contact instance to the caller
		return contact;
	}
	public void delContact(String id) {
		int delimiter = 0;
		for(Contact entry : contacts) {
			if(entry.getid().contentEquals(id)) {
				contacts.remove(delimiter);
				break;
			}
			delimiter++;
		}
	}
	
	public void setfirstName(String id, String mod) {
		int delimiter = 0;
		for(Contact entry : contacts) {
			if(entry.getid().contentEquals(id)) {
				contacts.get(delimiter).setfirstName(mod);
				break;
			}
			delimiter++;
		}
	}
	
	public void setlasttName(String id, String mod) {
		int delimiter = 0;
		for(Contact entry : contacts) {
			if(entry.getid().contentEquals(id)) {
				contacts.get(delimiter).setlastName(mod);
				break;
			}
			delimiter++;
		}
	}
	
	public void setphone(String id, String mod) {
		int delimiter = 0;
		for(Contact entry : contacts) {
			if(entry.getid().contentEquals(id)) {
				contacts.get(delimiter).setphone(mod);
				break;
			}
			delimiter++;
		}
	}
	
	public void setaddress(String id, String mod) {
		int delimiter = 0;
		for(Contact entry : contacts) {
			if(entry.getid().contentEquals(id)) {
				contacts.get(delimiter).setaddress(mod);
				break;
			}
			delimiter++;
		}
	}
	
	// for testing purposes to access the arrayList and to make separate copies of the singleton
	public Contact getContact(int index)throws IndexOutOfBoundsException {
		return contacts.get(index);
	}
	
	public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
	

}//EOF ContactService Class
