package programs.Arrays;

public class ArraysDemo12 {

	public static void main(String[] args) {
		int [][] arr = { {10,20,30
		},{40,50,60},{70,80,90}};
		int [][] c = new int [3][3];

	
	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr[i].length; j++) {
			if(arr[i]==arr[j]||i+j ==arr.length-1) {
			 c[i][j] = arr[i][j];
			}
		}
	}	
	for (int i = 0; i < arr.length; i++) {
	for (int j = 0; j < arr[i].length; j++) {
		System.out.print(c[i][j] + " ");
	}	
	System.out.println();
	}

}}
