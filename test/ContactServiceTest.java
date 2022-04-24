//Author Name: Sorosh Khalili

//Date: 04/10/2022

//Course ID: CS-320-T4514


package test;

import module6.Contact;
import module6.ContactService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;

	@TestMethodOrder(OrderAnnotation.class)
	public class ContactServiceTest {

		@Test
		@DisplayName("Test to Update First Name.")
		@Order(1)
		void testUpdateFirstName() {
			ContactService service = new ContactService();
			service.addContact("James", "Bond", "0123456789", "123 Dream Big Lane");
			service.updateGivenName("Jacob", "0");
			//service.displayContactList();
			assertEquals("Jacob",service.getContact("0").getGivenName(), "First name was not updated.");
		}

		@Test
		@DisplayName("Test to Update Last Name.")
		@Order(2)
		void testUpdateLastName() {
			ContactService service = new ContactService();
			service.addContact("James", "Bond", "0123456789", "123 Dream Big Lane");
			service.updateSurName("Matthew", "2");
			//service.displayContactList();
			assertEquals("Matthew",service.getContact("2").getSurName(), "Last name was not updated.");
		}

		@Test
		@DisplayName("Test to update phone number.")
		@Order(3)
		void testUpdatePhoneNumber() {
			ContactService service = new ContactService();
			service.addContact("James", "Bond", "0123456789", "123 Dream Big Lane");
			service.updatePhoneNumber("7894567890", "4");
			//service.displayContactList();
			assertEquals("7894567890",service.getContact("4").getPhoneNumber(), "Phone number was not updated.");
		}

		@Test
		@DisplayName("Test to update address.")
		@Order(4)
		void testUpdateAddress() {
			ContactService service = new ContactService();
			service.addContact("James", "Bond", "0123456789", "123 Dream Big Lane");
			service.updatePhysicalAddress("456 Blue Sky Street", "6");
			//service.displayContactList();
			assertEquals("456 Blue Sky Street",service.getContact("6").getPhysicalAddress(), "Address was not updated.");
		}

		@Test
		@DisplayName("Test to ensure that service correctly deletes contacts.")
		@Order(5)
		void testDeleteContact() {
			ContactService service = new ContactService();
			service.addContact("James", "Bond", "0123456789", "123 Dream Big Lane");
			service.deleteContact("8");
			ArrayList<Contact> contactListEmpty = new ArrayList<Contact>();
			//service.displayContactList();
			assertEquals(service.contactList, contactListEmpty, "The contact was not deleted.");
		}

		@Test
		@DisplayName("Test to ensure that service can add a contact.")
		@Order(6)
		void testAddContact() {
			ContactService service = new ContactService();
			service.addContact("James", "Bond", "0123456789", "123 Dream Big Lane");
			//service.displayContactList();
			assertNotNull(service.getContact("9"), "Contact was not added correctly.");
		}

	}