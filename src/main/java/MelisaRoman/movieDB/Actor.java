package main.java.MelisaRoman.movieDB;

import java.util.ArrayList;
import java.util.List;

public class Actor {
	private String name;
	private List<Movie> movies;

	public Actor() {
		name = "";
		movies = new ArrayList<Movie>();
	}

	public Actor(String name) {
		this.name = name;
		movies = new ArrayList<Movie>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Movie> getMovies() {
		return movies;
	}

	public void setMovies(List<Movie> movies) {
		this.movies = movies;
	}

	public double getRatingAverage() {
		double total = 0;
		double average;
		for (int i = 0; i < movies.size(); i++) {
			total = total + movies.get(i).getRating();
		}
		average = total / movies.size();
		return average;
	}

	public void printActor() {
		System.out.println("Name: " + name);
		System.out.println("Movies starred in");
		for (int i = 0; i < movies.size(); i++) {
			System.out.println(movies.get(i).getName());
		}
	}
	
	public void addNewToItsMovies(Movie movie) {
		movies.add(movie);
	}
}
