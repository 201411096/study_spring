package a;

public abstract class Calculator2 {
	private Calculator preCalculator;
	
	public void setNextCalculator(Calculator preCalculator) {
		this.preCalculator = preCalculator;
	}
	
	public boolean process(Request request) {

		if(preCalculator != null) {
			if(preCalculator.process(request))
				return true;
		}
		return operator(request);
	}
	
	abstract protected boolean operator(Request request);
}
