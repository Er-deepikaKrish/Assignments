package language.basics;

import java.util.ArrayList;
import java.util.List;

public class A4_FamousAreas {
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
		
		//Cochin
		List<String> popularAreasCochin = new ArrayList<String>();
		
		popularAreasCochin.add("Eroor");
		popularAreasCochin.add("Kaloor");
		popularAreasCochin.add("Chottanikkara");
		popularAreasCochin.add("Vazhakkala");
		popularAreasCochin.remove("Kadavanthra");
		
		System.out.println(("Cities of Bangalore and Hyderabad : "+popularAreasBangalore +popularAreasHyderabad)) ;


}
}
