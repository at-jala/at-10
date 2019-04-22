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
	private final int NO = -1;
	private int peliculaRegistrada (String name) {
		int result = NO;
		for (int index=0; index<movieList.size(); index++) {
			if (movieList.get(index).getName().equals(name)) {
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
	public void addMovie(String name, String[] actors) {
		if (peliculaRegistrada(name) == NO) {
			Movie newMovie = new Movie();
			movieList.add(newMovie);
			movieList.get(movieList.size() - 1).setName(name);

			for (int i=0; i<actors.length; i++) {
				// If actors[i] is registered, check that is has 
				// the movie listed on its 'movies' List.
				// If not, add 'newMovie' to the Actor 'movies' List 
				// And finally, add the Actor object to 'newMovie' 
				// 'actors' List.
				if (actorRegistrado(actors[i]) != NO) {
					boolean aux = false;
					for (int j=0; j<actorList.get(actorRegistrado(actors[i])).getMovies().size(); j++) {
						if (actorList.get(actorRegistrado(actors[i])).getMovies().get(j).getName().equals(name)) {
							aux = true;
							break;
						}
					}
					if (!aux) {
						actorList.get(actorRegistrado(actors[i])).addMovie(newMovie);
						newMovie.getActors().add(actorList.get(actorRegistrado(actors[i])));
					}
				} 
				// If actors[i] is not registered, create a new Actor object, 
				// add it to 'MovieDB's actorList, set its 'name' attribute and 
				// add 'newMovie' to its 'movies' List.
				// Finally, add 'newActor' to 'newMovie's 'actors' List.
				else {
					Actor newActor = new Actor();
					actorList.add(newActor);
					actorList.get(actorList.size() - 1).setName(actors[i]);
					actorList.get(actorList.size() - 1).getMovies().add(newMovie);
					newMovie.getActors().add(newActor);
				}
			}
			
		}
	}


	/* Method is meant to be called from within addActor method below.    */
	/* If Actor is registered on actorList this method returns the id of  */ 
	/* the Actor on actorList, otherwise it returns -1                    */
	private int actorRegistrado (String name) {
		int result = NO;
		for (int index=0; index<actorList.size(); index++) {
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
		if (actorRegistrado(name) == NO) {
			Actor newActor = new Actor();
			actorList.add(newActor);
			actorList.get(actorList.size() - 1).setName(name);

			for (int i=0; i<movies.length; i++) {
				// If movies[i] is registered, check that is has 
				// the actor listed on its 'actors' List.
				// If not, add 'newActor' to the Movie 'actors' List 
				// And finally, add the Movie object to 'newActor' 
				// 'movies' List.
				if (peliculaRegistrada(movies[i]) != NO) {
					boolean aux = false;
					for (int j=0; j<movieList.get(peliculaRegistrada(movies[i])).getActors().size(); j++) {
						if (movieList.get(peliculaRegistrada(movies[i])).getActors().get(j).getName().equals(name)) {
							aux = true;
							break;
						}
					}
					if (!aux) {
						movieList.get(peliculaRegistrada(movies[i])).addActor(newActor);
						newActor.getMovies().add(movieList.get(peliculaRegistrada(movies[i])));
					}
				} 
				// If movies[i] is not registered, create a new Movie object, 
				// add it to 'MovieDB's movieList, set its 'name' attribute and 
				// add 'newActor' to its 'actors' List.
				// Finally, add 'newMovie' to 'newActor's 'movies' List.
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
		int index= 0;
		for (int i=0; i<actorList.size(); i++) {
			List<Movie> list = new ArrayList<>();  
			list = actorList.get(i).getMovies(); 
			double sum = 0;
			for (int j=0; j<list.size(); j++) {
				sum += list.get(j).getRating();
			}
			double average = sum/list.size();
			if (average >= accumulator) {
				accumulator = average;
				index = i;
			}
		}
		return actorList.get(index).getName();
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
