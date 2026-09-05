package programs;

import java.io.PrintStream;
import java.util.Scanner;

public class methods_3 {
	
static Scanner sc= new Scanner(System.in);
double marks1;
double marks2;
double marks3;
double marks4;
double marks5;
double marks6;
double marks7;
double marks8;

	public static void main(String[] args) {
		System.out.println("main method started");
		
		methods_3 da = new methods_3();
		
		da. marks1=da.sem1();
		System.out.println("enter the sem1 marks : " +da.marks1 );
		da. marks2=da.sem2();
	System.out.println("enter the sem2 marks : " +da.marks2);
		da.marks3=da.sem3();
		System.out.println("enter the sem3 marks : " +da.marks3 );
		da. marks4=da.sem4();
		System.out.println("enter the sem4 marks : " +da.marks4 );
		da. marks5=da.sem5();
		System.out.println("enter the sem5 marks : " +da.marks5 );
		da. marks6=da.sem6();
		System.out.println("enter the sem6 marks : " +da.marks6 );
		da. marks7=da.sem7();
		System.out.println("enter the sem7 marks : " +da.marks7 );
		da. marks8=da.sem8();
		System.out.println("enter the sem8 marks : " +da.marks8 );
		double avg = da.avgofsem();
		System.out.println("avg sem marks : " + avg);
		System.out.println("main method ended");

			
		}

      
	
 
	double sem1() {
		System.out.println("sem1marks");
		double sem1 = sc.nextDouble();
		return sem1;
	}
	double sem2() {
		System.out.println("sem2marks");
		double sem2 = sc.nextDouble();
		return sem2;
	}
	double sem3() {
		System.out.println("sem3marks");
		double sem3 = sc.nextDouble();
		return sem3;
	}
	double sem4() {
		System.out.println("sem4marks");
		double sem4 = sc.nextDouble();
		return sem4;
	}
	double sem5() {
		System.out.println("sem5marks");
		double sem5 = sc.nextDouble();
		return sem5;
	}
	double sem6() {
		System.out.println("sem6marks");
		double sem6 = sc.nextDouble();
		return sem6;
	}
	double sem7() {
		System.out.println("sem7marks");
		double sem7 = sc.nextDouble();
		return sem7;
	}
	double sem8() {
		System.out.println("sem8marks");
		double sem8 = sc.nextDouble();
		return sem8;
	}
	double avgofsem() {
		double  avgofsem = (marks1+marks2+marks3+marks4+marks5+marks6+marks7+marks8)/8;
		return avgofsem ;
		
	}
	
}
