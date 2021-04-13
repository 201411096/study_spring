package b.mac;

import b.abst.Button;
import b.abst.GuiFactory;
import b.abst.TextArea;

public class MacGuiFactory implements GuiFactory{

	@Override
	public Button createButton() {
		return new MacButton();
	}

	@Override
	public TextArea createTextArea() {
		return new MacTextArea();
	}

}
