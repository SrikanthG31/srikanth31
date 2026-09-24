package programs.LogicalStatements;

import java.util.Scanner;

public class StrongNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number what number u want check :");
		int n = sc.nextInt();
		 
		 
		
		
		
		int orginal = n;
		int sum =0 ;
	
		for(;n>0;n=n/10) {
			
			int r = n%10;
			sum = sum + isStrongNumber(r);
		}
		
		if(sum ==orginal) {
			System.out.println("it is a strong number");
		}else {
			System.out.println("it is not a strong number");
		}
		

	}

	static int  isStrongNumber(int n) {
	 int fact = 1;
	 for(int i = 1;i<=n;i++) {
		 
		 fact = fact *i;
		 
		 
	 }
		
		
		return fact;
		
		
	}

}
