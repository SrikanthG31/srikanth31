package programs.Arrays;

public class ArraysDemo18 {

	public static void main(String[] args) {
		int [] []arr= {{1,6},{2,5},{0,2},{4,5}};
		
		for (int i = 0; i < arr.length; i++) {
			int found = 0;
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i][0]<=arr[j][1]&&arr[j][0]<=arr[i][1]){
					found=1;
					 
			
			}}
				System.out.println(found);
		

	}

}}
