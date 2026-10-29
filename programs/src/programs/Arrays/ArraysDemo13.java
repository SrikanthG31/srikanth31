package programs.Arrays;


public class ArraysDemo13 {

	public static void main(String[] args) {

		int [] arr = {3,4,5,15,34,2,5,23};
		int highest=arr[0];
		int second=arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>highest) {
				second = highest;
				highest=arr[i];
				
			}if(arr[i]>second&&arr[i]!=highest) {
				second = arr[i];
			}
		}
System.out.println("highest :"+highest);
System.out.println("second : "+second);
	}

}
