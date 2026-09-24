package programs.LogicalStatements;

import java.util.Scanner;

public class MultipilcationTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("enter the number what nummber u want  :");
		int n1 = sc.nextInt();
	
		System.out.println("enter the number what nummber u want  :");
		int n2 = sc.nextInt();
		
              multitable( n1 ,n2);
	}

	private static void multitable(int n1, int n2) {
	for(int i =1;i<=n2;i++) {
		System.out.println( n1+" X" + n2 + " = "+ n1*i);
	}
		
	}

}
