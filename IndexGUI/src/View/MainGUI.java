package View;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
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
	
	private String convert;
	
	/**
	 * Paints the GUI part of things
	 */
	public MainGUI(){
		mainFrame = new JFrame("Ivonov was here");
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setSize(800,400);
		//mainFrame.pack();
	
		mainMenuBar = new JMenuBar();
		
		configMenus();
		
		mainFrame.setJMenuBar(mainMenuBar);
		mainFrame.add(configTabbladen());
		mainFrame.setVisible(true);
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
				JOptionPane.showMessageDialog(null, "Refresh that f**king thing!");
			}
		});
		
	}
	
	/**
	 * Greates all the tabs and returns a JTabbedPane to the constructor
	 * @return mainTabs this is the JTabbedPane
	 */
	private JTabbedPane configTabbladen(){
		JTabbedPane mainTabs = new JTabbedPane();
		JLabel label1 = new JLabel("lol dit moet werken?");
		//View 1
		view1 = new JPanel();
		mainTabs.addTab("View 1", null, view1, "Uitleg view1");
		view1.setLayout(new BorderLayout());
		//label1.setHorizontalAlignment(SwingConstants.LEFT);
		//view1.add(label1, BorderLayout.CENTER); 
		view1.add(label1);
		
		JLabel label2 = new JLabel("lol dit moet werken zo?");
		//View 2
		view2 = new JPanel();
		mainTabs.addTab("View 2", null, view2, "Uitleg view2");
		view2.add(label2);
		
		//addTabActions();
		
		return mainTabs;
	}
	
	private JLabel setLabelContent(ArrayList<Film> films){
		int i= 0;
		while(!films.isEmpty()){
			convert += films.get(i).getTitle() + "\n";
			films.remove(i);
			i++;
		}
		JLabel label = new JLabel(convert);
		return label;
	}
	
	/**
	 * Adds all the ActionListeners to the Tabs
	 */
	/*
	private void addTabActions(){
		
		view1.addMouseListener(new MouseListener(){
			public void mouseClicked(MouseEvent arg0) {
				JOptionPane.showMessageDialog(null, "Tab view 1 is selected!");
			}

			public void mouseExited(MouseEvent arg0) {
				//nothing
			}

			public void mouseEntered(MouseEvent arg0) {
				//nothing
			}

			public void mousePressed(MouseEvent arg0) {
				//nothing
			}

			public void mouseReleased(MouseEvent arg0) {
				//nothing
			    System.out.println("Welcome to Java Programming!"); 
			}
			
			public void mousePressed(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "Tab view 1 is selected!");
			}
			
		});
		
		view2.addMouseListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				JOptionPane.showMessageDialog(null, "Tab view 2 is selected!");
			}
		});
	}
	*/
	/*
	 * 		TODO 
	 * 		VERDERE PUNTEN:
	 * -	Probeer te bedenken wat voor informatie verwerkt moet worden.
	 * 
	 * -	Sorteer functie
	 * 
	 * -	Onderzoek hoe je text in de panel de text print.
	 * 
	 * -	ect ............... xD
	 */
}
