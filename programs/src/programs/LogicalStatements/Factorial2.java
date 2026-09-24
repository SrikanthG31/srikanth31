package programs.LogicalStatements;

import java.util.Scanner;

public class Factorial2 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the number :");
		int n = sc.nextInt();
            long fn = findFactorial(n);
System.out.println("factorial : "+fn);
	}

	 static long findFactorial(int n) {
		if(n==0 || n==1) {
		return 1;
	}
		

return n* findFactorial(n-1);
	}}


