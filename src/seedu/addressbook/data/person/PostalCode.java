package seedu.addressbook.data.person;

/**
 * Represents a Person's Postal code in the address book.
 */

public class PostalCode {
	private String postal_;
	
	public PostalCode(){}
	
	public PostalCode(String postal){
		postal_ = postal;
	}
	
	public String getPostal(){
		return postal_;
	}
	
	public void setPostal(String postal){
		postal_ = postal;
	}
}
