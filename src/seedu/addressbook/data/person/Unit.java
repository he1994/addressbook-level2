package seedu.addressbook.data.person;

/**
 * Represents a Person's Unit number in the address book.
 */

public class Unit {
	private String unitNumber_;
	
	public Unit(){}
	
	public String getUnitNumber(){
		return unitNumber_;
	}
	
	public void setUnitNumber(String unitNumber){
		unitNumber_ = unitNumber;
	}
	
	@Override
	public boolean equals(Object other){
		return other == this
				|| (other instanceof Unit // instanceof handles nulls
		        && this.unitNumber_.equals(((Unit) other).unitNumber_));
	}
}
