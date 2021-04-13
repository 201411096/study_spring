package b.linux;

import b.abst.Button;
import b.abst.GuiFactory;
import b.abst.TextArea;

public class LinuxGuiFactory implements GuiFactory{

	@Override
	public Button createButton() {
		return new LinuxButton();
	}

	@Override
	public TextArea createTextArea() {
		return new LinuxTextArea();
	}

}
