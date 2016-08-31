package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

/**
 * Represents a Person's address in the address book.
 * Guarantees: immutable; is valid as declared in {@link #isValidAddress(String)}
 */
public class Address {

    public static final String EXAMPLE = "123, some street";
    public static final String MESSAGE_ADDRESS_CONSTRAINTS = "Person addresses can be in any format";
    public static final String ADDRESS_VALIDATION_REGEX = ".+";
    public static final String ADDRESS_FIELDS_SEPARATOR = ", ";

    private Block blockNumber = new Block();
    private Street streetName = new Street();
    private Unit unitNumber = new Unit();
    private PostalCode postal = new PostalCode();
    private boolean isPrivate;
    private String[] addressComponents;

    /**
     * Validates given address.
     *
     * @throws IllegalValueException if given address string is invalid.
     */
    public Address(String address, boolean isPrivate) throws IllegalValueException {
        this.isPrivate = isPrivate;
        if (!isValidAddress(address)) {
            throw new IllegalValueException(MESSAGE_ADDRESS_CONSTRAINTS);
        }
        setAddressFields(address);
    }

    /**
     * Split the address into various fields
     */
	private void setAddressFields(String address) {
		addressComponents = address.split(",",-1);
        blockNumber.setBlockNumber(addressComponents[0].trim());
        streetName.setStreetName(addressComponents[1].trim());
        unitNumber.setUnitNumber(addressComponents[2].trim());
        postal.setPostal(addressComponents[3].trim());
	}

    /**
     * Returns true if a given string is a valid person email.
     */
    public static boolean isValidAddress(String test) {
        return test.matches(ADDRESS_VALIDATION_REGEX);
    }

    @Override
    public String toString() {
        return this.blockNumber.getBlockNumber() + ADDRESS_FIELDS_SEPARATOR
        		+ this.streetName.getStreetName() + ADDRESS_FIELDS_SEPARATOR
        		+ this.unitNumber.getUnitNumber() + ADDRESS_FIELDS_SEPARATOR
        		+ this.postal.getPostal();
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Address // instanceof handles nulls
                && this.blockNumber.equals(((Address) other).blockNumber)
                && this.streetName.equals(((Address) other).streetName)
                && this.unitNumber.equals(((Address) other).unitNumber)
                && this.postal.equals(((Address) other).postal)); // state check
    }

    @Override
    public int hashCode() {
        return this.toString().hashCode();
    }

    public boolean isPrivate() {
        return isPrivate;
    }
}