package b;

public class Character {
	
	// 추상적인 접근점
	private Weapon weapon;
	
	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
	
	public void attack() {
		
		if(weapon == null) {
			System.out.println("attack ...");
		}else {
			//delegate
			weapon.attack();	
		}
	}
}
