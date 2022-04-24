//Author Name: Sorosh Khalili

//Date: 04/10/2022

//Course ID: CS-320-T4514


package module6;

import java.util.Date;
import java.util.ArrayList;


public class AppointmentService {

	// ArrayList of appointment to hold the list of appointments.
	public ArrayList<Appointment> appointmentList = new ArrayList<Appointment>();
/*
	// Display the full list of appointments.
	public void displayAppointmentList() {
		for(int i = 0; i < appointmentList.size(); i++) {
			System.out.println("\t Appointment ID: " + appointmentList.get(i).getAppointmentID());
			System.out.println("\t Appointment Date: " + appointmentList.get(i).getAppointmentDate());
			System.out.println("\t Appointment Description: " + appointmentList.get(i).getDescription() + "\n");
		}
	}
*/
	// Creates a new appointment and adds it to the list.
	public void addAppointment(Date appointmentDate, String description) {
		
		// Create a new appointment.
		Appointment appointment = new Appointment(appointmentDate, description);
		// Adds a new appointment to the array list.
		appointmentList.add(appointment);
	}

	// Using Appointment ID, return a appointment object.
	public Appointment getAppointment(String appointmentID) {
		
		// Creates a new appointment object with default values.
		Appointment appointment = new Appointment(null,null);
		for(int i = 0; i < appointmentList.size(); i++) {
			// If a match is found, replace the new appointment object with default values with it.
			if(appointmentList.get(i).getAppointmentID().contentEquals(appointmentID)) {
				appointment = appointmentList.get(i);
			}
		}
		return appointment;
	}

	// Delete appointment.
	public void deleteAppointment(String appointmentID) {
		for(int i = 0; i < appointmentList.size(); i++) {
			// If a match is found, it will be deleted.
			if(appointmentList.get(i).getAppointmentID().equals(appointmentID)) {
				appointmentList.remove(i);
				break;
			}
			// If no match is found after reaching the end of the list, it will prompt an error message.
			if(i == appointmentList.size()-1) {
				System.out.println("Appointment ID: " + appointmentID + " does not exist.");
			}
		}
	}

}