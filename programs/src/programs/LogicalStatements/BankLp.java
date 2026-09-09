package programs.LogicalStatements;

import java.util.Scanner;

public class BankLp {
  double balance = 20000 ;
  double dAmount;
  double wAmount;
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	BankLp e = new BankLp();
	System.out.println("enter your deposit amount : ");
	e.dAmount = sc.nextDouble();

	e.deposit();

	System.out.println("enter your withdraw amount : ");
	e.wAmount = sc.nextDouble();
	e.withdraw();
	e.checkBlance();
		sc.close();
		

	}
    void checkBlance() {
    	System.out.println("blance : " + balance);
    	
    }
    void deposit() {
    	if(dAmount <100000) {
    		
    	      balance = balance+dAmount;
    	      System.out.println("totalbalnce" +balance);
    			checkBlance();
    		}else {
    			System.err.println("overlimit money plz enter vaild money");
    			checkBlance();
    		}}
    	void withdraw() {
    		if(wAmount <balance) {
    			
    		      balance = balance-wAmount;
    		      System.out.println("totalbalance" + balance);
    				checkBlance();
    			}else {
    				System.err.println("overlimit money plz enter vaild money");
    				checkBlance();
    			}
    	
    }
}
