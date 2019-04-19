package main.java.MadayAlcala.movieDB;

import java.util.ArrayList;

public class Movie {
	String name;
	ArrayList<Actor> actors;
	double rating = 0.0;
		
	
	public Movie(String name, ArrayList<Actor> actors, double rating) {
		super();
		this.name = name;
		this.actors = actors;
		this.rating = rating;
	}

	
	

	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	public int getRating() {
		// TODO Auto-generated method stub
		return 0;
	}	
		
	public ArrayList<Actor> getActors() {
		return actors;
	}

	
	public void setName(String name) {
		this.name = name;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}
	
	public void setActors(ArrayList<Actor> actors) {
		this.actors = actors;
	}

}
