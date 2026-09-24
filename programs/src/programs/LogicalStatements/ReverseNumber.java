package programs.LogicalStatements;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number what number u want check :");
		int n = sc.nextInt();
       int result= reversenumber(n);
		if (result == n ) {
			System.out.println("it is a palidrome number");
		}else {
			System.out.println("it is not apalidrome number11");
		}

	}

	private static int reversenumber(int n) {
		int reverse = 0;
		while(n>0) {
			int r =n %10;
			  n = n/10;
			  reverse = reverse *10+r;
		}
		return reverse;
	}

}
