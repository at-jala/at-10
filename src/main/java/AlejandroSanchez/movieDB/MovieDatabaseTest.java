package main.java.AlejandroSanchez.movieDB;

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
		/* Check against duplicated entries */
		assertEquals(2, movieDB.getMovieList().size());
	}
	
	@Test
	public void testAddRating() {
		String[] movies = new String[] {"movie1", "movie2"};
		movieDB.addActor("actor1", movies);
		movieDB.addRating("movie1", 10);
		assertTrue(movieDB.getMovieList().get(0).getRating() == 10);
	}
	
	
	/* Added test cases for MovieDatabase.addMovie(String, String[]) */
	@Test
	public void testAddMovie() {
		String[] actors = new String[] {"actor1", "actor2"};
		movieDB.addMovie("movie1", actors);
		assertTrue(movieDB.getMovieList().get(0).getName().equals("movie1"));
	}
	
	@Test
	public void testAddTwoMoviesAndActors() {
		String[] actors = new String[] {"actor1", "actor2"};
		movieDB.addMovie("movie1", actors);
		movieDB.addMovie("movie2", actors);		
		
		assertTrue(movieDB.getMovieList().get(0).getName().equals("movie1"));
		assertTrue(movieDB.getMovieList().get(1).getName().equals("movie2"));
		assertTrue(movieDB.getActorList().get(0).getName().equals("actor1"));
		assertTrue(movieDB.getActorList().get(1).getName().equals("actor2"));
		/* Check against duplicated entries */
		assertEquals(2, movieDB.getActorList().size());
	}
	
	
}
