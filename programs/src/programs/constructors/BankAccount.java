package programs.constructors;

public class BankAccount {
double accountNumber;
String accountHolderName;
double balance;
String branch;

 
	BankAccount(double accountNumber, String accountHolderName, double balance, String branch) {

	this.accountNumber = accountNumber;
	this.accountHolderName = accountHolderName;
	this.balance = balance;
	this.branch = branch;
}


	public BankAccount(BankAccount obj,double balance,String branch) {
		this.accountNumber =obj.accountNumber;
		this.accountHolderName =obj.accountHolderName;
		this.balance = balance;
		this.branch =branch;
	}


	public static void main(String[] args) {
	BankAccount obj = new BankAccount(243134554, "srikanth", 300000, "kphb");
	obj.display();
    BankAccount obj1 = new BankAccount(obj,10000,"kukatapally");
    obj1.display();
	}
	void display() {
		System.out.println("accountnumber : " + accountNumber);
		System.out.println("accounthaolder name : " + accountHolderName);
		System.out.println("balance : " + balance);
		System.out.println("branch : " + branch);
		System.out.println("-------------------------------------------------------");
	}

}
