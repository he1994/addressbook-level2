package seedu.addressbook.data.person;

/**
 * Represents a Person's Block number in the address book.
 */

public class Block {
	private String blockNumber_;
	
	public Block(){}
	
	public Block(String blockNumber){
		blockNumber_ = blockNumber;
	}
	
	public String getBlockNumber(){
		return blockNumber_;
	}
	
	public void setBlockNumber(String blockNumber){
		blockNumber_ = blockNumber;
	}
}