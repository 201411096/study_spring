package concrete;

import framework.Item;
import framework.ItemCreator;

public class MpCreator extends ItemCreator{
	
	@Override
	protected void requestItemsInfo() {
		System.out.println("get mp potion info ...");
	}
	
	@Override
	protected void createItemLog() {
		System.out.println("create mp potion ...");
	}
	
	@Override
	protected Item createItem() {
		return new MpPotion();
	}

}
