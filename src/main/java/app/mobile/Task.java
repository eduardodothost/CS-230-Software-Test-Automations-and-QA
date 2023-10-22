package app.mobile;

import java.lang.reflect.Field;
import java.security.InvalidParameterException;

/**
 * Data structure for name, number, location -- the Task class.
 * @author eduardo.rodrigues1@snhu.edu
 *
 */
@SuppressWarnings("unused")
public class Task {
	//final private String character_10_long = "          ";
	//final private String character_30_long = "                              ";
	private String id;
	private String name;
	private String description;
	//private String INVALID = "Invalid Parameter";
	
	private Task() {
	
	}

	/**
	 * @param id
	 * @param name 
	 * @param description 
	 
	 */
	public Task(String id_m, String name_m, String description_m) {
		this();
		// IllegalArgumentException(INVALID);
		if(id_m == null || id_m.length()>10 || id_m.trim().equals("") || id_m.equals("")) {
			throw new IllegalArgumentException();
		}
		if(name_m == null || name_m.length()>20 || name_m.trim().equals("") || name_m.equals("")) {
			throw new IllegalArgumentException("Invalid name");
		}
		if(description_m == null || description_m.length()>50 || description_m.trim().equals("") || description_m.equals("")) {
			throw new IllegalArgumentException("Invalid description");
		}
		this.id = id_m;
		this.name = name_m;
		this.description = description_m;
	}
	
	/**
	 * methods for setting tasks
	 * @see TaskService
	 */
	public void setname(String mod) {
		//mod = character_10_long;
		if(mod == null || mod.length()>20 || mod.trim().equals("") || mod.equals("")) {
			throw new IllegalArgumentException("Invalid Id");
		}
		this.name = mod;
	}

	public void setdescription(String mod) {
		//mod = character_30_long;
		if(mod == null || mod.length()>50 || mod.trim().equals("") || mod.equals("")) {
			throw new IllegalArgumentException("Invalid description");
		}
		this.description = mod;
	}
	
	public String getid() {
		return id;
	}
	public String getname() {
		return name;
	}
	public String getdescription() {
		return description;
	}
	
	



}
