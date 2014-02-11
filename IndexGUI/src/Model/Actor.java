package Model;

import java.util.ArrayList;

public class Actor implements People {
	private String name;
	private int age;
	private ArrayList<Film> playedMovies;
	
	/**
	 * Greates an Actor with name and age
	 * @param name the name of the actor
	 * @param age the age of the actor
	 */
	public Actor(String name, int age){
		playedMovies = new ArrayList<Film>();
		this.name = name;
		this.age = age;
	}
	
	/**
	 * @return name name of actor
	 */
	public String getName(){
		return name;
	}
	/**
	 * @return age age of actor
	 */
	public int getAge(){
		return age;
	}
	/**
	 * @return playedMovies ArrayList of movies where the actor have played in.
	 */
	public ArrayList<Film> getPlayedMovies(){
		return playedMovies;
	}
	
	/**
	 * Adds a movie to the ArrayList of movies where the actor have played in.
	 * @param film object of Film
	 */
	public void addPlayedMovie(Film film){
		playedMovies.add(film);
	}
	
}
