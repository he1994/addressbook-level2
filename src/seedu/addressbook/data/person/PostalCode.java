package seedu.addressbook.data.person;

/**
 * Represents a Person's Postal code in the address book.
 */

public class PostalCode {
	private String postal_;
	
	public PostalCode(){}
	
	public String getPostal(){
		return postal_;
	}
	
	public void setPostal(String postal){
		postal_ = postal;
	}
	
	@Override
	public boolean equals(Object other){
		return other == this
				|| (other instanceof PostalCode // instanceof handles nulls
		        && this.postal_.equals(((PostalCode) other).postal_));
	}
}