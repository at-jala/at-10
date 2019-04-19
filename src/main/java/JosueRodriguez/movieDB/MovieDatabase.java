package main.java.JosueRodriguez.movieDB;

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
	 * This method takes in the name of a movie that is not currently in the
	 * database along with a list of actors for that movie. If the movie is already
	 * in the database, your code ignores this request (this specification is an
	 * oversimplification). If the movie is a new movie, a movie object is created
	 * and added to the movieList. If any of the actors happen to be new, they will
	 * be added to the actorList.
	 */
	public void addMovie(String name, String[] actor) {

	}

	/*
	 * Adds actors to the dataBase
	 */
	public void addActor(String name, String[] movies) {
		Actor newActor = new Actor();
		newActor.setName(name);
		for (int i = 0; i < movies.length; i++) {
			newActor.addMovies(movies[i]);
		}
		if (actorList.size() == 0) {
			actorList.add(newActor);
			if (movieList.size() == 0) {
				for (int i = 0; i < newActor.getMovies().size(); i++) {
					movieList.add(newActor.getMovies().get(i));
				}
			}

		} else {
			for (int i = 0; i < actorList.size(); i++) {
				if (newActor.getName() != actorList.get(i).getName()) {
					actorList.add(newActor);
					for (int j = 0; j < newActor.getMovies().size(); j++) {
						for (int k = 0; k < movieList.size(); k++) {
							if (newActor.getMovies().get(k).getName() != movieList.get(k).getName()) {
								movieList.add(newActor.getMovies().get(k));
							}
						}
					}
				}
			}
		}

	}

	/*
	 * Adds a rating for this movie. Assume that the name argument will definitely
	 * be a name that is currently in the database.
	 */
	public void addRating(String name, double rating) {
		for (int i = 0; i < movieList.size(); i++) {
			if (name == movieList.get(i).getName()) {
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

	public List<Movie> getMovieList() {
		return movieList;
	}

	public List<Actor> getActorList() {
		return actorList;
	}
}
