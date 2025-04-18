package language.basics;

public class Assignment7 {

	public static void main(String[] args) {
	
		int creditscore = 640;
		int salary = 49000;
		double debtratio = 40.00;
		int minsalary = 50000;
			
		if(creditscore>=750) {  //If the credit score is above 750, the loan is automatically approved
			System.out.println("Loan is approved credit score: "+ creditscore);
		}
			else {
			if(creditscore<=650) {
				System.out.println(creditscore +" Credit score is low");	   
						
						if(salary>=50000) {
							System.out.println("salary Loan is approved");
							System.out.println("score: "+ creditscore +" and salary:"+salary); 
						}
						else {
						if(debtratio >= 40.00)
						{
							System.out.println("debtratio Loan is approved");	
						}
				else
						System.out.println("debtratio Loan is not approved");
					
						}
			}
			
						else
						System.out.println("Loan is not approve");
						System.out.println("Loan is not approved "+ "creditscore:" + creditscore +" salary "+salary +" debtratio "+debtratio);
			}
							
						}
	}

				
		
	

