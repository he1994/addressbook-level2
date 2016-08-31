package seedu.addressbook.data.person;

/**
 * Represents a Person's Unit number in the address book.
 */

public class Unit {
	private int unitNumber_;
	
	public Unit(){}
	
	public Unit(int unitNumber){
		unitNumber_ = unitNumber;
	}
	
	public int getUnitNumber(){
		return unitNumber_;
	}
	
	public void setUnitNumber(int unitNumber){
		unitNumber_ = unitNumber;
	}
}
