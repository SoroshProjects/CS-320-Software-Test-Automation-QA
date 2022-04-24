//Author Name: Sorosh Khalili

//Date: 04/10/2022

//Course ID: CS-320-T4514


package test;

import java.util.Date;

import module6.Appointment;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;


class AppointmentTest { 


	@Test
	@DisplayName("The appointment date shall not be null")
	void testDateNull() {
		Appointment appointment = new Appointment(null, "Appointment description");
			assertNotNull(appointment.getAppointmentDate(), "Appointment date was null.");
	}
	
	@Test
	@DisplayName("The appointment date cannot be in the past")
	void testAppointentDateInThePast() throws InterruptedException {
		Date date = new Date();
		//Pause for 1 second to ensure generated date falls in the past.
        Thread.sleep(1000);
        Appointment appointment = new Appointment(date, "Appointment description");
        if(appointment.getAppointmentDate().before(new Date())) {
			fail("The appointment date cannot be in the past.");
		};
	}
	
	@Test
	@DisplayName("Appointment description shall not be null")
	void testAppointmentDescriptionNotNull() {
		Date date = new Date();
		Appointment appointment = new Appointment(date, null);
		assertNotNull(appointment.getDescription(), "Appointment description was null.");
	}

	@Test
	@DisplayName("Appointment description cannot have more than 50 characters")
	void testAppointmentDescriptionWithMoreThanFiftyCharacters() {
		Date date = new Date();
		Appointment appointment = new Appointment(date, "The description for this appointment is longer than 50 characters");
		if(appointment.getDescription().length() > 50) {
			fail("Appointment description has more than 50 characters.");
		}
	}
}
