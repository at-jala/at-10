package main.java.MadayAlcala.movieDB;

import java.util.ArrayList;

public class Actor {
	
	private String name;
	private ArrayList<Movie> movies;
	
	
	public Actor(String name, ArrayList<Movie> movies) {
		super();
		this.name = name;
		this.movies = movies;
	}

		
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}	
	public ArrayList<Movie> getMovies() {
		return movies;
	}

	public void setMovies(ArrayList<Movie> movies) {
		this.movies = movies;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
	
	
}
	