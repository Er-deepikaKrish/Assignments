package language.basics;

import java.util.HashMap;
import java.util.Map;

public class Assignment6 {

	public static void main(String[] args) {
		
		/*Create two arrays to store student names ["Suresh","Mahesh","Naresh"] and
marks [75, 80, 82] Add 10 marks to each students using assignment operators and
store it into another array, after adding 10 marks identify the average marks of all
students*/
		
		String[] student =  {"Suresh","Mahesh","Naresh"};
		
		int[] marks = {75, 80, 82};
		
		marks[0] = marks[0] + 10;
		marks[1] = marks[1] + 10;
		marks[2] = marks[2] + 10;
		
		Map<String,Integer> students = new HashMap<String,Integer>();
		students.put("student[0]", marks[0]);
		students.put("student[1]", marks[1]);
		students.put("student[2]", marks[2]);
		
		System.out.println("values:" +students);
		
		System.out.println("Updates Marks:");
		
		System.out.println(student[0] +" : "+students.get("student[0]"));

		System.out.println(student[1] +" : "+students.get("student[1]"));
		
		System.out.println(student[2] +" : "+students.get("student[2]"));
		
		
		
		//************************calculate average************************

		int total = marks[0] + marks[1]+ marks[2];
		double average = total/3.0;
		System.out.println("Average marks: "+average);
		
		
		
		
		
		
		
		

	}

}
