package system;

// default class -> 다른 패키지에서 접근이 안됨
class HelpSystem01 {

	public HelpSystem01() {
		System.out.println("Call Constructor : " + getClass().getName());
	}
	
	public void process() {
		System.out.println("Call Process : " + getClass().getSimpleName());
	}
}
