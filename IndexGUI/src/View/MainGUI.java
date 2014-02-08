package View;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class MainGUI {
	private JFrame mainFrame;
	private JMenuBar mainMenuBar;
	
	/**
	 * Paints the GUI part of things
	 */
	public MainGUI(){
		mainFrame = new JFrame("Ivonov was here");
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.pack();
	
		mainMenuBar = new JMenuBar();
		
		configMenus();
		
		mainFrame.setJMenuBar(mainMenuBar);
		mainFrame.add(configTabbladen());
		mainFrame.setVisible(true);
	}
	
	private void configMenus(){
		JMenu indexGUI = new JMenu("IndexGUI");
		mainMenuBar.add(indexGUI);
		//indexGUI menu opties
		JMenuItem about = new JMenuItem("About IndexGUI");
		indexGUI.add(about);
		JMenuItem quit = new JMenuItem("Quit IndexGUI");
		indexGUI.add(quit);
		
		//TODO methode in package controler 
		/*
		 * --Hier een voorbeeld, misschien is er een betere oplossing?
		 * public void addActionlistener(JMenuItem item);
		 * 	item.addActionListener(new ActionListener(){
		 * 		@Override
		 * 		public void actionPerformed(ActionEvent e){
		 * 			//omited
		 * 		}
		 * });
		 * 
		 * verder dit allemaal toevoegen aan al de andere menus
		 */
		
		JMenu file = new JMenu("File");
		mainMenuBar.add(file);
		JMenu help = new JMenu("Help");
		mainMenuBar.add(help);
	}
	private JTabbedPane configTabbladen(){
		//TODO Het toevoegen van actionListeners() bij elke tab
		/*
		 * en probeer te bedenken wat voor views er moeten komen
		 */
		JTabbedPane mainTabs = new JTabbedPane();
		JPanel view1 = new JPanel();
		mainTabs.addTab("View 1", view1);
		JPanel view2 = new JPanel();
		mainTabs.addTab("View 2", view2);
		return mainTabs;
	}
	/*
	 * 		TODO het aanmaken van een GIT repository
	 *  	
	 * 		VERDERE PUNTEN:
	 * -	Probeer te bedenken wat voor informatie verwerkt moet worden.
	 * 
	 * -	Sorteer functie moet toegevoegd worden in de model en controler.
	 * 
	 * -	Mensen vragen naar ideeen.
	 * 
	 * -	Onderzoek hoe je text in de panel de text print.
	 * 
	 * -	ect ............... xD
	 */
}
