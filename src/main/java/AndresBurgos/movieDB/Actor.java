package main.java.AndresBurgos.movieDB;

import java.util.ArrayList;

public class Actor {
	public Actor(String name, ArrayList<Movie> movies) {
		this.name = name;
		this.movies = movies;
	}

	private String name;
	private ArrayList<Movie> movies;

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
