package app.mobile;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * AppointmentService follows is used to hold multiple Appointment instances
 * @see Appointment
 * 
 * @author eduardo.rodrigues1@snhu.edu
 */
public class AppointmentService {

	/**
	 * <p>A list of Appointment objects
	 */
	public List<Appointment> appointments = new ArrayList<Appointment>();

	public int nextTaskId = -1;

	public AppointmentService(){}

	/**
	 * Construct a new contact instance
	 * 
	 * @param date 
	 * @param description 
	 * @return the contact instance with a unique id
	 */
	public Appointment addAppointment(Date date, String description)throws InvalidParameterException {
		// add an appointment
		nextTaskId++;
		String StringId = Integer.toString(nextTaskId);
		Appointment appointment = new Appointment(StringId, date, description);
		appointments.add(appointment);
		// return the new/existing Appointment instance to the caller
		return appointment;
	}
	public void delAppointment(String id) {
		int delimiter = 0;
		for(Appointment entry : appointments) {
			if(entry.getid().contentEquals(id)) {
				appointments.remove(delimiter);
				break;
			}
			delimiter++;
		}
	}
	
	public Appointment getContact(int index)throws IndexOutOfBoundsException {
		return appointments.get(index);
	}
	
	
}//EOF AppointmentService Class
