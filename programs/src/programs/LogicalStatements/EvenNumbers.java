package programs.LogicalStatements;

import java.util.Scanner;

public class EvenNumbers {





	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("enter the number what nummber u want  :");
		int n = sc.nextInt();
		
		
	
		
		
		int digit = iseven(n); ;
		
			System.out.println("the total evens are : " + digit);
		}

	

	private static int iseven(int n) {
		int count = 0;
	
	
		for(;n>0;n=n/10) {
			int rem = n%10;
           if(rem%2==0)
           {
        	   count ++;
           }
		
	
		}
		return count;
}}
