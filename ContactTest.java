
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContactTest {

	@Test
	void testContact() {
		Contact contactClass = new Contact("1234567890", "Joseph", "Mead", "1234567890",
				"123 West Street, La Salle IL");
		assertTrue(contactClass.getContactID().equals("1234567890"));
		assertTrue(contactClass.getFirstName().equals("Joseph"));
		assertTrue(contactClass.getLastName().equals("Mead"));
		assertTrue(contactClass.getPhoneNumber().equals("1234567890"));
		assertTrue(contactClass.getHomeAddress().equals("123 West Street, La Salle IL"));
	}

	@Test
	void testContactIDTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {new Contact("12345678900", "Joseph", "Mead", "1234567890",
				"123 West Street, La Salle IL");}); //this one has too many characters in the contact ID
	}
	
	@Test
	void testContactIDIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {new Contact(null, "Joseph", "Mead", "1234567890",
				"123 West Street, La Salle IL");}); //the Contact ID in this one is null
	}
	
	@Test
	void testFirstNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {new Contact("1234567890", "Lord Joseph the Svedstrom", "Mead", "1234567890",
				"123 West Street, La Salle IL");}); //this one has too many characters in the first name
	}
	
	@Test
	void testFirstNameIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {new Contact("1234567890", null, "Mead", "1234567890",
				"123 West Street, La Salle IL");}); //the first name in this one is null
	}
	
	@Test
	void testLastNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {new Contact("1234567890", "Joseph", "Svedstrom Mead", "1234567890",
				"123 West Street, La Salle IL");}); //this one has too many characters in the last name
	}
	
	@Test
	void testLastNameIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {new Contact("1234567890", "Joseph", null, "1234567890",
				"123 West Street, La Salle IL");}); //the last name in this one is null
	}
	
	@Test
	void testPhoneNumberCharactersNotTen() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {new Contact("1234567890", "Joseph", "Mead", "123",
				"123 West Street, La Salle IL");}); //this one doesn't have ten characters in the phone numbers
	}
	
	@Test
	void testPhoneNumberIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {new Contact("1234567890", "Joseph", "Mead", null,
				"123 West Street, La Salle IL");}); //the phone number in this one is null
	}
	
	@Test
	void testAddressTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {new Contact("1234567890", "Joseph", "Mead", "1234567890",
				"123 West Street, La Salle IL (at the top of the hill)");}); //this one doesn't have ten characters in the phone numbers
	}
	
	@Test
	void testAddressrIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {new Contact("1234567890", "Joseph", "Mead", "1234567890",
				null);}); //the phone number in this one is null
	}
}
