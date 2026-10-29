package programs.Arrays;

public class ArraysDemo17 {

	public static void main(String[] args) {
		int [] arr = {1,3,4,5,3,5};
		int largest = Integer.MIN_VALUE;
		int secondlargest = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>largest) {
				secondlargest=largest;
				largest=arr[i];
			}else if (arr[i]>largest &&arr[i]!=largest) {
				secondlargest=arr[i];
			}
		}
		System.out.println(" largest : "+ largest);
		System.out.println("secondlargest : "+secondlargest);

	}

}
