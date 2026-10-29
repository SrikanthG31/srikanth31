package programs.Arrays;

public class ArraysDemo1 {

	public static void main(String[] args) {
		
		int [] ages;
		ages = new int [5];
		

		ages[0]= 1;
		ages[1]= 2;
		ages[2]= 3;
		ages[3]= 4;
		ages[4]= 5;
		
		//for (int i = 0; i < ages.length; i++) {
		for(int number:ages){
		if(number%2==0) {
			System.out.println(number);
		}
		
		}
	}

}
