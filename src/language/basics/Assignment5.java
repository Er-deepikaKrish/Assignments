package language.basics;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Assignment5 {

	public static void main(String[] args) {
	
 //*********************************STUDENT TABLE******************************************************
		
		Map<String,String> firststudent = new HashMap<String,String>();
		firststudent.put("Name","John Doe");
		firststudent.put("Age","20");
		firststudent.put("Gender","Male");
		firststudent.put("Roll Number","S12345");
		firststudent.put("Grade","A");
		firststudent.put("Major","Computer Science");
		firststudent.put("GPA","3.8");
		firststudent.put("Email","john@example.com");
		firststudent.put("Contact Number","9876543210");	
		firststudent.put("Address","123 Elm St");
		

		Map<String,String> secondstudent = new HashMap<String,String>();
		secondstudent.put("Name","Jane Smith");
		secondstudent.put("Age","21");
		secondstudent.put("Gender","Female");
		secondstudent.put("Roll Number","S12346");
		secondstudent.put("Grade","B");
		secondstudent.put("Major","Mathematics");
		secondstudent.put("GPA","3.5");
		secondstudent.put("Email","jane@example.com");
		secondstudent.put("Contact Number","9876543211");	
		secondstudent.put("Address","456 Oak St");
		
		

		Map<String,String> thirdstudent = new HashMap<String,String>();
		thirdstudent.put("Name","Mike Brown");
		thirdstudent.put("Age","22");
		thirdstudent.put("Gender","Male");
		thirdstudent.put("Roll Number","S12347");
		thirdstudent.put("Grade","A");
		thirdstudent.put("Major","Physics");
		thirdstudent.put("GPA","3.9");
		thirdstudent.put("Email","mike@example.com");
		thirdstudent.put("Contact Number","9876543212");	
		thirdstudent.put("Address","789 Pine St");
		
		
		List<Map<String,String>> students = new ArrayList<Map<String,String>>();
		students.add(firststudent);
		students.add(secondstudent);
		students.add(thirdstudent);
		
		//System.out.println(students.get(1)); //Second row student
		
		
		
		
		//********************************EMPLOYEE TABLE*************************************************************
		
		Map<String,String> firstemployee = new HashMap<String,String>();
		firstemployee.put("Employee ID","E001");
		firstemployee.put("Name","Alice Green");
		firstemployee.put("Age","30");
		firstemployee.put("Gender","Female");
		firstemployee.put("Department","Engineering");
		firstemployee.put("Position","Software Engineer");
		firstemployee.put("Salary","75000");
		firstemployee.put("Email","alice@example.com");
		firstemployee.put("Contact Number","9876543213");
		

		Map<String,String> secondemployee = new HashMap<String,String>();
		secondemployee.put("Employee ID","E002");
		secondemployee.put("Name","Bob Johnson");
		secondemployee.put("Age","35");
		secondemployee.put("Gender","Male");
		secondemployee.put("Department","Marketing");
		secondemployee.put("Position","Marketing Manager");
		secondemployee.put("Salary","85000");
		secondemployee.put("Email","bob@example.com");
		secondemployee.put("Contact Number","9876543214");
		
		
		Map<String,String> thirdemployee = new HashMap<String,String>();
		thirdemployee.put("Employee ID","E003");
		thirdemployee.put("Name","Carol White");
		thirdemployee.put("Age","28");
		thirdemployee.put("Gender","Female");
		thirdemployee.put("Department","Sales");
		thirdemployee.put("Position","Sales Executive");
		thirdemployee.put("Salary","65000");
		thirdemployee.put("Email","carol@example.com");
		thirdemployee.put("Contact Number","9876543215");
		
		
		List<Map<String,String>> employeelist = new ArrayList<Map<String,String>>();
		employeelist.add(firstemployee);
		employeelist.add(secondemployee);
		employeelist.add(thirdemployee);
		
		//System.out.println(employeelist.get(0)); //first row details 
		
		//***********************************PRODUCT TABLE*******************************************************
		
		Map<String,String> firstproduct = new HashMap<String,String>();
		firstproduct.put("Product ID","P001");
		firstproduct.put("Name","Laptop");
		firstproduct.put("Category","Electronics");
		firstproduct.put("Price","$1200");
		firstproduct.put("Stock Quantity","50");
		firstproduct.put("Supplier","Tech Supplies");
		firstproduct.put("Warranty","2 years");
		firstproduct.put("Rating","4.5");
		firstproduct.put("Manufacturing Date","1/15/2023");	
		firstproduct.put("Expiry Date","1/15/2025");
		
		Map<String,String> secondproduct = new HashMap<String,String>();
		secondproduct.put("Product ID","P002");
		secondproduct.put("Name","Desk Chair");
		secondproduct.put("Category","Furniture");
		secondproduct.put("Price","$150");
		secondproduct.put("Stock Quantity","100");
		secondproduct.put("Supplier","Office Depot");
		secondproduct.put("Warranty","1 year");
		secondproduct.put("Rating","4");
		secondproduct.put("Manufacturing Date","2/10/2023");	
		secondproduct.put("Expiry Date","N/A");
		
		Map<String,String> thirdproduct = new HashMap<String,String>();
		thirdproduct.put("Product ID","P003");
		thirdproduct.put("Name","Coffee Maker");
		thirdproduct.put("Category","Kitchen");
		thirdproduct.put("Price","$75");
		thirdproduct.put("Stock Quantity","100");
		thirdproduct.put("Supplier","KitchenWorld");
		thirdproduct.put("Warranty","2 years");
		thirdproduct.put("Rating","4.2");
		thirdproduct.put("Manufacturing Date","3/20/2023");	
		thirdproduct.put("Expiry Date","6 months");
		
		List<Map<String,String>> products = new ArrayList<Map<String,String>>();
		products.add(firstproduct);
		products.add(secondproduct);
		products.add(thirdproduct);
		
		//System.out.println("product details :" +products.get(1));  //second product details
		
		Map<String, List<Map<String,String>>> productspecific = new HashMap<String, List<Map<String,String>>>();
		
		productspecific.put("Studentdetails", students);
		productspecific.put("Employeedetails", employeelist);
		productspecific.put("Productdetails", products);

		
		System.out.println(productspecific.get("Productdetails").get(1).get("Supplier"));
		

		
	}

}
