package limbertVargas;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;

public class ActorTest {
    private Actor actor1;
    private Actor actor2;
    private Actor actor3;
    private Movie movie_1;
    private Movie movie2;
    private Movie movie3;
    private ArrayList<Movie> movieList_1;
    private ArrayList<Movie> movieList_2;
    private ArrayList<Movie> movieList_3;

    @Before
    public void setUpActors() {
        movie_1 = new Movie("movie_1");
        movie2 = new Movie("movie_2");
        movie3 = new Movie("movie_3");

        movieList_1 = new ArrayList<>();
        movieList_1.add(movie_1);
        movieList_2 = new ArrayList<>();
        movieList_2.add(movie2);
        movieList_3 = new ArrayList<>();
        movieList_3.add(movie3);

        actor1 = new Actor("actor_1", movieList_1);
        actor2 = new Actor("actor_2", movieList_2);
        actor3 = new Actor("actor_3", movieList_3);
    }

    @Test
    public void testActorConstructor() {
        assertEquals("actor_1", actor1.getName());

        assertEquals(movieList_1, actor1.getMovies());
    }

    @Test
    public void testAddMovie() {
        actor1.addMovie(movie2);
        movieList_1.add(movie2);
        assertEquals(movieList_1, actor1.getMovies());
    }
}
