package language.basics;

public class Assignment8 {

	public static void main(String[] args) {
		
		int[] transac = {50000, -2000, 3000, -15000, -200, -300, 4000, -3000};
		
		int i = 0;
		int creditcount = 0;
		int debitcount = 0;
		int credittotal = 0;
		int debittotal = 0;
		int bal = 0;
		int suspiciousCount = 0;
		while (i<8) {
			int amount = transac[i];
			
			System.out.println(amount);
			
			if(amount>0) {
				creditcount = creditcount +1;
				credittotal = credittotal + amount;
			} else {
				debitcount = debitcount +1;
				debittotal = debittotal +amount;
			}
			
			bal = bal+amount;
			
			if(amount > 10000 || amount < -10000) {
				System.out.println("Suspicious amount" +amount);
				
				suspiciousCount = suspiciousCount +1;
				
			}
			
			i = i+1;
		}
		System.out.println("Total credit transactions:" +creditcount);
		System.out.println("Total debit transactions:" +debitcount);
		System.out.println("Total credit amount:" +credittotal);
		System.out.println("Total debit amount:" +debittotal);
		System.out.println("final balance:" +bal);
		System.out.println("Total number of suspicious transactions:" +suspiciousCount);
		}
	}
