package main.java.JesusMenacho.movieDB;

import java.util.ArrayList;

public class Movie {
	private String name;
	private double rating;
	private ArrayList<Actor> actors;
	
	public Movie(String name)
	{
		this.name = name;
		this.rating = 0;
		actors = new ArrayList<>();
	}
	
	public String getName() {
		return name;
	}

	public double getRating() {
		return rating;
	}
	
	public ArrayList<Actor> getActors() {
		return actors;
	}
	
	public void addActor(String name)
	{
		actors.add(new Actor(name));
	}

	public void setRating(double rating) {
		this.rating = rating;
		
	}
}
