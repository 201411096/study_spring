package b.linux;

import b.abst.Button;

public class LinuxButton implements Button{

	@Override
	public void click() {
		System.out.println("linux button ..");
	}

}
