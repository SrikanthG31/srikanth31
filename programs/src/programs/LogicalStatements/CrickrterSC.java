package programs.LogicalStatements;

import java.util.Scanner;

public class CrickrterSC {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	System.out.println("enter a jersy number");
	int jersyNo=sc.nextInt();
	switch (jersyNo) {
	case 7: {
	
		System.out.println("dhoni");
		System.out.println("make himhead coach of india ");
	}
	break;
	case 45 : {
		System.out.println("rohit shrama");
		System.out.println("dont remove him ");
	}
	break;
	default:
		throw new IllegalArgumentException("Unexpected value: " + jersyNo);
	}
		
		

	}

}
