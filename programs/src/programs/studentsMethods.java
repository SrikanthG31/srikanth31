package programs;

import java.util.Scanner;

public class studentsMethods {
  static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
	studentsMethods re = new studentsMethods();
	 System.out.println("name of the student is : "+ re.getStudentName());
	 System.out.println("results  :"+ ""+re.isstudentpassed());
	 
	

	}
	
	String getStudentName() {
		System.out.println("enter your name : ");
		 String name = sc.next();
		 return name;
		
	}
	boolean isstudentpassed() {
		System.out.println("enter your marks");
		int marks = sc.nextInt();
		if (marks >=36) {
			return true;
		}else {
			return false;
		}
	}

}
