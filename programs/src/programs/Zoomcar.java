package programs;

import java.util.Scanner;

public class Zoomcar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Zoomcar e = new Zoomcar();
		System.out.println("days : ");
		int days =sc.nextInt();
		
		System.out.println(e.getCompanyname());
		System.out.println("rent fordays is: "+e.getrental(days));
		System.out.println("insurance amount  is  "+e.getInsurance());
	System.out.println("total cost  " +e.totalcost(e.getrental(days),e.getInsurance()));
	System.out.println(e.getwelcome());
	
		

	}
    String getCompanyname() {
    	return "Zoomcar Rentals";
    }
    double getrental(int days) {
    	double rent = 1500 *days;
    	return rent;
    }
    double getInsurance() {
    	double insurancefee = 500;
    	return insurancefee;
    }
    double totalcost(double rent,double insurancefee) {
    	double totalfee = rent +insurancefee;
    	return totalfee;
    	
    }
    String getwelcome() {
    	return "welcome to rentals ! enjoy your ride";
    }
    
}
