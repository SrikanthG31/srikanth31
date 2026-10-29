package programs.Arrays;

public class ArraysDemo11 {

	public static void main(String[] args) {
		int []arr = {1,5,8,15,6,7,2};
		int max=arr[0];
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]>max) {
				max=arr[i];
			
			}}
			for (int i = 0; i < arr.length; i++) {
				if (arr[i]<min) {
					min=arr[i];
				
				}
			
		}
		System.out.println(max);
		System.out.println(min);
	

}}
