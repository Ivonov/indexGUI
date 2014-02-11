package Model;

import java.util.ArrayList;

public class MainIndex {
	
	private ArrayList<String> content;
	
	/**
	 * Creates the Arraylist of content TODO misschien toevoegen van zaken!!!!
	 */
	public MainIndex(){
		content = new ArrayList();
	}
	
	/**
	 * Adds content to the Arraylist of content
	 * @param con
	 */
	private void addContent(String con){
		content.add(con);
	}
}
