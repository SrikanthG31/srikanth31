package programs.LogicalStatements;

import java.util.Scanner;

public class Binarytointeger {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number what number u want check :");
		int n = sc.nextInt();
		int result = 0;
		int palce = 1;
		int rem ;
		while(n>0) {
			rem=n%10;
			result = result  +rem *palce;
			palce = palce*2;
			n=n/10;
		}
		System.out.println(" the result : " + result);

	}

}
