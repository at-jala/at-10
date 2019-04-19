package main.java.AndresBurgos.movieDB;

import java.util.ArrayList;

public class Movie {

	private String name;
	private ArrayList<Actor> actors;
	private double rating;

	public Movie(String name, ArrayList<Actor> actors, double rating) {
		this.name = name;
		this.actors = actors;
		this.rating = rating;
	}

	public Movie(String name) {
		this.name = name;
		this.actors = new ArrayList<Actor>();
		this.rating = 0; 
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Actor> getActors() {
		return actors;
	}

	public void setActors(ArrayList<Actor> actors) {
		this.actors = actors;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}
	public void addActorToMovie(Actor a) {
		actors.add(a);
	}
}
