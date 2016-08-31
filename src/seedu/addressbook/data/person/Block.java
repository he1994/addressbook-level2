package seedu.addressbook.data.person;

/**
 * Represents a Person's Block number in the address book.
 */

public class Block {
	private int blockNumber_;
	
	public Block(){}
	
	public Block(int blockNumber){
		blockNumber_ = blockNumber;
	}
	
	public int getBlockNumber(){
		return blockNumber_;
	}
	
	public void setBlockNumber(int blockNumber){
		blockNumber_ = blockNumber;
	}
}