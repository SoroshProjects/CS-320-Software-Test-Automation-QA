//Author Name: Sorosh Khalili

//Date: 04/10/2022

//Course ID: CS-320-T4514
 

package module6;

import java.util.concurrent.atomic.AtomicLong;

// Contact class to create and store contact.
public class Contact {
	private final String uniqueContactID;
	private String givenName;
	private String surName;
	private String phoneNumber;
	private String physicalAddress;
	private static AtomicLong uniqueID = new AtomicLong();

	// Contact class Constructor
	public Contact(String givenName, String surName, String phoneNumber, String physicalAddress)  {

		// Generate a unique ID and set its appropriate variable.
		this.uniqueContactID = String.valueOf(uniqueID.getAndIncrement());

		// The null or blank first name will be set to "NULL".
		if (givenName == null || givenName.isBlank()) {
			this.givenName = "NULL";
		} 
		// It shortens longer than 10 characters' first names to the first 10 characters.
		else if(givenName.length() > 10) {
			this.givenName = givenName.substring(0,10);
		} 
		else {
			this.givenName = givenName;
		}

		// The null or blank last name will be set to "NULL".
		if (surName == null || surName.isBlank()) {
			this.surName = "NULL";
		}
		// It shortens longer than 10 characters' last names to the first 10 characters.
		else if(surName.length() > 10) {
			this.surName = surName.substring(0,10);
		} 
		else {
			this.surName = surName;
		}
	
		// The null, blank, or longer than 10 digits phone numbers will be set to "0123456789".
		if (phoneNumber == null || phoneNumber.isBlank() || phoneNumber.length() != 10) {
			this.phoneNumber = "0123456789";
		} 
		else {
			this.phoneNumber = phoneNumber;
		}
	
		// The null or blank address will be set to "NULL".
		if (physicalAddress == null || physicalAddress.isBlank()) {
			this.physicalAddress = "NULL";
		}
		// It shortens longer than 30 characters' addresses to the first 30 characters.
		else if(physicalAddress.length() > 30) {
			this.physicalAddress = physicalAddress.substring(0,30);
		} 
		else {
			this.physicalAddress = physicalAddress;
		}
	}

	//	Getters
	public String getUniqueContactID() {
		return uniqueContactID;
	}

	public String getGivenName() {
		return givenName;
	}

	public String getSurName() {
		return surName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getPhysicalAddress() {
		return physicalAddress;
	}

	
	// Setters
	public void setGivenName(String givenName) {
		if (givenName == null || givenName.isBlank()) {
			this.givenName = "NULL";
		} 
		else if(givenName.length() > 10) {
			this.givenName = givenName.substring(0,10);
		} 
		else {
			this.givenName = givenName;
		}
	}

	public void setSurName(String surName) {
		if (surName == null || surName.isBlank()) {
			this.surName = "NULL";
		} 
		else if(surName.length() > 10) {
			this.surName = surName.substring(0,10);
		} 
		else {
			this.surName = surName;
		}
	}

	public void setPhoneNumber(String phoneNumber) {
		if (phoneNumber == null || phoneNumber.isBlank() || phoneNumber.length() != 10) {
			this.phoneNumber = "0123456789";
		} 
		else {
			this.phoneNumber = phoneNumber;
		}
	}

	public void setPhysicalAddress(String physicalAddress) {
		if (physicalAddress == null || physicalAddress.isBlank()) {
			this.physicalAddress = "NULL";
		} 
		else if(physicalAddress.length() > 30) {
			this.physicalAddress = physicalAddress.substring(0,30);
		} 
		else {
			this.physicalAddress = physicalAddress;
		}
	}
}