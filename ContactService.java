import java.util.ArrayList;

public class ContactService {
	
	private static ArrayList<Contact> contactList = new ArrayList<Contact>();
	
	//ContactService(){	
	//}
	
	//public static void add(String newContactID, String newFirstName, String newLastName, String newPhoneNumber, String newHomeAddress) {
	      //Contact newContact = new Contact(newContactID, newFirstName, newLastName, newPhoneNumber, newHomeAddress);
	      //contactList.add(newContact);
	   //}
	
	//public static void InitializeContactList() {
	//Contact initContact = new Contact("1234567890", "Joseph", "Mead", "1234567890","123 West Street, La Salle IL");
	//contactList.add(initContact);
	//}
	
	public static void addContact(String newContactID, String newFirstName, String newLastName, String newPhoneNumber, String newHomeAddress) {
		boolean contactExists = false;
		for (Contact eachContact: contactList) {
	        	if (eachContact.getContactID().equals(newContactID)) {
	        		contactExists = true;
				break;
	        	}
		}
		if (contactExists == false){
	     		Contact newContact = new Contact(newContactID, newFirstName, newLastName, newPhoneNumber, newHomeAddress);
	    		contactList.add(newContact);
		} else {
			throw new IllegalArgumentException("ContactID already exists");
		}
	}
	
	public static Contact returnContact(String showContactID) {
		for (Contact eachContact: contactList) {
	         if (eachContact.getContactID().equalsIgnoreCase(showContactID)) {
	        	 return eachContact;
	         }
	    }
		return null;
	}
	
	public static void removeContact(String removeContactID) {
		Contact toRemove = null;
		for (Contact eachContact: contactList) {
	         if (eachContact.getContactID().equalsIgnoreCase(removeContactID)) {
	        	 toRemove = eachContact;
	         }
	    }
		if (toRemove != null) {
		contactList.remove(toRemove);
		}
	}
	public static void editFirstName(String theContactID, String editFirstName) {//edit first name using contactID
		boolean contactExists = false;
		for (Contact eachContact: contactList) {
	         if (eachContact.getContactID().equalsIgnoreCase(theContactID)) {
	        	 contactExists = true;
	        	 eachContact.setFirstName(editFirstName);
	         }
		}
	    if (contactExists == false){
	        	 throw new IllegalArgumentException("ContactID doesn't exist");
	    }
	}
	public static void editLastName(String theContactID, String editLastName) {//edit last name using contactID
		boolean contactExists = false;
		for (Contact eachContact: contactList) {
	         if (eachContact.getContactID().equalsIgnoreCase(theContactID)) {
	        	 contactExists = true;
	        	 eachContact.setLastName(editLastName);
	         }
		}
	    if (contactExists == false){
	        	 throw new IllegalArgumentException("ContactID doesn't exist");
	    }
	}
	public static void editPhoneNumber(String theContactID, String editPhoneNumber) {//edit phone number using contactID
		boolean contactExists = false;
		for (Contact eachContact: contactList) {
	         if (eachContact.getContactID().equalsIgnoreCase(theContactID)) {
	        	 contactExists = true;
	        	 eachContact.setPhoneNumber(editPhoneNumber);
	         }
		}
	    if (contactExists == false){
	        	 throw new IllegalArgumentException("ContactID doesn't exist");
	    }
	}
	public static void editHomeAddress(String theContactID, String editHomeAddress) {//edit home address using contactID
		boolean contactExists = false;
		for (Contact eachContact: contactList) {
	         if (eachContact.getContactID().equalsIgnoreCase(theContactID)) {
	        	 contactExists = true;
	        	 eachContact.setHomeAddress(editHomeAddress);
	         }
		}     
	        	
		if(contactExists == false) {
			throw new IllegalArgumentException("ContactID doesn't exist");
	    }
	}
}