package a;
import a.abst.BikeFactory;
import a.abst.Body;
import a.abst.Wheel;
import a.gt.GtBikeFactory;
import a.sam.SamFactory;

public class Main {
	public static void main(String[] args) {
//		BikeFactory factory = new SamFactory();
		BikeFactory factory = new GtBikeFactory();
		
		Body body = factory.createBody();
		Wheel wheel = factory.createWheel();
		
		System.out.println(body.getClass());
		System.out.println(wheel.getClass());
	}
}
