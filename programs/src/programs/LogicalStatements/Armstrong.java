package programs.LogicalStatements;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the number what nummber u want  :");
		int n = sc.nextInt();
	boolean status  = isArmstrong(n);
		
	
		if(status ==true) {
			System.out.println("it is armstrong number");
		}else {
			System.out.println("it is not armstrong number");
		}

	}

	 static boolean isArmstrong(int n) {
	boolean status = false;
	int psum =0;
	int digitcount =0;
	int temp = n;
	int n1 =n;
	int rem = 0 ;
	
	while(n1>0) {
		n1 =n1/10;
		digitcount ++;
	}
		while(n>0) {
			rem = n%10;
			n = n/10;
			psum =psum + (int)(Math.pow(rem,digitcount ));
			
		}
	
		if(temp ==psum) {
		 status = true;
			
		}else {
			status = false;
		}
		
		
		
		return status;
	}


}
