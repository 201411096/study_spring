package b.concrete;

import b.abst.GuiFactory;
import b.linux.LinuxGuiFactory;
import b.mac.MacGuiFactory;
import b.win.WinGuiFactory;

public class FactoryInstance {
	public static GuiFactory getGuiFactory() {
		
		switch(getOsCode()) {
		case 0: return new MacGuiFactory();
		case 1: return new LinuxGuiFactory();
		case 2: return new WinGuiFactory();
		}
		return null;
	}
	
	private static int getOsCode() {
		String osName = System.getProperty("os.name").toLowerCase(); 
		if(osName.contains("mac")) {
			return 0;
		}else if(osName.contains("linux")) {
			return 1;
		}else if(osName.contains("win")) {
			return 2;
		}else {
			return 3;
		}
	}
}
