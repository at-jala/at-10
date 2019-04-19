package main.java.JosueRodriguez.movieDB;

import java.util.ArrayList;

public class Actor {
	private String name;
	private ArrayList<Movie> movies;

	public Actor() {
		name = "";
		movies = new ArrayList<Movie>();
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

}
