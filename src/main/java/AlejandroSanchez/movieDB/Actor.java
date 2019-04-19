package main.java.AlejandroSanchez.movieDB;

import java.util.ArrayList;

public class Actor {
	private String name;
	private ArrayList<Movie> movies;
	/**/
	private ArrayList<String> moviesI;
	
	public Actor () {
		name = "";
		movies = new ArrayList<Movie>();
		moviesI = new ArrayList<String>();
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public ArrayList<Movie> getMovies () {
		return movies;
	}
	
	public void setMovies (ArrayList<Movie> movies) {
		this.movies = movies;
	}
	
	public void addMovie (Movie movie) {
		movies.add(movie);
	}
	//**
	public ArrayList<String> getMoviesI () {
		return moviesI;
	}
	
	public void setMoviesI (ArrayList<String> movies) {
		this.moviesI = movies;
	}
	
	public void addMovieI (String movie) {
		moviesI.add(movie);
	}

	
	
}
