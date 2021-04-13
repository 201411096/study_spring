package a.gt;

import a.abst.BikeFactory;
import a.abst.Body;
import a.abst.Wheel;

public class GtBikeFactory implements BikeFactory{

	@Override
	public Body createBody() {
		// TODO Auto-generated method stub
		return new GtBody();
	}

	@Override
	public Wheel createWheel() {
		// TODO Auto-generated method stub
		return new GtWheel();
	}

}
