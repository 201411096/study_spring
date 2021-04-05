
public class AdapterImpl implements Adapter{
	
//	Math math;
	
	@Override
	public Float halfOf(Float f) {
//		return (float)Math.twoTime(f.doubleValue());
		return Math.doubled(f.doubleValue()).floatValue();
	}
	
	@Override
	public Float twiceOf(Float f) {
		System.out.println("method(twiceOf) ...");
		return (float)Math.half(f.doubleValue());
	}
}
