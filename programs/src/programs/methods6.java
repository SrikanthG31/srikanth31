package programs;

import java.util.Scanner;

public class methods6 {
	
	  static Scanner sc = new Scanner(System.in);
	   int salary;
	    String department;
	    boolean bonus;
	    
	 int  getempolyeesalary() {
	 return salary;
	 }
	 String getempolyeedep() {
		 return department;
	 }
	 boolean isEligibleforbonus() {
		 if(salary>30000) {
			 
		
	 }
		 return bonus;}
	 
	 
	public static void main(String[] args) {
		System.out.println("main method started");
		methods6 as = new methods6();
		
		
	   System.out.println("enter the salary");
	   as.salary = sc.nextInt();
	   System.out.println("salary is : "+as.getempolyeesalary());
	   System.out.println("enter the employee department");
	   as.department =sc.next();
	   System.out.println("status");
	   as.bonus =sc.nextBoolean();
	   System.out.println("bonuselig"+as.isEligibleforbonus());
	   
	   
	   
         
          System.out.println("name of the empolyee"+as.getempolyeeName());
          
          System.out.println("department is : "+ as.getempolyeedep());
          

	}
	String getempolyeeName() {
		System.out.println("enter the name ");
		String name = sc.next();
		return name;
		
	}

}
