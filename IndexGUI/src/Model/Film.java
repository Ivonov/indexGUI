package Model;

import java.util.ArrayList;

public class Film {
	private String title;
	private String release;
	private ArrayList<Director> directors;
	private ArrayList<Actor> actors;
	//TODO misschien meer toevoegen als artributen
	
	/**
	 * Greates the movie with title and release
	 * @param title
	 * @param release
	 */
	public Film(String title, String release){
		this.title = title;
		this.release = release;
	}
	/**
	 * Adds a Director to the ArrayList of directors
	 * @param director
	 */
	public void addDirector(Director director){
		directors.add(director);
	}
	/**
	 * Adds an Actor to the ArrayList of actors
	 * @param actor
	 */
	public void addActor(Actor actor){
		actors.add(actor);
	}
	
	/**
	 * @return title title of the movie
	 */
	public String getTitle(){
		return title;
	}
	/**
	 * @return release releasedate of the movie
	 */
	public String getRelease(){
		return release;
	}
	/**
	 * @return directors directors of the movie
	 */
	public ArrayList<Director> getDirectors(){
		return directors;
	}
	/**
	 * @return actors actors of the movie
	 */
	public ArrayList<Actor> getActors(){
		return actors;
	}
}
