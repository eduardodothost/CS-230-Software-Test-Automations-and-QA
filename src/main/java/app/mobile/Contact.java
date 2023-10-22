package app.mobile;

import java.lang.reflect.Field;
import java.security.InvalidParameterException;

/**
 * Data structure for name, number, location -- the Contact class.
 * @author eduardo.rodrigues1@snhu.edu
 *
 */
@SuppressWarnings("unused")
public class Contact {
	//final private String character_10_long = "          ";
	//final private String character_30_long = "                              ";
	private String id;
	private String firstName;
	private String lastName;
	private String phone;
	private String address;
	//private String INVALID = "Invalid Parameter";
	
	private Contact() {
	
	}

	/**
	 * @param id
	 * @param firstName 
	 * @param lastName 
	 * @param phone 
	 * @param address 
	 
	 */
	public Contact(String id_m, String firstName_m, String lastName_m, String phone_m, String address_m) {
		this();
		// IllegalArgumentException(INVALID);
		if(id_m == null || id_m.length()>10 || id_m.trim().equals("") || id_m.equals("")) {
			throw new IllegalArgumentException();
		}
		if(firstName_m == null || firstName_m.length()>10 || firstName_m.trim().equals("") || firstName_m.equals("")) {
			throw new IllegalArgumentException("Invalid first name");
		}
		if(lastName_m == null || lastName_m.length()>10 || lastName_m.trim().equals("") || lastName_m.equals("")) {
			throw new IllegalArgumentException("Invalid last name");
		}
		if(phone_m == null || phone_m.length()>10 || phone_m.trim().equals("") || phone_m.equals("")) {
			throw new IllegalArgumentException("Invalid phone");
		}
		if(address_m == null || address_m.length()>30 || address_m.trim().equals("") || address_m.equals("")) {
			throw new IllegalArgumentException("Invalid address");
		}
		this.id = id_m;
		this.firstName = firstName_m;
		this.lastName = lastName_m;
		this.address = address_m;
		this.phone = phone_m;
	}
	
	public void postContact(String phone_m) {
		if(phone_m.length()<10) {
		throw new IllegalArgumentException("Invalid phone");
		}
	}

	/**
	 * methods for setting contacts
	 * @see ContactService
	 */
	public void setfirstName(String mod) {
		//mod = character_10_long;
		if(mod == null || mod.length()>10 || mod.trim().equals("") || mod.equals("")) {
			throw new IllegalArgumentException("Invalid Id");
		}
		this.firstName = mod;
	}
	public void setlastName(String mod) {

		if(mod == null || mod.length()>10 || mod.trim().equals("") || mod.equals("")) {
			throw new IllegalArgumentException("Invalid last name");
		}
		this.lastName = mod;
	}
	public void setphone(String mod) {

		if(mod == null || mod.length()>10 || mod.trim().equals("") || mod.equals("")) {
			throw new IllegalArgumentException("Invalid phone");
		}
		if(mod.length()<10) {
			throw new IllegalArgumentException("Invalid phone");
		}
		this.phone = mod;
	}
	public void setaddress(String mod) {
		//mod = character_30_long;
		if(mod == null || mod.length()>30 || mod.trim().equals("") || mod.equals("")) {
			throw new IllegalArgumentException("Invalid address");
		}
		this.address = mod;
	}
	
	public String getid() {
		return id;
	}
	public String getfirstName() {
		return firstName;
	}
	public String getlastName() {
		return lastName;
	}
	public String getphone() {
		return phone;
	}
	public String getaddress() {
		return address;
	}
	
	



}
