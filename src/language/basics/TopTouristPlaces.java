package language.basics;

import java.util.LinkedList;
import java.util.List;

public class TopTouristPlaces {

public static void main(String[] args) {
	
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

}
}
