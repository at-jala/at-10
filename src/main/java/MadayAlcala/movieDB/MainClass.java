package main.java.MadayAlcala.movieDB;


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
		String path = "C:\\Users\\osa\\Desktop\\At-10\\at-10\\src\\main\\java\\MadayAlcala\\movieDB";
		//Add all the movies in the file movies.txt. 
		try (BufferedReader br = new BufferedReader(new FileReader(path + "\\movies.txt"))) {
		    String line;
		    while ((line = br.readLine()) != null) {
		        String actorName = getValue(line, ",", 0);
		        //System.out.println(actorName);
		    	movieDB.addActor(actorName, getMoviesArray(line));		    	
		    }		    
		}
		catch(IOException e){
			System.err.print(e);
		}
		
		//Add the ratings for the movies of rating.txt.
		try (BufferedReader br = new BufferedReader(new FileReader(path + "\\ratings.txt"))) {
		    String line;
		    while ((line = br.readLine()) != null) {
		    	
		        String movieName = getValue(line, "\t", 0);	
		        if (!movieName.equals("movie_name")) {
		    		double raiting = Double.valueOf(getValue(line, "\t", 1));
		    		movieDB.addRating(movieName, raiting);
		    		String[] movies = new String[] {"movie1", "movie2"};
		    		movieDB.addActor("actor1", movies);
		    		movieDB.addRating("movie1", 10);
		    		movieDB.addRating("movie2", 7);
		    		}		    	
		    }
		}
		catch(IOException e){
			System.err.print(e);
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
