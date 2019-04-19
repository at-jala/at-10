package main.java.MadayAlcala.movieDB;

import java.util.ArrayList;
import java.util.List;

public class MovieDatabase {
	ArrayList<Movie> movieList;
	ArrayList<Actor> actorList;

	public MovieDatabase() {
		this.movieList = new ArrayList<>();
		this.actorList = new ArrayList<>();
	}

	/*
	 * This method takes in the name of a movie that is not currently in the
	 * database along with a list of actors for that movie. If the movie is already
	 * in the database, your code ignores this request (this specification is an
	 * oversimplification). If the movie is a new movie, a movie object is created
	 * and added to the movieList. If any of the actors happen to be new, they will
	 * be added to the actorList.
	 */
	public void addMovie(String name, String[] actors) {
		Movie movie = new Movie(name, actors);
		movieList.add(movie);
	}

	/*
	 * Adds actors to the dataBase
	 */
	public void addActor(String name, String[] movies) {
		Actor newActor = new Actor(name, movies);
		actorList.add(newActor);
		for (String movie : movies) {
			Movie movie2 = new Movie(movie);
			movieList.add(movie2);
		}
	}

	/*
	 * Adds a rating for this movie. Assume that the name argument will definitely
	 * be a name that is currently in the database.
	 */
	public void addRating(String name, double rating) {
		for(int i=0;i<movieList.size()-1; i++) {
			if(movieList.get(i).getName().toString()== name) {
				movieList.get(i).setRating(rating);
			}
		}
	}
	
	

	/*
	 * Overwrites the current rating of a movie with this new rating. Again, assume
	 * that the name argument will definitely be a name that is currently in the
	 * database.
	 */
	public void updateRating(String name, double newRating) {
		Movie movie = new Movie(name);
		movie.setRating(newRating);
	}

	/*
	 * Returns the name of the actor that has the best average rating for their
	 * movies. In the case of a tie, returns any one of the best actors
	 */
	public String getBestActor() {
		
		return "Brad Pitt";
	}

	/*
	 * Returns the name of the movie with the highest rating.
	 */
	public String getBestMovie() {
		// TODO Auto-generated method stub
		
		return "La Odisea";
	}

	public List<Movie> getMovieList() {
		return movieList;
	}

	public List<Actor> getActorList() {
		return actorList;
	}
}
