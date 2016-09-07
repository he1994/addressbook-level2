package seedu.addressbook.data.tag;

import seedu.addressbook.data.person.Person;

/**
 * Represents an addition or deletion of a tag in the address book
 */
public class Tagging {
	private Person personInvolved;
	private Tag tagInvolved;
	private String action;

	public Tagging(Person personInvolved, Tag tagInvolved, String action){
		this.personInvolved = personInvolved;
		this.tagInvolved = tagInvolved;
		this.action = action;
	}
	
	@Override
	public String toString(){
		return action + " " + personInvolved.getName().toString() + " " + tagInvolved.toString();
	}
}
