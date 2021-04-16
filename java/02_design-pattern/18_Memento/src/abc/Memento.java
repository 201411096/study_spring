package abc;

public class Memento {
	
	String state;
	
	// protected ...
	protected Memento(String state) {
		this.state = state;
	}
	
	protected String getState() {
		return this.state;
	}
}
