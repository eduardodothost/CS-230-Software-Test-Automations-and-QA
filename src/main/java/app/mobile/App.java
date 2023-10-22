package app.mobile;

import java.util.Calendar;
import java.util.Date;

public class App {

	public static int main(String[] args) {
		Calendar c_fut = Calendar.getInstance();
		c_fut.setTime(new Date()); // Now use today date.
		c_fut.add(Calendar.DATE, 15); //  15 days in future
		Date futd = c_fut.getTime();
		AppointmentService link = new AppointmentService();
		link.addAppointment(futd, "Dentist Post Rd. ->  Eddy");
		link.addAppointment(futd, "Hair Salon Mamaroneck Ave. -> Ale");
		for(Appointment appointment: link.appointments) {
			System.out.printf(appointment.toString());
		}
		return 0;
		
	}

}