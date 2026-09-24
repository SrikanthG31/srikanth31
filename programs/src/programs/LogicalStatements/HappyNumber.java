package programs.LogicalStatements;

import java.util.Scanner;

public class HappyNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number what number u want check :");
		int n = sc.nextInt();
int result = checkNumber(n);
if(result==1) {
	System.out.println("it is a happy number ");
}else {
	System.out.println("it is not a happy number");
}

	}

	private static int checkNumber(int n) {
		while(n!=1&&n!=4) {
			int sum =0;
			int rem=0;
			while(n>0) {
				 rem = n%10;
				sum = sum+rem*rem;
				n=n/10;
				
			}
			
			n=sum;
			
			
			
			
			
			
		
	}
		return n;
		

	}

}
