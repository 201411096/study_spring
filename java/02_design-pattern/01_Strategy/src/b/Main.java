package b;

/*
 * 1. 인터페이스 개념 이해
 * 2. 델리게이트 개념 이해
 * 3. 전략 패턴 개념 이해
 */

public class Main {
	public static void main(String[] args) {
		Character character = new Character();
		
		character.attack();
		
		character.setWeapon(new Knife());
		character.attack();

		character.setWeapon(new Sword());
		character.attack();
		
		character.setWeapon(new Ax());
		character.attack();
	}
}
