package b;

public class Armor implements Defense{

	private Defense nextDefense;
	private int def;
	
	public Armor() {
		// TODO Auto-generated constructor stub
	}
	
	public Armor(int def) {
		this.def = def;
	}
	
	@Override
	public void defense(Attack attack) {
		
		//point1
		
		process(attack);
		
		if(nextDefense!=null) {
			nextDefense.defense(attack);
		}
	}
	
	private void process(Attack attack) {
		int amount = attack.getAmount();
		amount -= def;
		attack.setAmount(amount);		
	}
	
	public void setNextDefense(Defense nextDefense) {
		this.nextDefense = nextDefense;
	}

	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}
	
}
