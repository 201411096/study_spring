package a;
import java.util.LinkedList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Command> list = new LinkedList<>();
		
		list.add(new Command() {
			@Override
			public void execute() {
				System.out.println("작업 1");
			}
		});
		
		list.add(new Command() {
			@Override
			public void execute() {
				System.out.println("작업 2");
			}
		});
		
		list.add(new Command() {
			@Override
			public void execute() {
				System.out.println("작업 3");
			}
		});
		
		for (Command command : list) {
			command.execute();
		}
	}
}
