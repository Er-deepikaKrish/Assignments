package language.basics;

public class Assigment7_LoopsPractice {
	
	public static void main(String[] args) {
		
	int crdscore = 650; 
	boolean employmentstatus = true;
	double debt = 39.5; 
	double salary = 50000.0;
	//Approved with credit score
	if(crdscore>720) 
	{
	 System.out.println("Loan approved with: "+ crdscore);
	} 
	else if (crdscore >=650) {   //Additional checks when credit score less than 720
		
		System.out.println(crdscore +" :Credit score is low");	
		if(salary>=50000) {    //salary check
			if(employmentstatus == true) {  //employment check
				if(debt < 40.00) { 	//debt check
					
					System.out.println("Loan approved with debt status: "+debt);
				}else {
					System.out.println("debt not met: "+debt);
				}
			}
				else {
					System.out.println("unemployment: "+employmentstatus);
				}
		}
				else {
					System.out.println("salary not met: "+salary);
				}
	}
			else {
				System.out.println("Credit score not met: "+crdscore);
				}
			}

	
}
 

		

	

