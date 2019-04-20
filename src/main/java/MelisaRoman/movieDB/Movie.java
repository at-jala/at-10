package main.java.MelisaRoman.movieDB;

import java.util.ArrayList;
import java.util.List;

public class Movie {

	private String name;
	private List<Actor> actors;
	private double rating;

	public Movie() {
		name = "";
		actors = new ArrayList<Actor>();
		rating = 0;
	}

	public Movie(String name) {
		this.name = name;
		actors = new ArrayList<Actor>();
		rating = 0;
	}

	public String getName() {
		return name;
	}

	public List<Actor> getActors() {
		return actors;
	}

	public double getRating() {
		return rating;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setActors(List<Actor> actors) {
		this.actors = actors;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public void printMovie() {
		System.out.println("Title: " + name);
		System.out.println("Rating: " + rating);
		System.out.println("Cast: ");
		for (int i = 0; i < actors.size(); i++) {
			System.out.println(actors.get(i).getName());
		}
	}

	public void addNewToItsActors(Actor actor) {
		actors.add(actor);
	}
}
