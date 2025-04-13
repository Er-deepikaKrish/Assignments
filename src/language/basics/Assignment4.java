package language.basics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Assignment4 {

	public static void main(String[] args) {
		
		System.out.println("Famous areas in 5 cities");

		
		//////1. Popular/Famous areas in 5 cities
		List<String> popularAreasChennai = new ArrayList<String>();
		
		//Chennai
		popularAreasChennai.add("Tnagar");
		popularAreasChennai.add("Vadapalani");
		popularAreasChennai.add("Koyembed");
		popularAreasChennai.add("Marina beach");
		popularAreasChennai.add("Paris Corner");
				

		List<String> popularAreasCoimbatore = new ArrayList<String>();
		
		//Coimbatore
		popularAreasCoimbatore.add("Race Course");
		popularAreasCoimbatore.add("Gandhi Puram");
		popularAreasCoimbatore.add("Saravanampatti");
		popularAreasCoimbatore.add("Avinashi Road");
		popularAreasCoimbatore.add("RS Puram");
		
		
		List<String> popularAreasBangalore = new ArrayList<String>();
		//Bangalore   --->3rd city
		popularAreasBangalore.add("HSR Layout");
		popularAreasBangalore.add("White Field");
		popularAreasBangalore.add("Koramangala");
		popularAreasBangalore.add("Indira Nagar");
		popularAreasBangalore.remove("Jaya Nagar");
		
		List<String> popularAreasHyderabad = new ArrayList<String>();
		
		//Hyderabad   --->4th city
		popularAreasHyderabad.add("Tirupati");
		popularAreasHyderabad.add("Kondapur");
		popularAreasHyderabad.add("Jubilee Hills");
		popularAreasHyderabad.add("Banjara Hills");
		popularAreasHyderabad.remove("HITEC City");

		List<String> popularAreasCochin = new ArrayList<String>();
		//Cochin
		popularAreasCochin.add("Eroor");
		popularAreasCochin.add("Kaloor");
		popularAreasCochin.add("Chottanikkara");
		popularAreasCochin.add("Vazhakkala");
		popularAreasCochin.remove("Kadavanthra");
		
		System.out.println(("Cities of Bangalore and Hyderabad : "+popularAreasBangalore +popularAreasHyderabad)) ;
		System.out.println("********************");
		System.out.println();
		//////2. Top 10 tourist places

		System.out.println("Top 10 tourist places");
		List<String> touristPlaces = new LinkedList<String>();
		touristPlaces.add("Taj Mahal");
		touristPlaces.add("Niagara Falls");
		touristPlaces.add("Burj Khalifa");
		touristPlaces.add("Paris");
		touristPlaces.add("Pyramids of Egypt");
		touristPlaces.add("New York");
		touristPlaces.add("Sydney");
		touristPlaces.add("London");
		touristPlaces.add("Colosseum");
		touristPlaces.remove("Eiffel Tower");
		System.out.println("Size of the LinkedList is :"+touristPlaces.size());
		System.out.println(touristPlaces);	
		System.out.println("********************");
		System.out.println();
		
		////Average of 5 and 6 
		System.out.println("Average of 5th and 6th number");
	
		int [] numbers = {100, 226, 350, 470, 760, 865, 125, 200, 986, 104 };
		
		int fifth = numbers[4];
		int sixth = numbers[5];
		double avgvalue = (fifth+sixth)/2.0;
		System.out.println("Avg of 5th and 6th value  "+avgvalue);
		System.out.println("********************");
		System.out.println();
		
	//////4. Top 5 highest grossing movies

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
