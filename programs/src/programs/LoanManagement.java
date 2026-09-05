package programs;

import java.util.Scanner;

public class LoanManagement {
 String customerName;
 double loanamount;
 double inserstrate;
 int loantenure;
	public static void main(String[] args) {
		LoanManagement e = new LoanManagement();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your name");
		e. customerName = sc.next();
		System.out.println("enter your loanamount");
		 e. loanamount= sc.nextDouble();
		System.out.println("enter your insertarte");
		e. inserstrate= sc.nextDouble();
		System.out.println("enter the loantenure");
		e. loantenure = sc.nextInt();
		double simpleinserst = e.calculateInterest(e.loanamount,e. inserstrate);
		double totalamount = e.calculateTotalAmount(simpleinserst);
		double emi = e.calculaterMonthlyEMI(totalamount,e.loantenure);
		e.dispalyLoanSummary(simpleinserst,totalamount,emi);
		

	}
	double calculateInterest(double loanamount,double insertrate) {
		double simpleInterst = (loanamount*insertrate*loantenure)/100;
		return simpleInterst;
	}
   double calculateTotalAmount(double simpleInterest) {
	   double totalmount = simpleInterest + loanamount;
	   return totalmount;
   }
   double calculaterMonthlyEMI(double totalamount,int loantenure) {
	   double emi = totalamount/(loantenure * 12);
	   return emi;}
	   void  dispalyLoanSummary(double simpleInterst,double totalamount,double emi) {
		   System.out.println("customerName : " + customerName);
		   System.out.println("inserstrate : "+ inserstrate);
		   System.out.println("loantenure  : "+loantenure);
	   System.out.println("simple inserst : " + simpleInterst);
	   System.out.println("totalamount : " + totalamount);
	   System.out.println("emi : "+emi);
	   System.out.println("loanamount : " +loanamount);
	   
   }
}
