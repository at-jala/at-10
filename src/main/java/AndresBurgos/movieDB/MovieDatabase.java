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
			movieList.add(new Movie(name, createActorList(actors, name), 0));
		}

	}

	private ArrayList<Actor> createActorList(String[] actors, String movieName) {
		ArrayList<Actor> actorsMovie = new ArrayList<Actor>();
		for (int i = 0; i < actors.length; i++) {
			if (isInActorsList(actors)) {
				actorsMovie.add(getActorByName(actors[i]));
			} else {
				if (getMovieByName(movieName) != null) {
					ArrayList<Movie> mov = new ArrayList<Movie>();
					mov.add(getMovieByName(movieName));
					actorsMovie.add(new Actor(actors[i], mov));
				}

			}
		}
		return actorsMovie;
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

	private boolean isInActorsList(String[] actors) {
		// TODO Auto-generated method stub
		return false;
	}

	private Actor getActorByName(String string) {
		// TODO Auto-generated method stub
		return null;
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

	/*
	 * Adds actors to the dataBase
	 */
	public void addActor(String name, String[] movies) {
		if (!actorInList(name)) {
			actorList.add(new Actor(name, getMovies(movies)));
		}

	}

	private ArrayList<Movie> getMovies(String[] movies) {
		ArrayList<Movie> res = new ArrayList<Movie>();
		for (int i = 0; i < movies.length; i++) {
			if (isMovieInDatabase(movies[i])) {
				for (int j = 0; j < movieList.size(); j++) {
					if (movieList.get(j).getName().compareTo(movies[i]) == 0) {
						res.add(movieList.get(j));
					}
				}
			}else {
				res.add(new Movie(movies[i],  ,0));
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

	}

	/*
	 * Overwrites the current rating of a movie with this new rating. Again, assume
	 * that the name argument will definitely be a name that is currently in the
	 * database.
	 */
	public void updateRating(String name, double newRating) {

	}

	/*
	 * Returns the name of the actor that has the best average rating for their
	 * movies. In the case of a tie, returns any one of the best actors
	 */
	public String getBestActor() {
		return null;
	}

	/*
	 * Returns the name of the movie with the highest rating.
	 */
	public String getBestMovie() {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<Movie> getMovieList() {
		return movieList;
	}

	public ArrayList<Actor> getActorList() {
		return actorList;
	}
}
