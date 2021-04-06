package a;

public class ComputerFactory {
	
	private BluePrint print;
	
	public void setBlueprint(BluePrint print) {
		this.print = print;
	}
	
	public void make() {
		print.setCpu();
		print.setRam();
		print.setStorage();
	}
	
	public Computer getComputer() {
		return print.getComputer();
	}
}
