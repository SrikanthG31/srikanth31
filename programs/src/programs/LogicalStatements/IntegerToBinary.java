package programs.LogicalStatements;

import java.util.Scanner;

public class IntegerToBinary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number what number u want check :");
		int n = sc.nextInt();
		int r = 0;
		String str ="";
          while(n>0) {
        	  
          
		r= n%2;
		
		str =r+str;
		n=n/2;
		
          }
          System.out.println(" the binary of the integer is  : " + str);
	}

}
