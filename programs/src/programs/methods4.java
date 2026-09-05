package programs;

import java.util.Scanner;

public class methods4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("enter your balance");
		double balance = sc.nextDouble();
		
		System.out.println("desposit");
		double desposit = sc.nextDouble();
		
		System.out.println("withdrawmoney");
		double wamount = sc.nextDouble();
		System.out.println("transfermoney");
		double amount = sc.nextDouble();
		
		System.out.println("inserst rate");
		double rate = sc.nextDouble();
		
		System.out.println("loan amount");
		double loanAmount = sc.nextDouble();
		System.out.println("annual rate");
		double annualrate = sc.nextDouble();
		System.out.println("tenureyears ");
		double tenureyears = sc.nextDouble();
		System.out.println("enter your pin");
		double pin = sc.nextDouble();
		System.out.println("validate pin");
		double validte = sc.nextDouble();
		System.out.println("enter newpin");
		double newpin = sc.nextDouble();
		
		System.out.println("active or in active");
		boolean active = sc.nextBoolean();
		checkBalance(balance);
		depositmoney(desposit, balance);
		transferAmount(loanAmount, balance);
		tocalculateinterset(balance, annualrate);
        generateotp(0);
        isAccountActive(active);
	}
	
	static void checkBalance(double balance) {
		System.out.println("Balance : " +balance );
	}
	static void depositmoney(double depositMoney,double balance) {
		if(depositMoney>0) {
		 balance = balance + depositMoney;
		 System.out.println("balnce"+ balance);
		}else {
			System.out.println("invaild");
		}
	}
	static void transferAmount(double amount ,double balance) {
		if(amount <= balance) {
			double remainingbalance = balance - amount ;
			System.out.println("remaining amouint"+remainingbalance);
		}else {System.out.println("not possible");}
	}
    static void tocalculateinterset(double balance,double rate) {
    	double interset = balance+ rate/100;
    	System.out.println("interset"+interset);
    }
    static void generateotp(long accountnumber) {
    	int otp = (int) (10000 +Math.random()*900000);
    	System.out.println("otp"+ otp);
    	
    }
    static void  isAccountActive(boolean active) {
    	if(active) {
    		System.out.println("account is active");
    	}else {
    		System.out.println("account is inactiuve");
    	}
    }
}
