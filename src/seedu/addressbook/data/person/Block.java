package seedu.addressbook.data.person;

/**
 * Represents a Person's Block number in the address book.
 */

public class Block {
	private String blockNumber_;
	
	public Block(){}
	
	public String getBlockNumber(){
		return blockNumber_;
	}
	
	public void setBlockNumber(String blockNumber){
		blockNumber_ = blockNumber;
	}
	
	@Override
	public boolean equals(Object other){
		return other == this
				|| (other instanceof Block // instanceof handles nulls
		        && this.blockNumber_.equals(((Block) other).blockNumber_));
	}	
}