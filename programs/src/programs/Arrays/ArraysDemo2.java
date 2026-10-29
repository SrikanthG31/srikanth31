package programs.Arrays;

public class ArraysDemo2 {

	public static void main(String[] args) {
	
		String [] names =  new String[10];
		
		names[0]= "dhoni";
		names[1]="rohit";
		names[2]="kohli";
		names[3]="abhi";
		names[4]="srikanth";
		for(String name:names) {
			if(name.toUpperCase().startsWith("S")) {
				System.out.println(name.toUpperCase());
			}

	}

}}
