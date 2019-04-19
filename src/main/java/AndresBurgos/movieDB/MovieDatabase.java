package main.java.AndresBurgos.movieDB;

import java.util.ArrayList;
import java.util.List;

public class MovieDatabase {
	ArrayList<Movie> movieList;
	ArrayList<Actor> actorList;

	public MovieDatabase() {
		movieList = new ArrayList<Movie>();
		actorList = new ArrayList<Actor>();
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
		if (!isMovieInDatabase(name)) {
			Movie mov = new Movie(name);
			movieList.add(mov);
			for (int i = 0; i < actors.length; i++) {
				getActorByName(actors[i]).addMovieToActor(mov);
			}
		}
	}

	/*
	 * Adds actors to the dataBase
	 */
	public void addActor(String name, String[] movies) {
		if (!actorInList(name)) {
			Actor act = new Actor(name, getMovies(movies));
			actorList.add(act);
			for (int i = 0; i < movies.length; i++) {
				getMovieByName(movies[i]).addActorToMovie(act);
			}
		}

	}

	private Actor getActorByName(String actorName) {
		Actor act = null;
		for (int i = 0; i < actorList.size(); i++) {
			if (actorList.get(i).getName().compareTo(actorName) == 0) {
				act = actorList.get(i);
				break;
			}
		}
		return act;

	}

	private Movie getMovieByName(String movieName) {
		Movie mov = null;
		for (int i = 0; i < movieList.size(); i++) {
			if (movieList.get(i).getName().compareTo(movieName) == 0) {
				mov = movieList.get(i);
				break;
			}
		}
		return mov;
	}

	private boolean isMovieInDatabase(String name) {
		boolean res = false;
		for (int i = 0; i < movieList.size(); i++) {
			if (movieList.get(i).getName().compareTo(name) == 0) {
				res = true;
				break;
			}
		}
		return res;
	}

	private ArrayList<Movie> getMovies(String[] movies) {
		ArrayList<Movie> res = new ArrayList<Movie>();
		for (int i = 0; i < movies.length; i++) {
			if (isMovieInDatabase(movies[i])) {
				res.add(getMovieByName(movies[i]));
			} else {
				Movie mov = new Movie(movies[i]);
				movieList.add(mov);
				res.add(mov);
			}
		}
		return res;
	}

	private boolean actorInList(String name) {
		boolean res = false;
		for (int i = 0; i < actorList.size(); i++) {
			if (actorList.get(i).getName().compareTo(name) == 0) {
				res = true;
				break;
			}
		}
		return res;
	}

	/*
	 * Adds a rating for this movie. Assume that the name argument will definitely
	 * be a name that is currently in the database.
	 */
	public void addRating(String name, double rating) {
		if (isMovieInDatabase(name)) {
			getMovieByName(name).setRating(rating);
		}

	}

	/*
	 * Overwrites the current rating of a movie with this new rating. Again, assume
	 * that the name argument will definitely be a name that is currently in the
	 * database.
	 */
	public void updateRating(String name, double newRating) {
		if (isMovieInDatabase(name)) {
			getMovieByName(name).setRating(newRating);
		}
	}

	/*
	 * Returns the name of the actor that has the best average rating for their
	 * movies. In the case of a tie, returns any one of the best actors
	 */
	public String getBestActor() {
		int max = 0;
		int index = 0;
		for (int i = 0; i < actorList.size(); i++) {
			int actorAvg = getActorAverageRating(actorList.get(i));
			if (actorAvg > max) {
				index = i;
			}
		}
		return actorList.get(index).getName();
	}

	private int getActorAverageRating(Actor actor) {
		double sum = 0;
		int numberOfMovies = actor.getMovies().size();
		for (int i = 0; i < actor.getMovies().size(); i++) {
			sum += actor.getMovies().get(i).getRating();
		}
		return (int) (sum / numberOfMovies);
	}

	/*
	 * Returns the name of the movie with the highest rating.
	 */
	public String getBestMovie() {
		int index = 0;
		double max = 0;
		for (int i = 0; i < movieList.size(); i++) {
			if (movieList.get(i).getRating() > max) {
				index = i;
			}
		}
		return movieList.get(index).getName();
	}

	public ArrayList<Movie> getMovieList() {
		return movieList;
	}

	public ArrayList<Actor> getActorList() {
		return actorList;
	}
}
