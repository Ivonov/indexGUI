package TestPack;

import View.MainGUI;
import Controler.RunControler;

public class MainGUITest {

	public static void main(String[] args) {
		MainGUI main = new MainGUI();
		RunControler actions = new RunControler(main);
	}

}
