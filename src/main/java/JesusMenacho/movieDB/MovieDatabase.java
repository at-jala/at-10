package main.java.JesusMenacho.movieDB;

import java.util.ArrayList;
import java.util.List;

public class MovieDatabase {
	
	ArrayList<Movie> movieList;
	ArrayList<Actor> actorList;
	
	public MovieDatabase() {
		movieList = new ArrayList<>();
		actorList = new ArrayList<>();
	}
	
	/*
	 *  This method takes in the name of a movie that is not currently in the database
	 *  along with a list of actors for that movie. 
	 *  If the movie is already in the database, your code ignores this request 
	 *  (this specification is an oversimplification). 
	 *  If the movie is a new movie, a movie object is created and added to the movieList. 
	 *  If any of the actors happen to be new, they will be added to the actorList.
	 */
	
	
	public void addMovie(String name, String[] actors) {
		boolean isExisting = false;
		for (Movie movie: movieList) {
			if (movie.getName().equals(name)) {
				isExisting = true;
				break;
			}
		}
		if (!isExisting) {
			Movie movie = new Movie(name);
			for (String actor : actors) {
				movie.addActor(actor);
			}
			movieList.add(movie);
		}
		
	}
	

	/*
	 * Adds actors to the dataBase
	 */
	public void addActor(String name, String[] movies) {
		Actor actor = new Actor(name);
		for (String movieName : movies) {
			actor.addMovie(movieName);
			addMovie(movieName, new String[] {actor.getName()});
		}
		actorList.add(actor);
	}
	
	/*
	 * Adds a rating for this movie. Assume that the name argument will definitely be a name that 
	 * is currently in the database.
	 */
	public void addRating(String name, double rating) {
		for (Movie movie: movieList) {
			if (movie.getName().equals(name)) {
				movie.setRating(rating);
				
			}
		}
		for (Actor actor : actorList) {
			for (Movie actorMovie : actor.getMovies()) {
				if (actorMovie.getName().equals(name)) {
					actorMovie.setRating(rating);
				}
			}
		}
	}
	
	/*
	 * Overwrites the current rating of a movie with this new rating. Again, assume that the name 
	 * argument will definitely be a name that is currently in the database.
	 */
	public void updateRating(String name, double newRating) {
		for (Movie movie: movieList) {
			if (movie.getName().equals(name)) {
				movie.setRating(newRating);
			}
		}
	}
	
	/*
	 * Returns the name of the actor that has the best average rating for their movies.
	 * In the case of a tie, returns any one of the best actors
	 */
	public String getBestActor() {
		double bestRating = 0;
		Actor bestActor = null;
		for (Actor actor : actorList) {
			double avg = 0;
			for (Movie movie : actor.getMovies()) {
				avg += movie.getRating();
			}
			avg /= actor.getMovies().size();
			if (avg > bestRating) {
				bestRating = avg;
				bestActor = actor;
			}
		}
		return bestActor.getName();
	}

	/*
	 * Returns the name of the movie with the highest rating.
	 */
	public String getBestMovie() {
		double bestRating = 0;
		Movie bestMovie = null;
		for (Movie movie : movieList) {
			if (movie.getRating() > bestRating) {
				bestRating = movie.getRating();
				bestMovie = movie;
			}
		}
		return bestMovie.getName();
	}

	public List<Movie> getMovieList(){
		return movieList;
	}
	
	public List<Actor> getActorList(){
		return actorList;
	}		
}
