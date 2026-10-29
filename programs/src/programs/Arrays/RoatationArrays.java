package programs.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RoatationArrays {

	public static void main(String[] args) {
		int []arr = {1,2,3,4,5,6,7,8};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter how many times u want : ");
		int r = sc.nextInt();
		Reverselefttoright(arr,r);
		
		System.out.println(Arrays.toString(arr));
	}

	 static void Reverselefttoright(int[] arr, int r) {
		int start = 0;
		int end=arr.length-1;
	  
	     Reversearray(start,end,arr);
	     Reversearray(start, r-1, arr);
	     Reversearray(r, end, arr);
	     
		
	}

	 static void Reversearray(int start, int end, int[] arr ) {
		int temp=0;
		while(start<end) {
			temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		
	 }
	
	 
}
