package programs.LogicalStatements;

import java.util.Scanner;

public class Primenumbers1 {
	
	
	
	
	
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number what nummber u want  :");
		int n = sc.nextInt();
		
		for(int i = 0 ;i<=n;i++) {
			if(isprime(i)) {
				System.out.print(i + " ");
			}
		}
		
		
		

	}

	static boolean isprime(int n) {
	   boolean prime = true;
	   if (n==0||n==1) {
		   return false;
	   }
	   for(int i=2;i<n;i++) {
		   
		   if(n%i==0) {
			   prime = false;
			   break;
		   }
	   }
	   return prime;
		
	}

}
