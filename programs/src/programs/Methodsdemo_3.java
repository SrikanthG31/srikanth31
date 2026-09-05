package programs;

import java.util.Scanner;

public class Methodsdemo_3 {
	double balance = 5000.00;
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("main method started");
		Methodsdemo_3 obj1 = new Methodsdemo_3();
		System.out.println("enter the amount :");
		double amount = sc.nextDouble();
		obj1.depositMoney(amount);
		System.out.println("withdraw money : ");
		double Wamount = sc.nextDouble();
		obj1.withdrawAmount(Wamount);
		System.out.println("main method ended");
		
}
	void checkBankAccount() {
		System.out.println("account balance : "+ balance);}
		void depositMoney(double amount ) {
			if(amount >0 ) {
				balance = balance+amount;
			checkBankAccount();
			}else {
				System.out.println("invaild amount ");
			}}
			void withdrawAmount(double Wamount) {
				if(Wamount<balance) {
					balance = balance - Wamount;
					checkBankAccount();}
				else {
					System.out.println("invaid balance");}
				}
			
			
		}
	
	
