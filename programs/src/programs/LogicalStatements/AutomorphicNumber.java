package programs.LogicalStatements;

import java.util.Scanner;

public class AutomorphicNumber {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the number what nummber u want  :");
		int n = sc.nextInt();
	boolean status  = isAutomorphic(n);
		
	
		if(status ==true) {
			System.out.println("it is automorphic number");
		}else {
			System.out.println("it is not automorphic number");
		}

	}

	private static boolean isAutomorphic(int n) {
		int temp =n;
		int square = n*n;
		while(temp >0) {
			int digit = temp%10;
			int digit1 = square%10;
			
			if(digit !=digit1) {
				return false;
			}
			
			temp = temp/10;
			square = square/10;
			
			
			
			
			
			
		}return true;
		
		
		
		
		
	}
		
		

	}


