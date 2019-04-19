package main.java.MelisaRoman.movieDB;

import java.util.ArrayList;
import java.util.List;

public class MovieDatabase {
	ArrayList<Movie> movieList;
	ArrayList<Actor> actorList;

	public MovieDatabase() {
		movieList = new ArrayList<Movie>();
		actorList = new ArrayList<Actor>();
	}

	public ArrayList<Movie> getMovieList() {
		return movieList;
	}

	public ArrayList<Actor> getActorList() {
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
		if (!containsThisMovie(name)) {
			movieList.add(new Movie(name));
			actorsThatThisDoesntContain(actors);
		}
		
	}

	public boolean containsThisMovie(String name) {
		boolean answer = false;
		for (int i = 0; i < movieList.size(); i++) {
			if (movieList.get(i).isItThisMovie(name)) {
				answer = true;
			}
		}
		return answer;
	}
	
	public ArrayList<Actor> actorsThatThisDoesntContain(String[] names) {
		ArrayList<Actor> newActors= new ArrayList<Actor>();
		for (int i = 0; i < names.length; i++) {
			for(int j=0; j<actorList.size();j++) {
				if(actorList.get(j).isHeSheThisActor(names[i])) {
					newActors.add(new Actor(names[i]));
				}
				
			}
		}
		return newActors;
	}

	public boolean containsThisActor(String name) {
		boolean answer = false;
		for (int i = 0; i < actorList.size(); i++) {
			if (actorList.get(i).isHeSheThisActor(name)) {
				answer = true;
			}
		}
		return answer;
	}

	/*
	 * Adds actors to the dataBase
	 */
	public void addActor(String name, String[] movies) {
		Movie newMovie=new Movie();
		Actor newActor=new Actor();
		newActor.setName(name);
		for(int i=0;i<movies.length;i++) {
			newMovie.setName(movies[i]);
		}
		actorList.add(newActor);

	}
	
	public void addActors(ArrayList<Actor> actors) {
		for(int i=0;i<actors.size();i++) {
			actorList.add(actors.get(i));
		}
	}

	/*
	 * Adds a rating for this movie. Assume that the name argument will definitely
	 * be a name that is currently in the database.
	 */
	public void addRating(String name, double rating) {
		for (int i = 0; i < movieList.size(); i++) {
			if (movieList.get(i).isItThisMovie(name)) {
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
		double bestRatingAverage=0;
		String nameBestActor="";
		for(int i=0;i<actorList.size();i++) {
			if(actorList.get(i).getRatingAverage()>bestRatingAverage) {
				bestRatingAverage=actorList.get(i).getRatingAverage();
				nameBestActor=actorList.get(i).getName();
			}
		}
		return nameBestActor;
	}

	/*
	 * Returns the name of the movie with the highest rating.
	 */
	public String getBestMovie() {
		double bestRating=0;
		String bestMovie="";
		for(int i=0;i<movieList.size();i++) {
			if(movieList.get(i).getRating()>bestRating) {
				bestRating=movieList.get(i).getRating();
				bestMovie=movieList.get(i).getName();
			}
		}
		return bestMovie;
	}

}
