package seedu.addressbook.data.person;

/**
 * Represents a Person's Postal code in the address book.
 */

public class PostalCode {
	private int postal_;
	
	public PostalCode(){}
	
	public PostalCode(int postal){
		postal_ = postal;
	}
	
	public int getPostal(){
		return postal_;
	}
	
	public void setPostal(int postal){
		postal_ = postal;
	}
}
