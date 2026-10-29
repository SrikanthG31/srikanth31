package programs.Arrays;

import java.util.Arrays;

public class ArraysDemo16 {

	public static void main(String[] args) {
	
		
		int []arr = {1,2,3,1,2,3,4,5};
		 for(int i =0;i<arr.length;i++){
			 boolean duplicate=false;
			for(int j=0;j<i;j++) {
				int temp=0;
				if(arr[i]==arr[j]) {
					duplicate = true;
					break;
					
					
				}
				
			}
			if(!duplicate) {
				System.out.println(arr[i]);
			}
			 
			 
			 
			 
			 
		 }
		
		
		
		
		
		
		
	}}