package programs.LogicalStatements;

import java.util.Scanner;

public class Fibonaaci2 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the number what nummber u want  :");
		int n = sc.nextInt();
		int result =findFibonacci(n);
		System.out.println(" the fibonacci "+ "of "+n+"th  " + "is  : "+result);

	}

 static int findFibonacci(int n) {
		int n1=0;
		int n2 =1;
		int n3 =0;
		if(n==1) {
			return n1;
			
		}
		if (n==2) {
			return n2;
		}
		for(int i =3;i<=n;i++) {
			n3=n1+n2;
			n1=n2;
			n2=n3;
		}
		return n2;
	
		
	}

}
