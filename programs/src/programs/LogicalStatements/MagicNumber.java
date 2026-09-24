package programs.LogicalStatements;

import java.util.Scanner;

public class MagicNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number what number u want check :");
		int n = sc.nextInt();
int result = checkNumber(n);
if(result==1) {
	System.out.println("it is a magic number ");
}else {
	System.out.println("it is not a magic number");
}

	}

	 static  int checkNumber(int n) {
		 for(;n>9;) {
			 int sum=0;
			 			 
			 for(;n>0;n=n/10) {
			 
				 int rem = n%10;
			     sum =sum+rem;

			 
			 
		 }
			 n=sum;
			 }
		 
		 
		 
		 
		
		 return n;
		
		
	}

}
