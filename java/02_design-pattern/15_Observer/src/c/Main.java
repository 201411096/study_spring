package c;

import c.Observable.Observer;

public class Main {
	
	public static void main(String[] args) {
		// 1. generic
		// 2. delegate
		// 3. observable 내부에 observer		
		
		Button button = new Button();
		button.addObserver(new Observer<String>() {
			
			@Override
			public void update(c.Observable<String> o, String arg) {
				System.out.println(o + " is clicked");
			}
		});
		
		button.onClick();
		button.onClick();
		button.onClick();
	}
}
