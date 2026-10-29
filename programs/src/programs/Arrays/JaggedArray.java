package programs.Arrays;

public class JaggedArray {

	public static void main(String[] args) {
		int [][] arr = new int[2][];
		
		arr[0]=new int[3];
		arr[1]=new int[2];
		
		arr[0][0]=1;
		arr[0][1] = 2;
		arr[0] [2] =3;
		
		
		arr[1][0]=4;
		arr[1][1]=5;
		for(int ar[]:arr) {
		for(int a :ar) {
			System.out.print(a+ " ");
		}
		System.out.println();
		}
		for(int i =0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
	}

}
