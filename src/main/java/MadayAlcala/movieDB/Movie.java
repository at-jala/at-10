package main.java.MadayAlcala.movieDB;

import java.util.ArrayList;

public class Movie {
	String name;
	ArrayList<Actor> actors;
	double rating;
	
	public Movie() {
		this.name = name;
		this.actors = new ArrayList<>();
		this.rating = rating;
	}
	public Movie(String name, double rating) {
		this.name = name;
		this.rating = rating;
	}
	public Movie(String name) {
		this.name = name;
	
	}
	
	
	
	public Movie(String movieName, String[] actors) {
		this.name =movieName;
		
	}
	
	
	

	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	public double getRating() {
		// TODO Auto-generated method stub
		return rating;
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
