package b;



import b.abst.Button;
import b.abst.GuiFactory;
import b.abst.TextArea;
import b.concrete.FactoryInstance;
import b.linux.LinuxGuiFactory;
import b.mac.MacGuiFactory;
import b.win.WinGuiFactory;

public class Main {
	public static void main(String[] args) {
//		GuiFactory factory = new LinuxGuiFactory();
//		GuiFactory factory = new MacGuiFactory();
//		GuiFactory factory = new WinGuiFactory();
		
		GuiFactory factory = FactoryInstance.getGuiFactory();
		Button button = factory.createButton();
		TextArea area = factory.createTextArea();
		
		button.click();
		System.out.println(area.getText());
	}
}
