package limbertVargas;

import java.util.*;
import java.util.List;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MovieDatabase {
	private ArrayList<Movie> movieList;
	private ArrayList<Actor> actorList;

	public MovieDatabase() {
		this.movieList = new ArrayList<>();
		this.actorList = new ArrayList<>();
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		MovieDatabase that = (MovieDatabase) o;

		if (!movieList.equals(that.movieList)) {
			return false;
		}

		return actorList.equals(that.actorList);
	}

	@Override
	public int hashCode() {
		int result = movieList.hashCode();
		result = 31 * result + actorList.hashCode();
		return result;
	}

	public ArrayList<Actor> getActorList() {
		return this.actorList;
	}

	public ArrayList<Movie> getMovieList() {
		return this.movieList;
	}

	private ArrayList<String> getMovieNames() {
		ArrayList<String> movieNames = new ArrayList<>();
		for (Movie movie : this.movieList) {
			movieNames.add(movie.getName());
		}
		return movieNames;
	}

	public void addMovie(String name, String[] actors) {
		if (!this.getMovieNames().contains(name)) {
			ArrayList<Movie> movieList = new ArrayList<>();
			Movie newMovie = new Movie(name);
			movieList.add(newMovie);
			for (String actorName : actors) {
				Actor newActor = new Actor(actorName, movieList);
				newMovie.addActor(newActor);
				boolean added = false;
				for (Actor actor : this.actorList) {
					if (actorName.contentEquals(actor.getName())) {
						actor.addMovie(newMovie);
						added = true;
					}
				}
				if (!added)
					this.actorList.add(newActor);
			}
			this.movieList.add(newMovie);

		}
	}

	public void addRating(String name, double rating) {
		for (Movie movie : movieList) {
			if (movie.getName().equals(name)) {
				movie.setRating(rating);
			} else {
				continue;
			}
		}
	}

	public void updateRating(String name, double newRating) {
		this.addRating(name, newRating);
	}

	public String getBestActor() {
		String actorName = "";
		double averageRating = 0.0;

		for (Actor actor : actorList) {
			double totalRating = 0.0;
			for (Movie movie : actor.getMovies()) {
				totalRating += movie.getRating();
			}
			double average = totalRating / actor.getMovies().size();

			if (average > averageRating) {
				averageRating = average;
				actorName = actor.getName();
			}
		}
		return actorName;
	}

	public String getBestMovie() {
		double bestRating = 0.0;
		String movieName = "";
		for (Movie movie : this.movieList) {
			if (movie.getRating() > bestRating) {
				bestRating = movie.getRating();
				movieName = movie.getName();
			}
		}
		return movieName;
	}
}
