package a;

public class AObj {
	
	Ainterface ainterface;
	
	public AObj() {
		ainterface = new Ainterfaceimpl();
	}
	
	public void funcAA() {
//		System.out.println("AAA");
//		System.out.println("AAA");
		
		//delegate
		ainterface.funcA();
		ainterface.funcA();
	}
}
