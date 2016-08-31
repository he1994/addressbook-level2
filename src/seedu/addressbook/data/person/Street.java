package seedu.addressbook.data.person;

/**
 * Represents a Person's Street name in the address book.
 */

public class Street {
	private String streetName_;
	
	public Street(String streetName){
		streetName_ = streetName;
	}
	
	public String getStreetName(){
		return streetName_;
	}
	
	public void setStreetName(String streetName){
		streetName_ = streetName;
	}
}
