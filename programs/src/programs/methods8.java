package programs;

import java.util.Scanner;

public class methods8 {

	void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter amount : ");
		double amount = sc.nextDouble();
		double discountamount = getdiscountonshopping(amount);
		System.out.println("discountamount" + discountamount);
		
		
		

	}
	double getdiscountonshopping(double amount) {
		if(amount>3000) {
			System.out.println(" get 5% discount");
			double discount = amount * 5 / 100;
			return discount;
		}else {
			System.out.println("no discount");
		}
		return 0;
	}

}
