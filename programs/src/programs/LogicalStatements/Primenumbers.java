package programs.LogicalStatements;

import java.util.Scanner;

public class Primenumbers {

	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the number what nummber u want check  :");
		int n = sc.nextInt();
       boolean status = primenumbers(n);
        if(status ) {
        	System.out.println(" its prime number");
        }else {
        	System.out.println("it is not prime number");
        }
	}

	static boolean primenumbers(int n) {
		 boolean status = true;
	
	    if (n<2) {
	    	 
			 return false;
	    }
	    else {
	    	for(int i = 2;i<n;i++) {
	    
	           if( n%i==0) {
	        	   return false;
	           }
	           else {
	        	   return true;
	           }
		
	

	    		    }
	    	}
		return status;}}
