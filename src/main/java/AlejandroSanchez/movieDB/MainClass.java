package main.java.AlejandroSanchez.movieDB;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MainClass {
	private String name;
	private String[] movies;

	/*
	 * Main method
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException {
		//Create a new instance of a movieDatabase.
		MovieDatabase movieDB = new MovieDatabase();
		
		//Add all the movies in the file movies.txt.
		try (BufferedReader br = new BufferedReader(new FileReader("c:\\_pg\\GitRoot\\at-10\\src\\main\\java\\AlejandroSanchez\\movieDB\\movies.txt"))) {
		    String line;
		    while ((line = br.readLine()) != null) {
		        String actorName = getValue(line, ",", 0); 
		    	movieDB.addActor(actorName, getMoviesArray(line));
		    }
		}
		
		//Add the ratings for the movies of rating.txt.
		try (BufferedReader br = new BufferedReader(new FileReader("c:\\_pg\\GitRoot\\at-10\\src\\main\\java\\AlejandroSanchez\\movieDB\\ratings.txt"))) {
		    String line;
		    while ((line = br.readLine()) != null) {
		    	
		        String movieName = getValue(line, "\t", 0);		    	
		    	if (!movieName.equals("movie_name")) {
		    		double rating = Double.valueOf(getValue(line, "\t", 1));
		    		
		    		movieDB.addRating(movieName, rating);	
				}		    	
		    }
		}
		
		//print out the name of the best actor 
		System.out.println("The best Actor is: " + movieDB.getBestActor());
		
		//print out the name of the highest rated movie
		System.out.println("The best Movie is: " + movieDB.getBestMovie());
		
	}

	private static String getValue(String line, String separator, int index) {
		return line.split(separator)[index].trim();		
	}
	
	private static String[] getMoviesArray(String line) {
		String[] aux = line.split(",");
		String[] result = new String[aux.length-1];
		for (int i = 1; i < aux.length; i++) {
			result[i - 1] = aux[i].trim();
		}
		
		return result;
	}
}
