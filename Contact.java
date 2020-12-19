
class Contact {

	private String contactID;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String homeAddress;
	
	public Contact(String contactID, String firstName, String lastName, String phoneNumber, String homeAddress) {
		if(contactID == null || contactID.length()>10) {
			throw new IllegalArgumentException("Invalid Contact ID");
		}
		if(firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("Invalid First Name");
		}
		if(lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Invalid Last Name");
		}
		if(phoneNumber == null || phoneNumber.length() != 10) {
			throw new IllegalArgumentException("Invalid Phone Number");
		}
		if(homeAddress == null || homeAddress.length() > 30) {
			throw new IllegalArgumentException("Invalid Home Address");
		}
		
		this.contactID = contactID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.homeAddress = homeAddress;
	}
	
	public String getContactID() {
		return contactID;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getPhoneNumber(){
		return phoneNumber;
	}
	public String getHomeAddress() {
		return homeAddress;
	}
	public void setFirstName(String newFirstName) {
		if(newFirstName == null || newFirstName.length() > 10) {
			throw new IllegalArgumentException("Invalid First Name");
		} else {
		firstName = newFirstName;
		}
	}
	public void setLastName(String newLastName) {
		if(newLastName == null || newLastName.length() > 10) {
			throw new IllegalArgumentException("Invalid Last Name");
		} else {
		lastName = newLastName;
		}
	}
	public void setPhoneNumber(String newPhoneNumber){
		if(newPhoneNumber == null || newPhoneNumber.length() != 10) {
			throw new IllegalArgumentException("Invalid Phone Number");
		} else {
		phoneNumber = newPhoneNumber;
		}
	}
	public void setHomeAddress(String newHomeAddress) {
		if(newHomeAddress == null || newHomeAddress.length() > 30) {
			throw new IllegalArgumentException("Invalid Home Address");
		} else {
		homeAddress = newHomeAddress;
		}
	}
}
