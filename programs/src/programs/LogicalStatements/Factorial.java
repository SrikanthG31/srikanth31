package programs.LogicalStatements;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the number :");
		int n = sc.nextInt();
            long fn = findFactorial(n);
System.out.println("factorial : "+fn);
	}

	
	static long findFactorial(int n) {
		long sum =1;
		for(int i = n; i >=1;i--) {
			sum = sum *i;
		}
		
		
		
		return sum;
		
	}
}
