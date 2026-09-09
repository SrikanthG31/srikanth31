package programs.LogicalStatements;

import java.util.Scanner;

public class GradeOfStudents {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your marks : ");
		 int marks =sc.nextInt();
		 
		 String grade = (marks >100||marks<0) ?"inaviod" :
			 (marks>91)? " S grade":
		     (marks>81)? " A grade":
		    	 (marks>71)? " B grade":
		    		 (marks>61)? " C grade":
		    			 (marks>51)? " D grade":
		    				 (marks>41)? " E grade":
		    					 "FAILED";
		 
		 
		 System.out.println("garde : "+grade);
		     

	}

}
