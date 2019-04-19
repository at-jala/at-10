package main.java.MelisaRoman.movieDB;

import java.util.ArrayList;

public class Movie {

	private String name;
	private ArrayList<Actor> actors;
	private double rating;

	public Movie() {
		name = "";
		actors = new ArrayList<Actor>();
		rating = 0;
	}

	public Movie(String name, ArrayList<Actor> actors) {
		this.name = name;
		this.actors = actors;
	}

	public String getName() {
		return name;
	}

	public ArrayList<Actor> getActors() {
		return actors;
	}

	public double getRating() {
		return rating;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setActors(ArrayList<Actor> actors) {
		this.actors = actors;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public boolean isItThisMovie(String title) {
		boolean answer = false;
		if (title == this.name) {
			answer = true;
		}
		return answer;
	}
	
	public Movie(String name) {
		this.name=name;
		actors = new ArrayList<Actor>();
		rating = 0;
	}
}
