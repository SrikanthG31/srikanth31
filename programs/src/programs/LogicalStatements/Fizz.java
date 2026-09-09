package programs.LogicalStatements;

import java.util.Scanner;

public class Fizz {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter 	the your number  : ");
		
		 int number =sc.nextInt();
		 
		  if(number %3 ==0 && number %5 ==0) {
			 System.out.println("Fizz Buzz");
		 }else if (number %5 ==0) {
			 System.out.println("Buzz");
			 
		 }else if(number %3 ==0) {
			 System.out.println("Fizz ");
		 }else {
			 System.err.println("plz enter vaild number number");
		 }

	}

}
