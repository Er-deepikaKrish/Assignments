package language.basics;

public class Assignment2 {

	public static void main(String[] args) {
				

		String [] semester = new String [5];
		
		semester[0] = "Sem1";
		semester[1] = "Sem2";
		semester[2] = "Sem3";
		semester[3] = "Sem4";
		semester[4] = "Sem5";

		String [][] subjects = new String [5][6];
		subjects[0][0] = "Mathematics I";
		subjects[0][1] = "Physics";
		subjects[0][2] = "Chemistry";
		subjects[0][3] = "Computer Programming";
		subjects[0][4] = "Engineering Drawing Basic Electrical Eng.";
		subjects[0][5] = "Electrical Eng.";
		subjects[1][0] = "Mathematics II";
		subjects[1][1] = "Mechanics";
		subjects[1][2] = "Environmental Sci.";
		subjects[1][3] = "Basic Electronics";
		subjects[1][4] = "Engineering Physics";
		subjects[1][5] = "Engineering Graphics";
		subjects[2][0] = "Data Structures";
		subjects[2][1] = "Discrete Mathematics";
		subjects[2][2] = "Digital Electronics";
		subjects[2][3] = "Operating Systems";
		subjects[2][4] = "Signals and Systems";
		subjects[2][5] = "Object-Oriented Prog.";
		subjects[3][0] = "Algorithms";
		subjects[3][1] = "Computer Networks";
		subjects[3][2] = "Database Systems";
		subjects[3][3] = "Microprocessors";
		subjects[3][4] = "Communication Eng.";
		subjects[3][5] = "Software Engineering";
		subjects[4][0] = "Probability & Stats";
		subjects[4][1] = "Probability & Stats";
		subjects[4][2] = "Compiler Design ";
		subjects[4][3] = "Theory of Computation";
		subjects[4][4] = "Embedded Systems";
		subjects[4][5] = "Computer Graphics";
	//Print Semester 2 Subject 4 and Subject 5 names.
		
		System.out.println("Semester 2 Subject 4 is " + subjects[1][3]);
		
		System.out.println("Semester 2 Subject 5 is " + subjects[1][4]);
		
		String [][][] marks = new String [5][6][6];
			
		
		marks[0][0][0] = "Pass(78)";
		
		marks[0][1][1] = "Pass(85)";
		
		marks[0][2][2] = "Fail(21)";
		
		marks[0][3][3] = "Pass(74)";
		
		marks[0][4][4] = "Pass(88)";
		
		marks[0][5][5] = "Pass(79)";
		
		marks[1][0][0] = "Pass(82)";
	
		marks[1][1][1] = "Pass(77)";
		
		marks[1][2][2] = "Pass(93)";
	
		marks[1][3][3] = "Fail(19)";
		
		marks[1][4][4] = "Fail(24)";
	
		marks[1][5][5] = "Pass(90)";
		
		marks[2][0][0] = "Pass(88)";
		
		marks[2][1][1] = "Pass(81)";
		
		marks[2][2][2] = "Pass(76)";
	
		marks[2][3][3] = "Fail(32)";
		
		marks[2][4][4] = "Pass(85)";
	
		marks[2][5][5] = "Pass(78)";
		
		marks[3][0][0] = "Pass(91)";
		
		marks[3][1][1] = "Pass(73)";
		
		marks[3][2][2] = "Fail(19)";
	
		marks[3][3][3] = "Pass(80)";
		
		marks[3][4][4] = "Pass(76)";
	
		marks[3][5][5] = "Pass(87)";
		
		marks[4][0][0] = "Pass(86)";
		
		marks[4][1][1] = "Pass(88)";
		
		marks[4][2][2] = "Pass(84)";
	
		marks[4][3][3] = "Pass(95)";
		
		marks[4][4][4] = "Pass(73)";
	
		marks[4][5][5] = "Pass(90)";
		
		
		//Print the Status/Marks of Semester 4 Subject 3 and Subject 6.
			
			
		/*marks[3][2][2] = "Fail(19)";
		  marks[3][5][5] = "Pass(87)";*/
			
			System.out.println("The Status/Marks of Semester 4 Subject 3 is " + marks[3][2][2]);
			
			System.out.println("The Status/Marks of Semester 4 Subject 6 is " + marks[3][5][5]);
			
			//****************************
			
			System.out.println();
			
            System.out.println((subjects[3][2])+" - " +(marks[3][2][2]));
			
			System.out.println((subjects[3][5])+" - " + (marks[3][5][5]));
			
			
	

	}

}
