//Author Name: Sorosh Khalili

//Date: 04/10/2022

//Course ID: CS-320-T4514


package test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Date;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

import module6.Appointment;
import module6.AppointmentService;

import org.junit.jupiter.api.Order;

	@TestMethodOrder(OrderAnnotation.class)
	public class AppointmentServiceTest {

		@Test
		@DisplayName("Test to ensure that service can add an appointment.")
		@Order(1)
		void testAddAppointment() {
			AppointmentService service = new AppointmentService();
			service.addAppointment(new Date(), "This is the New Appointment Description");
			//service.displayAppointmentList();
			assertNotNull(service.getAppointment("0"), "New appointment was not added correctly.");
		}
	
		@Test
		@DisplayName("Test to ensure that service correctly deletes an appointment.")
		@Order(3)
		void testDeleteAppointment() {
			AppointmentService service = new AppointmentService();
			service.addAppointment(new Date(), "This is the New Appointment Description");
			service.deleteAppointment("2");
			ArrayList<Appointment> appointmentListEmpty = new ArrayList<Appointment>();
			//service.displayAppointmentList();
			assertEquals(service.appointmentList, appointmentListEmpty, "The task was not deleted.");
		}

	}