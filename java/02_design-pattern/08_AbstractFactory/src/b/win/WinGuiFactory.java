package b.win;

import b.abst.Button;
import b.abst.GuiFactory;
import b.abst.TextArea;

public class WinGuiFactory implements GuiFactory{

	@Override
	public Button createButton() {
		return new WinButton();
	}

	@Override
	public TextArea createTextArea() {
		return new WinTextArea();
	}

}
