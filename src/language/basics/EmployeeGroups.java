package language.basics;


public class EmployeeGroups {

	public static void main(String[] args) {
		
		
	Assignment3 obj = new Assignment3();
		
		String[] empNames = new String[3];
		empNames[0] = obj.empName1;
		empNames[1] = obj.empName2;
		empNames[2] = obj.empName3;

		int[] empIDs = new int[3];
		empIDs[0] = obj.empID1;
		empIDs[1] = obj.empID2;
		empIDs[2] = obj.empID3;

	
		System.out.println(empNames[0] + " , " + empIDs[0]);

		System.out.println(empNames[1] + " , " + empIDs[1]);

		System.out.println(empNames[2] + " , " + empIDs[2]);
	
		
	}

}
