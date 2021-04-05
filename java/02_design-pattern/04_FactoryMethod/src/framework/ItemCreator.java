package framework;

public abstract class ItemCreator {

	// template method pattern
	public Item create() {
		Item item;
		
		//step 1
		requestItemsInfo();
		//step 2
		item = createItem();
		//step 3
		createItemLog();
		
		return item;
	}
	
	abstract protected void requestItemsInfo();
	abstract protected void createItemLog();
	abstract protected Item createItem();
}
