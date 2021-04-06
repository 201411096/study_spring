package b;

/*
 * java - builder pattern
 */

public class Main {
	public static void main(String[] args) {
		Computer computer = ComputerBuilder
							.start()
							.setCpu("i7")
							.setRam("8g")
//							.setStorage("256g")
							.build();
		
		System.out.println(computer);
	}
}
