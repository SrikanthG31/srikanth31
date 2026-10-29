package programs.Arrays;

public class ArraysDemo9 {

	public static void main(String[] args) {
		
		int [][] a = {
						{4,2,3},
						{4,5,6}
						};
			
				
				int [][] c = new int [1][a[0].length];

				for (int j = 0; j < a[0].length; j++) {
					
					for (int i = 0; i < a.length; i++) {
						c[0][j]+= a[i] [j];
					}}
					for (int i = 0; i < c.length; i++) {
						for (int j = 0; j < c[i].length; j++) {
							System.out.print(c[i][j]+" ");}
				}


	}	

}
