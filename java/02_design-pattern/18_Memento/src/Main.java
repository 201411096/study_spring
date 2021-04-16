import java.util.Stack;

import abc.Memento;
import abc.Originator;

public class Main {
	public static void main(String[] args) {
		Stack<Memento> mementos = new Stack<>();
		
		Originator originator = new Originator();
		
		originator.setState("state 1");
		mementos.push(originator.createMemento());
		
//		protected 사용 ..
//		Memento memento = new Memento();
//		memento.getState();
		
		originator.setState("state 2");
		mementos.push(originator.createMemento());
		originator.setState("state 3");
		mementos.push(originator.createMemento());
		originator.setState("state final");
		mementos.push(originator.createMemento());
		
		originator.restoreMemento(mementos.pop());
		System.out.println(originator.getState()); // state final
		originator.restoreMemento(mementos.pop());
		System.out.println(originator.getState()); // state 3
		originator.restoreMemento(mementos.pop());
		System.out.println(originator.getState()); // state 2
		originator.restoreMemento(mementos.pop());
		System.out.println(originator.getState()); // state 1
	}
}
