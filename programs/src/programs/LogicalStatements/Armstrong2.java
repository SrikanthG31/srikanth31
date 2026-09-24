package programs.LogicalStatements;

import java.util.Scanner;

public class Armstrong2 {

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

	private static boolean isArmstrong(int n) {
		boolean status = false;
		int temp =n;
		int orginal = n;
		int n1 =n;
		int count = 0; 
		int rem = 0;
		int sum=0;
		while(n1>0) {
			
		n1= n1/10;
		count ++;
		
		}
		while(temp>0){
			rem =temp%10;
		    
		int power;
		power =1;
		
		for(int  i=1;i<=count;i++ ) {
			power = power*rem;
			
		}
		sum=sum+power;
		temp=temp/10;
		if(sum==orginal) {
			return true;
		}
		}
		return status;
		
	}

}
