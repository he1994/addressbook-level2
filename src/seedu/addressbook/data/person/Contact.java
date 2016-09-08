package seedu.addressbook.data.person;

/**
 * 
 * Stores the details of the contacts 
 *
 */
public class Contact {

    public String value;
    protected boolean isPrivate;

    public Contact() {
		super();
	}

	@Override
    public String toString() {
	    return value;
	}

	@Override
    public int hashCode() {
	    return value.hashCode();
	}

    public boolean isPrivate() {
	    return isPrivate;
	}

}