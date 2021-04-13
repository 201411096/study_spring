package a.sam;

import a.abst.BikeFactory;
import a.abst.Body;
import a.abst.Wheel;

public class SamFactory implements BikeFactory{

	@Override
	public Body createBody() {
		
		return new SamBody();
	}

	@Override
	public Wheel createWheel() {
		return new SamWheel();
	}
	
}
