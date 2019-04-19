package main.java.MelisaRoman.movieDB;

import java.util.ArrayList;

public class Actor {
	private String name;
	private ArrayList<Movie> movies;

	public Actor() {
		name = "";
		movies = new ArrayList<Movie>();
		/*
		 * movieList = new ArrayList<>(); actorList = new ArrayList<>();
		 */
		// movies.add(new Movie());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Movie> getMovies() {
		return movies;
	}

	public void setMovies(ArrayList<Movie> movies) {
		this.movies = movies;
	}

	public boolean isHeSheThisActor(String name) {
		boolean answer = false;
		if (this.name == name) {
			answer = true;
		}
		return answer;
	}
	
	public Actor(String name) {
		this.name=name;
		movies = new ArrayList<Movie>();
	}

	/*
	 * This class will have the following instance variables: String name – the full
	 * name of the actor or actress. ArrayList<Movie> movies – an Arraylist that has
	 * movies that this actor has acted in. Add getters and setters for these
	 * instance variables.
	 * 
	 * Make sure to create a constructor that initializes your variables
	 * appropriately.
	 */
}
