package programs.Arrays;



public class ArrayDemo8 {

	public static void main(String[] args) {
		int [] a = {
				1,2,3
		};
		int [] b = {4,5,6

		};
		
		int [][] c = new int [1][a.length];

		for (int i = 0; i < a.length; i++) {
			c[0][i]= a[i]+b[i];
			
			
		}
	for (int i = 0; i < c.length; i++) {
		for (int j = 0; j < c[i].length; j++) {
			System.out.print(c[i][j]+" ");
		}
		
	}
		
		
		
		
		
		
		
		
		
	}

}
