package programs.LogicalStatements;

import java.util.Scanner;

public class Fibonacci {

	
	static void findFibonacci(int n){
		int n1 =0;
		int n2=1 ;
		int n3 =0;
		System.out.print(n1 + " " + n2);
		
		for(int i =0;i<=n - 2;i++) {
			n3 =n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("enter the number what nummber u want  :");
		int n = sc.nextInt();
		findFibonacci(n);
		sc.close();
		

	}

}
