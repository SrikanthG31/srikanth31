package programs.Arrays;

import java.util.Scanner;

public class ArraysDemo5 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println(" enter the size of the array : ");
	int size = sc.nextInt();
	
	int [] arr = new int[size];
	
	
	System.out.println("enter the elements : ");
	for(int i=0;i<arr.length;i++) {
		arr[i]=sc.nextInt();
	}
	System.out.println(" printing the prime numbers only : ");
	
	for(int i=0;i<arr.length;i++) {
		if(isprime(arr[i])) {
			System.out.println(arr[i]);
		}
	}
 
	}

	static boolean isprime(int n) {
	 boolean status = true;
	 
	 if(n==0||n==1) {
		 status= false;
	 }
	 
	 for(int i = 2 ;i<=n/2;i++) {
		 if(n%i==0) {
			 status= false;
			 break;
		 }
	 }
	 
	 
	 
		return status;
	}

}
