//Author Name: Sorosh Khalili

//Date: 04/10/2022

//Course ID: CS-320-T4514
 

package module6;

import java.util.Date;
import java.util.concurrent.atomic.AtomicLong;

// Appointment class to create and store appointment.
public class Appointment {
	private final String appointmentID;
	private Date appointmentDate;
	private Date currentDate = new Date();
	private String description;
	private static AtomicLong uniqueID = new AtomicLong();

	// Appointment class Constructor
	public Appointment(Date appointmentDate, String description)  {

		// Generate a unique ID and set its appropriate variable.
		this.appointmentID = String.valueOf(uniqueID.getAndIncrement());

		// The null or in the past appointment date will be set to current date.
		if (appointmentDate == null || appointmentDate.before(currentDate)) {
			this.appointmentDate = currentDate;
		} 
		else {
			this.appointmentDate = appointmentDate;
		}

		// The null or blank description will be set to "NULL".
		if (description == null || description.isBlank()) {
			this.description = "NULL";
		}
		// It shortens longer than 50 characters' description to the first 50 characters.
		else if(description.length() > 50) {
			this.description = description.substring(0,50);
		} 
		else {
			this.description = description;
		}
	
	}

	//	Getters
	public String getAppointmentID() {
		return appointmentID;
	}

	public Date getAppointmentDate() {
		return appointmentDate;
	}

	public String getDescription() {
		return description;
	}

	/* Since the customer's requirements have not asked for 
	 * the ability to update the appointment date or 
	 * description, setters are not required for the proper 
	 * function of the application. However, they have been 
	 * provided here, but they have been commented out.  
	 */
	
	/*	
	
	// Setters
	public void setAppointmentDate(Date appointmentDate) {
		if (appointmentDate == null || appointmentDate.before(currentDate)) {
			this.appointmentDate = currentDate;
		} 
		else {
			this.appointmentDate = appointmentDate;
		}
	}

	public void setDescription(String description) {
		if (description == null || description.isBlank()) {
			this.description = "NULL";
		} 
		else if(description.length() > 50) {
			this.description = description.substring(0,50);
		} 
		else {
			this.description = description;
		}
	}
	
	*/
}