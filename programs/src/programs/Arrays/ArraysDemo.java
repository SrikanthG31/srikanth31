package programs.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		int[] arr = {3,45,1,34,56,7,8};
		int min = arr[0];
		int max = arr[0];
		for(int n:arr) {
		
			if(n<min) {
				min=n;
			} else if (n>max){
				max=n;
			}
			
			
		}
		System.out.println("the min : " +min);
		System.out.println("the max : " +max);

	}

}
