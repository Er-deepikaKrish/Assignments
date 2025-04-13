package language.basics;

import java.util.ArrayList;
import java.util.List;

public class Top5Movies {

	public static void main(String[] args) {

		System.out.println("Top 5 highest grossing movies");
		List<String> topMovies = new ArrayList<String>();
		topMovies.add("LEO");
		topMovies.add("2.0");
		topMovies.add("JAILER");
		topMovies.add("Bahubali");
		topMovies.add("Pushpa");
		
		System.out.println("Top 5 movies : "+topMovies.get(2));
	}

}
