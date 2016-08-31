package seedu.addressbook.data.person;

/**
 * Represents a Person's Unit number in the address book.
 */

public class Unit {
	private String unitNumber_;
	
	public Unit(){}
	
	public Unit(String unitNumber){
		unitNumber_ = unitNumber;
	}
	
	public String getUnitNumber(){
		return unitNumber_;
	}
	
	public void setUnitNumber(String unitNumber){
		unitNumber_ = unitNumber;
	}
}
