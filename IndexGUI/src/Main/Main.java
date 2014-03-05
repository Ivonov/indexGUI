package Main;

import java.util.ArrayList;

import Model.Actor;
import Model.Director;
import Model.Film;
import View.MainGUI;

public class Main {

	public static void main(String[] args) {
		ArrayList<Film> films = new ArrayList<Film>();
		
		//Cast of the movie Apes
		Actor jan = new Actor("Jan", 18);
		Actor klaas = new Actor("Klaas", 20);
		Actor koen = new Actor("Koen", 35);
		Actor marloes = new Actor("Marloes", 16);
		Director paul = new Director("Paul", 45);
		Film apes = new Film("Apes", "20-12-2013");
		apes.addActor(jan);
		apes.addActor(klaas);
		apes.addActor(koen);
		apes.addActor(marloes);
		apes.addDirector(paul);
		films.add(apes);
		
		//Cast of the movie killer
		Actor kim = new Actor("kim", 18);
		Actor wappie = new Actor("wappie", 20);
		Actor harry = new Actor("harry", 35);
		Actor karel = new Actor("karel", 16);
		Director douwe = new Director("douwe", 45);
		Film killer = new Film("Killer", "20-12-2013");
		killer.addActor(kim);
		killer.addActor(wappie);
		killer.addActor(harry);
		killer.addActor(karel);
		killer.addDirector(douwe);
		films.add(killer);
		
		//Cast of the movie killer
		Actor koek = new Actor("koek", 18);
		Actor hallow = new Actor("hallow", 20);
		Actor herken = new Actor("herken", 35);
		Actor yeti = new Actor("yeti", 16);
		Director goelo = new Director("goelo", 45);
		Film filler = new Film("Filler", "20-12-2013");
		filler.addActor(koek);
		filler.addActor(hallow);
		filler.addActor(herken);
		filler.addActor(yeti);
		filler.addDirector(goelo);
		films.add(filler);
		
		
		
		MainGUI main1 = new MainGUI();
		main1.setLabelContent(films);
		main1.greateFrame();
	}

}
