import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

class ContactServiceTest {
	

	@Test //verifies that contacts can be added
	void testContactService() {
		ContactService.addContact("1234567899", "Joseph", "Mead", "1234567890",
				"123 West Street, La Salle IL");
		assertTrue(ContactService.returnContact("1234567899").getContactID().equals("1234567899"));
		ContactService.removeContact("1234567899");
	}

	@Test
	void testDuplicateIDs() {
		ContactService.addContact("1234567899", "Joseph", "Mead", "1234567890",
				"123 West Street, La Salle IL");
		assertThrows(IllegalArgumentException.class, () -> {ContactService.addContact("1234567899", "Joseph", "Mead", "1234567890", "123 West Street, La Salle IL");});
		ContactService.removeContact("1234567899");
	}

	@Test
	void testRemoveContact() { //verifies that contacts can be removed
		ContactService.addContact("1234567899", "Joseph", "Mead", "1234567890",
				"123 West Street, La Salle IL");
		assertTrue(ContactService.returnContact("1234567899").getContactID().equals("1234567899"));
		ContactService.removeContact("1234567899");
		assertThrows(NullPointerException.class,
	            ()->{
		fail(ContactService.returnContact("1234567899").getContactID());});
	}
	
	@Test //verifies that the first name can be edited
	void testEditFirstName() {
		ContactService.addContact("1234567899", "Joseph", "Mead", "1234567890",
				"123 West Street, La Salle IL");
		ContactService.editFirstName("1234567899", "Frank");
		assertTrue(ContactService.returnContact("1234567899").getFirstName().equals("Frank"));
		ContactService.removeContact("1234567899");
	}
	@Test
	void testFirstNameEditCharactersTooLong() {
		ContactService.addContact("1234567899", "Joseph", "Mead", "1234567890",
				"123 West Street, La Salle IL");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {ContactService.editLastName("1234567899", "First Name is Too Long");}); //this one has too many characters in the first name
		ContactService.removeContact("1234567899");
	}
	
	@Test
	void testFirstNameEditIsNull() {
		ContactService.addContact("1234567899", "Joseph", "Mead", "1234567890",
				"123 West Street, La Salle IL");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {ContactService.editLastName("1234567899", null);}); //the first name in this one is null
		ContactService.removeContact("1234567899");
	}
	@Test //verifies that the last name can be edited
	void testEditLastName() {
		ContactService.addContact("1234567899", "Joseph", "Mead", "1234567890",
				"123 West Street, La Salle IL");
		ContactService.editLastName("1234567899", "Lenihan");
		assertTrue(ContactService.returnContact("1234567899").getLastName().equals("Lenihan"));
		ContactService.removeContact("1234567899");
	}
	@Test
	void testLastNameEditCharactersTooLong() {
		ContactService.addContact("1234567899", "Joseph", "Mead", "1234567890",
				"123 West Street, La Salle IL");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {ContactService.editLastName("1234567899", "Last Name is Too Long");}); //this one has too many characters in the last name
		ContactService.removeContact("1234567899");
	}
	
	@Test
	void testLastNameEditIsNull() {
		ContactService.addContact("1234567899", "Joseph", "Mead", "1234567890",
				"123 West Street, La Salle IL");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {ContactService.editLastName("1234567899", null);}); //the last name in this one is null
		ContactService.removeContact("1234567899");
	}
	@Test //verifies that the phone number can be edited
	void testEditPhoneNmber() {
		ContactService.addContact("1234567899", "Joseph", "Mead", "1234567890",
				"123 West Street, La Salle IL");
		ContactService.editPhoneNumber("1234567899", "0987654321");
		assertTrue(ContactService.returnContact("1234567899").getPhoneNumber().equals("0987654321"));
		ContactService.removeContact("1234567899");
	}
	@Test
	void testPhoneNumberEditCharactersNotTen() {
		ContactService.addContact("1234567899", "Joseph", "Mead", "1234567890",
				"123 West Street, La Salle IL");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {ContactService.editPhoneNumber("1234567899", "098765432");}); //this one doesn't have ten characters in the phone numbers
		ContactService.removeContact("1234567899");
	}
	
	@Test
	void testPhoneNumberEditIsNull() {
		ContactService.addContact("1234567899", "Joseph", "Mead", "1234567890",
				"123 West Street, La Salle IL");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {ContactService.editPhoneNumber("1234567899", null);}); //the phone number in this one is null
		ContactService.removeContact("1234567899");
	}
	@Test //verifies that the home address can be edited
	void testEditHomeAddress() {
		ContactService.addContact("1234567899", "Joseph", "Mead", "1234567890",
				"123 West Street, La Salle IL");
		ContactService.editHomeAddress("1234567899", "321 North Street, Utica IL");
		assertTrue(ContactService.returnContact("1234567899").getHomeAddress().equals("321 North Street, Utica IL"));
		ContactService.removeContact("1234567899");
	}
	@Test
	void testHomeAddressEditCharactersTooLong() {
		ContactService.addContact("1234567899", "Joseph", "Mead", "1234567890",
				"123 West Street, La Salle IL");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {ContactService.editHomeAddress("1234567899", "A home address that is longer than thirty characters");}); //this one has more than ten characters in the Home Address
		ContactService.removeContact("1234567899");
	}
	
	@Test
	void testHomeAddressEditIsNull() {
		ContactService.addContact("1234567899", "Joseph", "Mead", "1234567890",
				"123 West Street, La Salle IL");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {ContactService.editHomeAddress("1234567899", null);}); //the Home Address in this one is null
		ContactService.removeContact("1234567899");
	}

}
