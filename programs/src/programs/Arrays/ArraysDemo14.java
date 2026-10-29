package programs.Arrays;

import java.util.Arrays;

public class ArraysDemo14 {

	public static void main(String[] args) {
		int [] arr = {9,6,7,3};
		System.out.println("before sorting ");
		System.out.println(Arrays.toString(arr));
		int temp =0;
		for(int i =0; i<arr.length-1;i++) {
			for (int j = 0; j < arr.length-1-i; j++) {
			if(arr[j]>arr[j+1]) {
				temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] =temp;
			}
			
			}
		}
		
		System.out.println("after sorting ");
		System.out.println(Arrays.toString(arr));

	

}
}