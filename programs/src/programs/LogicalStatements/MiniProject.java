package programs.LogicalStatements;

import java.util.Random;
import java.util.Scanner;

public class MiniProject {

	public static void main(String[] args) {
		
		game();

	}

	private static void game() {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int Randomnumber = r.nextInt();
	       for(int i=1 ; i<=3;i++) {
	    	   System.out.println("enter a number between 1 to 10");
	    	   int n = sc.nextInt();
	    	   
	    	   if(n==Randomnumber) {
	    		   System.out.println("you have won ");
	    		   break;
	    	   }
	    	   if(i==3) {
	    		   System.out.println("Better luck nexttime ");
	    	   }else {
	    		   System.out.println("wrong guess! try again . ");
	    	   }
	       }

		
	}

}
