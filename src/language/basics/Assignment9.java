package language.basics;

import java.util.HashMap;
import java.util.Map;

public class Assignment9 {

	public static void main(String[] args) {
		String[] names = {"Alice Johnson", "Bob Smith", "Carol Davis", "David Brown", "Eva Green"};
		double[] basepay = {75000, 68000, 82000, 90000, 60000};
		double[] exp = {5.1, 3.2, 7.1, 10.2, 2.4};
		double[] rating = {4.2, 3.8, 4.5, 2.5, 3.5};
		
		
		Map<String, Double> hikemap = new HashMap();
		
		for (int i=0; i<5; i++) {
			double variablepaypercentage;
			int bonus;
			int reward = 0;
			
			if(rating[i] >=4.0) {
				variablepaypercentage = 15.0;
				bonus=1500;
				} else if (rating[i] >=3.0) {
					variablepaypercentage = 10.0;
					bonus = 1200;	
				} else {
					variablepaypercentage = 3.0;
					bonus = 300;
				}
			if (exp[i] >=5.0) {
				reward = 5000;
				
			}
			double hike = (basepay[i] * variablepaypercentage/100)+ bonus + reward;
			
			double hikepercent = (hike/basepay[i])*100;
			
			hikemap.put(names[i], hikepercent);
							
		}
		
		for (int i=0; i<5; i++) {
			double value = hikemap.get(names[i]);
			
			System.out.printf("%s = %.2f%%\n", names[i], value);
		}
		
		
	}

}
