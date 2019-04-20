package main.java.MelisaRoman.movieDB;

import java.util.ArrayList;
import java.util.List;

public class MovieDatabase {
	private List<Movie> movieList;
	private List<Actor> actorList;

	public MovieDatabase() {
		movieList = new ArrayList<Movie>();
		actorList = new ArrayList<Actor>();
	}

	public List<Movie> getMovieList() {
		return movieList;
	}

	public List<Actor> getActorList() {
		return actorList;
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
		if (!this.containsMovie(name)) {
			Movie newMovie = new Movie(name);
			movieList.add(newMovie);
			for (int i = 0; i < actors.length; i++) {
				if (!this.containsActor(actors[i])) {
					Actor newActor = new Actor(actors[i]);
					newActor.addNewToItsMovies(newMovie);
					newMovie.addNewToItsActors(newActor);
					actorList.add(newActor);
				}
				else{
					newMovie.addNewToItsActors(getActor(actors[i]));
					getActor(actors[i]).addNewToItsMovies(newMovie);
				}
			}
		}
	}
	
	/*
	 * Adds actors to the dataBase
	 */
	public void addActor(String name, String[] movies) {
		if (!this.containsActor(name)) {
			Actor newActor = new Actor(name);
			actorList.add(newActor);
			for (int i = 0; i < movies.length; i++) {
				if (!this.containsMovie(movies[i])) {
					Movie newMovie = new Movie(movies[i]);
					newMovie.addNewToItsActors(newActor);
					newActor.addNewToItsMovies(newMovie);
					movieList.add(newMovie);
				}
				else {
					newActor.addNewToItsMovies(getMovie(movies[i]));
					getMovie(movies[i]).addNewToItsActors(newActor);
				}
			}
		}
	}
	
	public Actor getActor(String name) {
		Actor actor=new Actor();
		for(int i=0;i<actorList.size();i++) {
			if(actorList.get(i).getName().equals(name)) {
				actor= actorList.get(i);
			}
		}
		return actor;
	}
	
	public Movie getMovie(String name) {
		Movie movie=new Movie();
		for(int i=0;i<movieList.size();i++) {
			if(movieList.get(i).getName().equals(name)) {
				movie= movieList.get(i);
			}
		}
		return movie;
	}

	public boolean containsMovie(String name) {
		boolean answer = false;
		for (int i = 0; i < movieList.size(); i++) {
			if (movieList.get(i).getName().equals(name)) {
				answer = true;
			}
		}
		return answer;
	}

	public boolean containsActor(String name) {
		boolean answer = false;
		for (int i = 0; i < actorList.size(); i++) {
			if (actorList.get(i).getName().equals(name)) {
				answer = true;
			}
		}
		return answer;
	}

	/*
	 * Adds a rating for this movie. Assume that the name argument will definitely
	 * be a name that is currently in the database.
	 */
	public void addRating(String name, double rating) {

		for (int i = 0; i < movieList.size(); i++) {
			if (movieList.get(i).getName().equals(name)) {
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
		for (int i = 0; i < movieList.size(); i++) {
			if (movieList.get(i).getName().equals(name)) {
				movieList.get(i).setRating(newRating);
			}
		}
	}

	/*
	 * Returns the name of the actor that has the best average rating for their
	 * movies. In the case of a tie, returns any one of the best actors
	 */
	public String getBestActor() {
		double bestRatingAverage = 0;
		String nameBestActor = "";
		for (int i = 0; i < actorList.size(); i++) {
			if (actorList.get(i).getRatingAverage() > bestRatingAverage) {
				bestRatingAverage = actorList.get(i).getRatingAverage();
				nameBestActor = actorList.get(i).getName();
			}
		}
		return nameBestActor;
	}

	/*
	 * Returns the name of the movie with the highest rating.
	 */
	public String getBestMovie() {
		double bestRating = 0;
		String bestMovie = "";
		for (int i = 0; i < movieList.size(); i++) {
			if (movieList.get(i).getRating() > bestRating) {
				bestRating = movieList.get(i).getRating();
				bestMovie = movieList.get(i).getName();
			}
		}
		return bestMovie;
	}

	public void printMovieList() {
		for (int i = 0; i < movieList.size(); i++) {
			System.out.println(i + " " + movieList.get(i).getName());
		}
	}

	public void printActorList() {
		for (int i = 0; i < actorList.size(); i++) {
			System.out.println(i + " " + actorList.get(i).getName());
		}
	}
}
