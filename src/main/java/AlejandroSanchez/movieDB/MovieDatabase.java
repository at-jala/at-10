package main.java.AlejandroSanchez.movieDB;

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
		Movie mov = new Movie();
		mov.name = name;

		for (int i=0; i<actors.length; i++) {
			Actor acc = new Actor();
			acc.setName(actors[i]);
			mov.setActors();
		}
	}
	

	/*
	 * Adds actors to the dataBase
	 */
	public void addActor(String name, String[] movies) {
		Actor nuevoActor = new Actor();
		nuevoActor.setName(name);
		ArrayList<String> aux = new ArrayList<>();
		for (int i=0; i<movies.length; i++) {
			aux.add(movies[i]);
		}
		nuevoActor.setMoviesI(aux);
	}
	
	/*
	 * Adds a rating for this movie. Assume that the name argument will definitely be a name that 
	 * is currently in the database.
	 */
	public void addRating(String name, double rating) {
		for (int i=0; i<movieList.size(); i++) {
			if (name == movieList.get(i).getName()) {
				movieList.get(i).setRating(rating); 
			}
		}
	}
	
	/*
	 * Overwrites the current rating of a movie with this new rating. Again, assume that the name 
	 * argument will definitely be a name that is currently in the database.
	 */
	public void updateRating(String name, double newRating) {
		this.addRating(name, newRating);
	}
	
	/*
	 * Returns the name of the actor that has the best average rating for their movies.
	 * In the case of a tie, returns any one of the best actors
	 */
	public String getBestActor() {
		double accumulator = 0;
		int indice= 0;
		for (int i=0; i<actorList.size(); i++) {
			ArrayList<Movie> lista = new ArrayList<>();  
			lista = actorList.get(i).getMovies(); 
			double sum = 0;
			for (int j=0; j<lista.size(); j++) {
				sum += lista.get(j).getRating();
			}
			double prom = sum/lista.size();
			if (prom >= accumulator) {
				accumulator = prom;
				indice = i;
			}
			
		}
		
		return actorList.get(indice).getName();
	}

	/*
	 * Returns the name of the movie with the highest rating.
	 */
	public String getBestMovie() {
		double accumulator = 0;
		String result ="";
		for (int i=0; i<movieList.size(); i++) {
			if (movieList.get(i).getRating() > accumulator) {
				accumulator = movieList.get(i).getRating(); 
			}
		}
		for (int i=0; i<movieList.size(); i++) {
			if (movieList.get(i).getRating() == accumulator) {
				result += movieList.get(i).getName(); 
			}
		}
		return result;
	}

	public List<Movie> getMovieList(){
		return movieList;
	}
	
	public List<Actor> getActorList(){
		return actorList;
	}		
}
