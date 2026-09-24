package programs.LogicalStatements;

import java.util.Scanner;

public class Sumofdigits {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number your want to check");
		int n = sc.nextInt();
		
		number(n);
		

	}

static void number(int n) {
	int sum = 0;
	int postion = 0 ;
	
	for(;n>0; n=n/10) {
		int rem = n%10;
		if (postion%2 ==0) {
			sum = sum+rem;
		}
		postion++;
	}
		System.out.println("the sum : " + sum);
	
		
	}

}
