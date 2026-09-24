package programs.LogicalStatements;

import java.util.Scanner;

public class NeonNumber {
	

	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
	System.out.println("enter the number :");
	int n = sc.nextInt();
	 int square = n*n;
	int result=neonNumber(square);
		if (result==n) {
			System.out.println("it is a neon number");
		}else {
			System.out.println("it is not a neon number");
		}
	

	}

	 static int neonNumber(int square) {
		 int rem = 0;
		 int sum =0;
		while(square>0) {
			rem=square%10;
		     sum=sum+rem;
			square=square/10;
	
		}
		return sum;
	}

}
