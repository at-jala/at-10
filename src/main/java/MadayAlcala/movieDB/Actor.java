package main.java.MadayAlcala.movieDB;

import java.util.ArrayList;

public class Actor {
	
	private String name;
	private ArrayList<Movie> movies;
	
	public Actor() {
		this.name = "";
		this.movies = new ArrayList<>();
	}
	
	public Actor(String name, String[] movies) {
		this.name = name;
		//this.movies = Tomovies;
		
	}

		
	public String getName() {
		// TODO Auto-generated method stub
		return name;
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
	