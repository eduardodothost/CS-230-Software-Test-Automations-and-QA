package app.mobile;
import java.util.Date;

/**
 * Data structure for name, number, location -- the Appointment class.
 * @author eduardo.rodrigues1@snhu.edu
 *
 */
public class Appointment {

	private String id;
	private Date date;
	private String description;
	
	public Appointment() {
	
	}

	/**
	 * @param id
	 * @param date
	 * @param description
	 
	 */
	public Appointment(String id_m, Date date_m, String description_m){
		// IllegalArgumentException(INVALID);
		if(id_m == null || id_m.length()>10 || id_m.trim().equals("") || id_m.equals("")) {
			throw new IllegalArgumentException();
		}
		
		if(date_m == null || date_m.before(new Date())) {
			throw new IllegalArgumentException();
		}

		if(description_m == null || description_m.length()>50 || description_m.trim().equals("") || description_m.equals("")) {
			throw new IllegalArgumentException("Invalid description");
		}
		this.id = id_m;
		this.date = date_m;
		this.description = description_m;
	}
	
	public String getid()throws RuntimeException {
		return id;
	}

	
	@Override
	public
	String toString() {
		return date.toString() + " : " + description+"\n";
	}



}
