package main.java.MelisaRoman.movieDB;

import static org.junit.Assert.*;

import org.junit.Test;

public class MovieDatabaseTest {

	MovieDatabase movieDB = new MovieDatabase();
	
	@Test
	public void testAddActor() {
		String[] movies = new String[] {"movie1", "movie2"};
		movieDB.addActor("actor1", movies);
		assertTrue(movieDB.getActorList().get(0).getName().equals("actor1"));
	}
	
	@Test
	public void testAddTwoActorsAndMovies() {
		String[] movies = new String[] {"movie1", "movie2"};
		movieDB.addActor("actor1", movies);
		movieDB.addActor("actor2", movies);		
		
		assertTrue(movieDB.getActorList().get(0).getName().equals("actor1"));
		assertTrue(movieDB.getActorList().get(1).getName().equals("actor2"));
		assertTrue(movieDB.getMovieList().get(0).getName().equals("movie1"));
		assertTrue(movieDB.getMovieList().get(1).getName().equals("movie2"));
	}
	
	@Test
	public void testAddMovie() {
		String[] actors = new String[] {"actor1", "actor2"};
		movieDB.addMovie("movie1", actors);
		assertTrue(movieDB.getMovieList().get(0).getName().equals("movie1"));
	}
	
	@Test
	public void testAddRating() {
		String[] movies = new String[] {"movie1", "movie2"};
		movieDB.addActor("actor1", movies);
		movieDB.addRating("movie1", 10);
		assertTrue(movieDB.getMovieList().get(0).getRating() == 10);
	}
	
	@Test
	public void testUpdateRating() {
		String[] movies = new String[] {"movie1", "movie2"};
		movieDB.addActor("actor1", movies);
		movieDB.addRating("movie1", 9);
		movieDB.addRating("movie2", 8);
		movieDB.updateRating("movie1", 10);
		movieDB.updateRating("movie2", 10);
		assertTrue(movieDB.getMovieList().get(0).getRating() == 10);
		assertTrue(movieDB.getMovieList().get(1).getRating() == 10);
	}
	
	@Test
	public void testBestMovie() {
		String[] actors1 = new String[] {"actor1", "actor2"};
		String[] actors2 = new String[] {"actor2", "actor3"};
		String[] actors3 = new String[] {"actor3", "actor4"};
		movieDB.addMovie("movie1", actors1);
		movieDB.addMovie("movie2", actors2);
		movieDB.addMovie("movie3", actors3);
		movieDB.addRating("movie1", 7);
		movieDB.addRating("movie2", 10);
		movieDB.addRating("movie3", 8);
		assertTrue(movieDB.getBestMovie().equals("movie2"));
	}
	
	@Test
	public void testBestActor() {
		String[] actors1 = new String[] {"actor1", "actor2","actor3"};
		String[] actors2 = new String[] {"actor2", "actor3"};
		String[] actors3 = new String[] {"actor3", "actor4"};
		String[] movies1 = new String[] {"movie4", "movie5"};
		movieDB.addMovie("movie1", actors1);
		movieDB.addMovie("movie2", actors2);
		movieDB.addMovie("movie3", actors3);
		
		movieDB.addActor("actor5", movies1);
		movieDB.addRating("movie1", 7);
		movieDB.addRating("movie2", 8);
		movieDB.addRating("movie3", 8);
		movieDB.addRating("movie4", 8);
		movieDB.addRating("movie5", 10);
				
		assertTrue(movieDB.getBestActor().equals("actor5"));
	}
}
