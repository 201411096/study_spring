package b;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

public class Main2 {
	public static void main(String[] args) {
		PriorityQueue<Command> queue = new PriorityQueue<Command>();
		
//		queue.add(new StringPrintCommand("A"));
//		queue.add(new StringPrintCommand("AB"));
//		queue.add(new StringPrintCommand("ABC"));
//		queue.add(new StringPrintCommand("ABCD"));
		
		queue.add(new StringPrintCommand("ABCD"));
		queue.add(new StringPrintCommand("ABC"));
		queue.add(new StringPrintCommand("AB"));
		queue.add(new StringPrintCommand("A"));
		
		for (Command command : queue) {
			command.execute();
		}
	}
}
