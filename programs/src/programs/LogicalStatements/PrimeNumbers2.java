package programs.LogicalStatements;

import java.util.Scanner;

public class PrimeNumbers2 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the digit u want to check : ");
     int n = sc.nextInt();
     int temp =n;
     int count = 0;
     while(temp >0) {
    	 temp=temp/10;
    	 count++;
     }
     
     
     
     
    	 for(int digits=1;digits<=count;digits++) {
    	 int divisor =1;
    	 
    	 for(int i =1;i<digits;i++) { 
    		 divisor=divisor*10;
    	 }
    	 temp=n;
    	 while(temp>=divisor) {
    		 
    		 int number =temp %(divisor*10);
    		 if(isprime(number)) {
    			 System.out.println("the numbers are : " +number);
    		 }
    		 temp =temp/10;
    	 }
    	 }
    		 }
    	 
    	 
     
     
     
     
	



	private static boolean isprime(int n) {
		if(n<2) {
			return false;
		}
		for(int i =2;i<n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		
		
		return true;
	}}
	
