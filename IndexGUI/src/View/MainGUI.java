package View;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;

import Model.Film;

public class MainGUI {
	private JFrame mainFrame;
	private JMenuBar mainMenuBar;
	//IndexGUI menus
	private JMenuItem about;
	private JMenuItem quit;
	//File menus
	private JMenuItem refresh;
	//Tab views
	private JPanel view1;
	private JPanel view2;
	
	//Converts the titles of movies to String
	private String convert = "";
	
	/**
	 * Paints the GUI part of things
	 */
	public MainGUI(){
	}
	
	/**
	 * Greates the frame ect.
	 */
	public void greateFrame(){
		mainFrame = new JFrame("Ivonov was here");
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setSize(800,400);
		//mainFrame.pack();
	
		mainMenuBar = new JMenuBar();
		
		configMenus();
		
		mainFrame.setJMenuBar(mainMenuBar);
		mainFrame.add(configTabbladen());
		mainFrame.setVisible(true);
		/*
		 * TODO kleuren aanpassen van de JFrame en de menus ect.
		 */
	}
	
	/**
	 * Greates all the menu and menu items
	 */
	private void configMenus(){
		/*
		 * IndexGIU menu
		 */
		JMenu indexGUI = new JMenu("IndexGUI");
		mainMenuBar.add(indexGUI);
		//About option
		about = new JMenuItem("About IndexGUI");
		indexGUI.add(about);
		
		//Quit option
		quit = new JMenuItem("Quit IndexGUI");
		indexGUI.add(quit);
		
		
		/*
		 * File menu
		 */
		JMenu file = new JMenu("File");
		mainMenuBar.add(file);
		//Refresh option
		refresh = new JMenuItem("Refresh");
		file.add(refresh);
		
		/*
		 * Help menu
		 */
		JMenu help = new JMenu("Help");
		mainMenuBar.add(help);
		
		addMenuActions();
	}
	
	/**
	 * Adds all the ActionListeners to the JMenuItems
	 */
	private void addMenuActions(){
		/*
		 * IndexGUI JMenuItems
		 */
		about.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				JOptionPane.showMessageDialog(null, "About to get down!");
			}
		});
		quit.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				JOptionPane.showMessageDialog(null, "Quit it already!");
			}
		});
		
		/*
		 * File JMenuItems
		 */
		refresh.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				//JOptionPane.showMessageDialog(null, "Refresh that f**king thing!");
			}
		});
		
	}
	
	/**
	 * Greates all the tabs and returns a JTabbedPane to the constructor
	 * @return mainTabs this is the JTabbedPane
	 */
	private JTabbedPane configTabbladen(){
		JTabbedPane mainTabs = new JTabbedPane();
		JLabel label1 = new JLabel(convert);
		//View 1
		view1 = new JPanel();
		mainTabs.addTab("Films", null, view1, "Uitleg view1");
		view1.setLayout(new BorderLayout());
		label1.setHorizontalAlignment(SwingConstants.LEFT);
		view1.add(label1, BorderLayout.NORTH); 
		//view1.add(label1);
		
		JLabel label2 = new JLabel("lol dit moet werken zo?");
		//View 2
		view2 = new JPanel();
		mainTabs.addTab("View 2", null, view2, "Uitleg view2");
		view2.add(label2);
		
		return mainTabs;
	}
	
	public void setLabelContent(ArrayList<Film> films){
		if(films.isEmpty()){
			convert = "Er zijn op dit moment geen films gevonden. <br>";
		} else {
			while(!films.isEmpty()){
				convert += ("<p>" + films.get(0).getTitle() + "</p>");
				films.remove(0);
			}
		}
		convert = ("<html>"+convert+"</html>");
	}
	
	//TODO toepassen van een tabel in het JPanel
	public void addJTable(){
		JTable table = new JTable();
		addTableContent();
	}
	
	private void addTableContent(ArrayList<Film> films){
		
	/*	
	 	**************************************************************************************
	 	*
	 	*	Moet nog inzien of deze elementen gesplitst moeten worden over meerdere methode
	 	*
	 	**************************************************************************************
	 	
	 	*	de hoeveelheid van elementen tellen om de hoeveelheid van spoil knoppen 
	 		te maken films.size()
	 			- 	optie 1: ervoor zorgen dat dit element word toegevoegd tussen het toevoegen 
	 				van een nieuwe film
	 			- 	optie 2: vooraf alle knoppen printen en daarna uitzoeken hoe je de info 
	 				kunnen weergeven achter de desbetreffende knop
	 			-	extra info op knoppen (http://submacro.intersite.com.br/javadoc/SubMacroForms/SubMacroForms/ButtonColumn.html)
		
		*	Informatie toevoegen bij de knopppen
				- moet achter de juiste knop weergegeven worden
		
		*	Functie toevoegen aan de juiste knoppen om extra informatie uit te printen
				-	ervoor zorgen dat het niet helemaal opnieuw laat of onthoud waar hij
					voorheen was, zodat je niet helemaal opnieuw moet navigeren.
				
		*	Uitzoeken hoe je een textpane tussen een JTable kan toevoegen voor het weergeven
			van de extra informatie van een film
				-	of er moet een extra groote collum komen die alle informatie weergeeft
				
		*	Hyperlinks toevoegen aan de spoil element en eventueel een button toevoegen met 
			daarin een hyperlink functie
			
		*	om en om andere row color toevoegen (http://stackoverflow.com/questions/11135695/coloring-jtable-row)
		
		*	Afbeelding interactie toevoegen (zoom functie in een apparte window zonder frame)
		
		*	Na gaan dat er nog notaties aanwezig zijn in het project!!!!!!!!
	*/
	}
	
}
