//Author Name: Sorosh Khalili

//Date: 04/10/2022

//Course ID: CS-320-T4514


package test;

import module6.Contact;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

	public class ContactTest {

		@Test
		@DisplayName("Contact ID cannot have more than 10 characters")
		void testContactIDWithMoreThanTenCharacters() {
			Contact contact = new Contact("FirstName","LastName","PhoneNumbr","Address");
			if(contact.getUniqueContactID().length() > 10) {
				fail("Contact ID has more than 10 characters.");
			}
		}

		@Test
		@DisplayName("Contact First Name cannot have more than 10 characters")
		void testContactFirstNameWithMoreThanTenCharacters() {
			Contact contact = new Contact("PresetDataPresetData","LastName","PhoneNumbr","Address");
			if(contact.getGivenName().length() > 10) {
				fail("First Name has more than 10 characters.");
			}
		}

		@Test
		@DisplayName("Contact Last Name cannot have more than 10 characters")
		void testContactLastNameWithMoreThanTenCharacters() {
			Contact contact = new Contact("FirstName","PresetDataPresetData","PhoneNumbr","Address");
			if(contact.getSurName().length() > 10) {
				fail("Last Name has more than 10 characters.");
			}
		}

		@Test
		@DisplayName("Contact phone number is exactly 10 characters")
		void testContactNumberWithMoreThanTenCharacters() {
			Contact contact = new Contact("FirstName", "LastName", "01234567890","Address");
			if(contact.getPhoneNumber().length() != 10) {
				fail("Phone number length does not equal 10.");
			}
		}

		@Test
		@DisplayName("Contact address cannot have more than 30 characters")
		void testContactAddressWithMoreThanThirtyCharacters() {
			Contact contact = new Contact("FirstName","LastName","PhoneNumbr","123 this street address is too long"
					+ "123 this street address is too long");
			if(contact.getPhysicalAddress().length() > 30) {
				fail("Address has more than 30 characters.");
			}
		}

		@Test
		@DisplayName("Contact First Name shall not be null")
		void testContactFirstNameNotNull() {
			Contact contact = new Contact(null, "LastName","PhoneNumbr","Address");
			assertNotNull(contact.getGivenName(), "First name was null.");
		}

		@Test
		@DisplayName("Contact Last Name shall not be null")
		void testContactLastNameNotNull() {
			Contact contact = new Contact("FirstName", null,"PhoneNumbr","Address");
			assertNotNull(contact.getSurName(), "Last name was null.");
		}

		@Test
		@DisplayName("Contact Phone Number shall not be null")
		void testContactPhoneNotNull() {
			Contact contact = new Contact("FirstName", "LastName", null,"Address");
			assertNotNull(contact.getPhoneNumber(), "Phone number was null.");
		}

		@Test
		@DisplayName("Contact Address shall not be null")
		void testContactAddressNotNull() {
			Contact contact = new Contact("FirstName", "LastName","PhoneNumbr",null);
			assertNotNull(contact.getPhysicalAddress(), "Address was null.");
		}

	}

