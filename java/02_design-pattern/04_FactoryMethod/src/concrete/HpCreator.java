package concrete;

import framework.Item;
import framework.ItemCreator;

public class HpCreator extends ItemCreator{
	
	@Override
	protected void requestItemsInfo() {
		System.out.println("get hp potion info ...");
	}
	
	@Override
	protected void createItemLog() {
		System.out.println("create hp potion ...");
	}
	
	@Override
	protected Item createItem() {
		return new HpPotion();
	}

}
