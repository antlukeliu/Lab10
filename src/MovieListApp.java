import java.util.ArrayList;
import java.util.Collections;

public class MovieListApp {
	
	public static void main(String[] args) {
			
		System.out.println("Welcome to the Movie List Application");
		boolean cont = true;
		MovieValid val = new MovieValid();
		
		do{
			//Creates the Movie arraylist 
			ArrayList<Movie> MovieL = getMovieIO();
			
			//Arraylist to hold the the titles a user has selected
			ArrayList<String> sortedMovie = new ArrayList<String>();
			String input = val.Validate();
			
			//fills arraylist based on user input
			for(Movie m: MovieL){
				if(m.getCategory().equalsIgnoreCase(input)){
					sortedMovie.add(m.getTitle());}
			}		
			
			Collections.sort(sortedMovie);
			
			//prints out titles of the genre the user selected
			for (String d: sortedMovie){
				System.out.println(d.toString());}
			
			char resp = val.YesOrNo();
			cont = val.loopingAgain(resp);
			
		}while(cont);
		val.exitting(cont);
	}
	
	//method to create the arraylist
	public static ArrayList<Movie> getMovieIO(){
		
		ArrayList<Movie> movieL = new ArrayList<Movie>();
		
		movieL.add(new Movie("Good Will Hunting", "drama"));
		movieL.add(new Movie("Conjuring", "horror"));
		movieL.add(new Movie("Wall-E", "animated"));
		movieL.add(new Movie("Up", "animated"));
		movieL.add(new Movie("Star Wars", "scifi"));
		movieL.add(new Movie("E.T.", "scifi"));
		movieL.add(new Movie ("Paranormal Activity", "horror"));
		movieL.add(new Movie("100 Days of Summer", "drama"));
		movieL.add(new Movie("Finding Nemo", "animated"));
		movieL.add(new Movie("Forrest Gump", "drama"));
			
		for (int i=1; i<=100; i++){
			movieL.add(MovieListIO.getMovie(i));
		}
		return movieL;
	} 
}
