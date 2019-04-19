package main.java.AndresBurgos.movieDB;

import java.util.ArrayList;

public class Actor {

	private String name;
	private ArrayList<Movie> movies;

	public Actor(String name, ArrayList<Movie> movies) {
		this.name = name;
		this.movies = movies;
	}

	public Actor(String name) {
		this.name = name;
		this.movies = new ArrayList<Movie>();
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
	
	public void addMovieToActor(Movie mov) {
		this.movies.add(mov);
	}

}
