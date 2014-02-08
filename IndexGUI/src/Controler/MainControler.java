package Controler;
//test voor desktop

import View.MainGUI;

public abstract class MainControler {
	protected MainGUI gui;
	
	public MainControler(MainGUI gui) {
		this.gui=gui;
	}
}
