import java.util.Scanner;

import abst.IBeverage;
import concrete.base.Base;
import concrete.base.Espresso;
import concrete.base.Milk;

/*
 * Component			: 실질적인 인스턴스를 컨트롤하는 역할																			| ex) IBeverage
 * ConcreteComponent	: Component의 실질적인 인스턴스의 부분이며, 책임의 주체의 역할		(Component를 implements(realization))		| ex) Base
 * Decorator			: Component와 Concrete Decorator를 동일시 하도록 해주는 역할	(Component를 implements(equating))			| ex) AbstAdding
 * ConcreteDecorator	: 실질적인 장식 인스턴스 및 정의이며 추가된 책임의 주체 부분			(Decorator를 implements(generalization))		| ex) Espresso, Milk
 */

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		IBeverage beverage = new Base();
		boolean done = false;
		while(!done) {
			System.out.println("현재 음료 가격 : " + beverage.getTotalPrice());
			System.out.println("선택 : 1:샷 추가 / 2:우유 추가");
			switch(sc.nextInt()) {
			case 0: 
				done = true;
				break;
			case 1:
				beverage = new Espresso(beverage);
				break;
			case 2:
				beverage = new Milk(beverage);
				break;
			}
		}
		System.out.println("음료 가격 : " + beverage.getTotalPrice());
		sc.close();
	}
}
