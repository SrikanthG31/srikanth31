package programs.Arrays;

public class ArraysDemo3 {

	public static void main(String[] args) {
	
		int[] marks = {90,89,91,92,93};
		int total_Marks = 0;
		int avg =0;
//		for(int m:marks) {
//			total_Marks +=m;
			
//		}
		
		for(int i=0 ;i<marks.length;i++) {
			total_Marks = total_Marks + marks[i];
		}
		
		
		avg = total_Marks/marks.length;
System.out.println("the total marks : " + total_Marks);
System.out.println("the avg is : " + avg );
	}

}
