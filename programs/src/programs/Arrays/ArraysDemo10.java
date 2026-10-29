package programs.Arrays;

public class ArraysDemo10 {

	public static void main(String[] args) {
		int [][] a = {
				{4,2,3},
				{4,5,6}
				};
	
		
		int [][] c = new int [a.length][1];
for (int i = 0; i < a.length; i++) {
	int sum =0;
	for (int j = 0; j < a[i].length; j++) {
		sum =sum+a[i][j];
	
		c[i][0]=sum;
	}}
	for (int i = 0; i < c.length; i++) {
		for (int j = 0; j < c[i].length; j++) {
			System.out.print(c[i][j]+" ");}
	}
	
}
	}


