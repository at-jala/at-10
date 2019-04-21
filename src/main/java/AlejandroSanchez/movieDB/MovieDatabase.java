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

	
	
	
	
	/* Method is meant to be called from within addMovie method below.   */
	/* If Movie is registered on movieList this method returns the id of */ 
	/* the Movie on movieList, otherwise it returns -1                   */
	private int peliculaRegistrada (String name) {
		int result = -1;
		int index=0;
		for (; index<getMovieList().size(); index++) {
			if (getMovieList().get(index).getName().equals(name)) {
				result = index;
				break;
			}
		}
		return result;
	}
	/*
	 *  This method takes in the name of a movie that is not currently in the database
	 *  along with a list of actors for that movie. 
	 *  If the movie is already in the database, your code ignores this request 
	 *  (this specification is an oversimplification). 
	 *  If the movie is a new movie, a movie object is created and added to the movieList. 
	 *  If any of the actors happen to be new, they will be added to the actorList.
	 */
	/*
	public void addMovie(String name, String[] actors) {
		if (!peliculaRegistrada(name)) {	
			Movie newMovie = new Movie();
			movieList.add(newMovie);
			movieList.get(movieList.size() - 1).setName(name);
			
			for (int i=0; i<actors.length; i++) {
				intermediateList.add(actors[i]);
			}
			newMovie.setActorsI(intermediateList);

		}
	
	}
	*/


	/* Method is meant to be called from within addActor method below.    */
	/* If Actor is registered on actorList this method returns the id of  */ 
	/* the Actor on actorList, otherwise it returns -1                    */
	private int actorRegistrado (String name) {
		int result = -1;
		int index = 0;
		for (; index<actorList.size(); index++) {
			if (actorList.get(index).getName().equals(name)) {
				result = index;
				break;
			}
		}
		return result;
	}
	/*
	 * Adds actors to the dataBase
	 */
	public void addActor(String name, String[] movies) {
		if (actorRegistrado(name) == -1) {
			Actor newActor = new Actor();
			actorList.add(newActor);
			actorList.get(actorList.size() - 1).setName(name);


			for (int i=0; i<movies.length; i++) {
				// Si la pelicula ya esta registrada, entonces
				// verificar que la pelicula tenga al actor en 
				// su propia lista de actores.
				// Si el actor esta en la lista de la pelicula
				// no pasa naranjas, pero si no esta, añadir el
				// recientemente creado objeto Actor.
				if (peliculaRegistrada(movies[i]) != -1) {
					boolean aux = false;
					for (int j=0; j<movieList.get(peliculaRegistrada(movies[i])).getActors().size(); j++) {
						if (       movieList.get(peliculaRegistrada(movies[i])).getActors().get(j).getName().equals(name)                   ) {
							aux = true;
							break;
						}
					}
					if (!aux) {
						movieList.get(peliculaRegistrada(movies[i])).addActors(newActor);
						newActor.getMovies().add(movieList.get(peliculaRegistrada(movies[i])));
					}
				} 
				else {
					Movie newMovie = new Movie();
					movieList.add(newMovie);
					movieList.get(movieList.size() - 1).setName(movies[i]);
					movieList.get(movieList.size() - 1).getActors().add(newActor);
					newActor.getMovies().add(newMovie);
				}
			}
			
			
		}

	}

	
	
	
	/*
	 * Adds a rating for this movie. Assume that the name argument will definitely be a name that 
	 * is currently in the database.
	 */
	public void addRating(String name, double rating) {
		for (int i=0; i<movieList.size(); i++) {
			if (movieList.get(i).getName().equals(name)) {
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
			List<Movie> lista = new ArrayList<>();  
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
				break;
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
