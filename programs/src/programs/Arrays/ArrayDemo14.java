package programs.Arrays;


public class ArrayDemo14 {

	public static void main(String[] args) {
		int [][] arr = {
				{90,85,88},
				{75,80,92},
				{95,91,89}
		};
		int [][] result = new int [3][3];
		
   for (int i = 0; i < arr.length; i++) {
	   int sum =0;
	   int sum1=0;
	double avg = 0;
	for (int j = 0; j < arr[i].length; j++) {
		
		sum +=arr[i][j];
		
		avg = (double) sum/arr[i].length;
		
		
	}
	System.out.println(" sum : "+ sum);
	System.out.println("avg"
			+ "m : " + avg);
   }

}}
