package concrete.base;

import abst.AbstAdding;
import abst.IBeverage;

public class Milk extends AbstAdding{

	public Milk(IBeverage material) {
		super(material);
	}

	@Override
	public int getTotalPrice() {
		return super.getTotalPrice()+50;
	}	
}
