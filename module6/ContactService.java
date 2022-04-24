//Author Name: Sorosh Khalili

//Date: 04/10/2022

//Course ID: CS-320-T4514


package module6;

import java.util.ArrayList;

public class ContactService {

	// ArrayList of contact to hold the list of contacts.
	public ArrayList<Contact> contactList = new ArrayList<Contact>();

/*
	// Display the full list of contacts.
	public void displayContactList() {
		for(int i = 0; i < contactList.size(); i++) {
			System.out.println("\t Contact ID: " + contactList.get(i).getUniqueContactID());
			System.out.println("\t First Name: " + contactList.get(i).getGivenName());
			System.out.println("\t Last Name: " + contactList.get(i).getSurName());
			System.out.println("\t Phone Number: " + contactList.get(i).getPhoneNumber());
			System.out.println("\t Address: " + contactList.get(i).getPhysicalAddress() + "\n");
		}
	}
*/
	// Creates a new contact and adds it to the list.
	public void addContact(String givenName, String surName, String phoneNumber, String physicalAddress) {
		
		// Create a new contact.
		Contact contact = new Contact(givenName, surName, phoneNumber, physicalAddress);
		// Adds a new contact to the array list.
		contactList.add(contact);
	}

	// Using Contact ID, return a contact object.
	public Contact getContact(String uniqueContactID) {
		
		// Creates a new contact object with default values.
		Contact contact = new Contact(null,null,null,null);
		for(int i = 0; i < contactList.size(); i++) {
			// If a match is found, replace the new contact object with default values with it.
			if(contactList.get(i).getUniqueContactID().contentEquals(uniqueContactID)) {
				contact = contactList.get(i);
			}
		}
		return contact;
	}

	// Delete contact.
	public void deleteContact(String uniqueContactID) {
		for(int i = 0; i < contactList.size(); i++) {
			// If a match is found, it will be deleted.
			if(contactList.get(i).getUniqueContactID().equals(uniqueContactID)) {
				contactList.remove(i);
				break;
			}
			// If no match is found after reaching the end of the list, it will prompt an error message.
			if(i == contactList.size()-1) {
				System.out.println("Contact ID: " + uniqueContactID + " does not exist.");
			}
		}
	}

	// Update the first name.
	public void updateGivenName(String newGivenName, String uniqueContactID) {
		for(int i = 0; i < contactList.size(); i++) {
			// If a match is found, its first name will be updated.
			if(contactList.get(i).getUniqueContactID().equals(uniqueContactID)) {
				contactList.get(i).setGivenName(newGivenName);
				break;
			}
			// If no match is found after reaching the end of the list, it will prompt an error message.
			if(i == contactList.size()-1) {
				System.out.println("Contact ID: " + uniqueContactID + " does not exist.");
			}
		}
	}

	// Update the last name.
	public void updateSurName(String newSurName, String uniqueContactID) {
		for(int i = 0; i < contactList.size(); i++) {
			// If a match is found, its last name will be updated.
			if(contactList.get(i).getUniqueContactID().equals(uniqueContactID)) {
				contactList.get(i).setSurName(newSurName);
				break;
			}
			// If no match is found after reaching the end of the list, it will prompt an error message.
			if(i == contactList.size()-1) {
				System.out.println("Contact ID: " + uniqueContactID + " does not exist.");
			}
		}
	}

	// Update the phone number.
	public void updatePhoneNumber(String newPhoneNumber, String uniqueContactID) {
		for(int i = 0; i < contactList.size(); i++) {
			// If a match is found, its phone number will be updated.
			if(contactList.get(i).getUniqueContactID().equals(uniqueContactID)) {
				contactList.get(i).setPhoneNumber(newPhoneNumber);
				break;
			}
			// If no match is found after reaching the end of the list, it will prompt an error message.
			if(i == contactList.size()-1) {
				System.out.println("Contact ID: " + uniqueContactID + " does not exist.");
			}
		}
	}

	// Update the address.
	public void updatePhysicalAddress(String newPhysicalAddress, String uniqueContactID) {
		for(int i = 0; i < contactList.size(); i++) {
			// If a match is found, its address will be updated.
			if(contactList.get(i).getUniqueContactID().equals(uniqueContactID)) {
				contactList.get(i).setPhysicalAddress(newPhysicalAddress);
				break;
			}
			// If no match is found after reaching the end of the list, it will prompt an error message.
			if(i == contactList.size()-1) {
				System.out.println("Contact ID: " + uniqueContactID + " does not exist.");
			}
		}
	}

}