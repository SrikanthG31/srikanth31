package programs.Arrays;

import java.util.Arrays;

public class ArraysDemo15 {

	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5,6,7,8};
		System.out.println("before sorting ");
		System.out.println(Arrays.toString(arr));
		int temp =0;
		int count =0;
		int count1= 0;
		for (int i = 0; i < arr.length-1 ; i++) {
			boolean swapped = false;
			count++;
			for (int j = 0; j < arr.length-1-i; j++) {
				if(arr[j]>arr[j+1]) {
					temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]= temp;
					swapped = true;
					
					
					
				}
				count1++;
			}
				if(!swapped) {
					break;
				
			}
		}
		System.out.println("count : " + count);
		System.out.println("count1 : "+count1);
		System.out.println("before sorting ");
		System.out.println(Arrays.toString(arr));
		}

	}


