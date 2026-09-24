package programs.LogicalStatements;

import java.util.Scanner;

public class Tables {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the number :");
		int n1 = sc.nextInt();
		

		
		System.out.println("up to which number u need enter it :");
		int n2 = sc.nextInt();
		findtables(n1,n2);
		
		}
	static void findtables(int n1,int n2) {
     for(int i= 1; i<=n2;i++) {
    	 System.out.println(n1 + " X  " + i + " = " + (n1*i));
     }
	}

}
