package Model;

import java.util.ArrayList;

public class Director implements People {
	private String name;
	private int age;
	private ArrayList<Film> moviesDirected;
	
	/**
	 * Greates a Director with name and age
	 * @param name
	 * @param age
	 */
	public Director(String name, int age){
		moviesDirected = new ArrayList<Film>();
		this.name = name;
		this.age = age;
	}
	
	/**
	 * @return name name of Director
	 */
	public String getName(){
		return name;
	}
	/**
	 * @return age age of Director
	 */
	public int getAge(){
		return age;
	}
	/**
	 * @return moviesDirected ArrayList of movies where the Director have directed in.
	 */
	public ArrayList<Film> getPlayedMovies(){
		return moviesDirected;
	}
	
	/**
	 * Adds a movie to the ArrayList of movies where the Director have directed in.
	 * @param film object of Film
	 */
	public void addMovieDirected(Film film){
		moviesDirected.add(film);
	}

}
