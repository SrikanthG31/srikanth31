package programs.LogicalStatements;

import java.util.Scanner;

public class DecimaltoOctal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number what number u want check :");
		int n = sc.nextInt();
		int r = 0;
		int result = 0  ;
		

		
		String str ="";
        while(n>0) {
      	  
        
		r= n%8;
		
		str =r+str;
		n=n/8;
		
        }
        System.out.println(" the binary of the integer is  : " + str);
	

	}

}
