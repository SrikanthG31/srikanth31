package programs;

import java.util.Scanner;

public class methods5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter first number ");
		int num1 = sc.nextInt();
		System.out.println("enter second number");
		int num2 = sc.nextInt();
		System.out.println("enter your factorialnumber");
		int fnum = sc.nextInt();
		System.out.println("enter even number");
		int evennum = sc.nextInt();
		System.out.println("prime number enter plz");
		int primen = sc.nextInt();
		System.out.println("enter the exponent");
		int exp = sc.nextInt();
		System.out.println("enter the base");
		int base = sc.nextInt();
		modulas(num1, num2);
		factorial(fnum);
		evennumber(evennum);
		primenumber(primen);
		power(base, exp);
		

	}
	static void modulas(int num1,int num2) {
		if(num2 !=0) {
		 int remainder = num1 % num2;
		 System.out.println("the remainder :"+ remainder);
			
		}else {
			System.out.println("not possible");
		}
	}
	static void factorial(int factorialnumber) {
		int factorial =1;
		for(int i=1;i<=factorialnumber;i++) {
			factorial = factorial*i;}
			System.out.println("factorial  : " +factorial);
		
	}
	static void evennumber(int evennum) {
		if(evennum% 2==0) {
			System.out.println("it is even number");
		}else {
			System.out.println("it is odd number");
		}
	}
	static void primenumber (int primen) {
		int counter=0;
		if(primen<= 1) {
			System.out.println("its not prime number");
			return;
		}
		for(int i = 1;i<=primen;i++) {
			if(primen%i==0) {
				counter++;
			}
			}
		if(counter==2) {
			System.out.println("it is prime number");
				
		}else {
			System.out.println("it is not a prime number");
		}
	}
	static void power (int base,int exp) {
		int result=1;
		for(int i = 1;i<=exp;i++) {
			result =result *base;
		}
		System.out.println("power is  "+result);
	}

}
