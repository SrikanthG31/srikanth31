package programs.Arrays;

public class ArraysDemo6 {

	public static void main(String[] args) {
		int [][] numbers = new int [3] [3];
		
		numbers [0][0] =1;
		numbers[0][1]= 2;
		numbers[0][2]=3;
		
		numbers [1][0] =4;
		numbers[1][1]= 5;
		numbers[1][2]=6;
		
		numbers [2][0] =7;
		numbers[2][1]= 8;
		numbers[2][2]=9;
		
		for(int number[]:numbers) {
			for(int n:number) {
       System.out.print(n +" ");
				
			}
			System.out.println();
		
		}

			
		
		
		
		
		
		
		
		for(int i = 0;i<numbers.length;i++) {
			for(int j=0;j<numbers[i].length;j++) {
				System.out.print(numbers[i][j]+" ");
				
			}
			System.out.println();
		
		}
		

	}

}
