package main.java.JosueRodriguez.movieDB;

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

}
