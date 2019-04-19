package main.java.JesusMenacho.movieDB;

import java.util.ArrayList;

public class Actor {
	
	private String name;
	private ArrayList<Movie> movies;
	
	public Actor(String name)
	{
		this.name = name;
		movies = new ArrayList<>();
	}
	
	public String getName() {
		return name;
	}

	public ArrayList<Movie> getMovies() {
		return movies;
	}
	
	public void addMovie(String movieName) {
		movies.add(new Movie(movieName));
	}
	

}
