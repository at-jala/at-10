package limbertVargas;

import java.util.*;

public class Movie implements Comparable<Movie> {
	private String name;
	private ArrayList<Actor> actors;
	private double rating;

	public Movie(String name) {
		this.actors = new ArrayList<>();
		this.name = name;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}

		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		Movie movie = (Movie) o;

		if (Double.compare(movie.rating, rating) != 0) {
			return false;
		}
		return name.equals(movie.name);
	}

	@Override
	public int hashCode() {
		int result;
		long temp;
		result = name.hashCode();
		temp = Double.doubleToLongBits(rating);
		result = 31 * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public int compareTo(Movie that) {
		return this.getName().compareTo(that.getName());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Actor> getActor() {
		return actors;
	}

	private ArrayList<String> getActorNames() {
		ArrayList<String> actorNames = new ArrayList<>();
		for (Actor actor : this.actors) {
			actorNames.add(actor.getName());
		}
		return actorNames;
	}

	public void addActor(Actor actor) {
		if (!this.getActorNames().contains(actor.getName())) {
			this.actors.add(actor);
		}
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}
}
