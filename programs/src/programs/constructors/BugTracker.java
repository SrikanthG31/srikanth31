package programs.constructors;

import java.util.Scanner;

public class BugTracker {
int bugId;
String applicationName;
String bugtitle;
String  severity;
String priority;
String status;
String assigniedDepeloper;



	public static void main(String[] args) {
	BugTracker s =new BugTracker();
	s.bugId = 101;
	s.applicationName = "banking application";
	s.bugtitle ="login button not working";
	s.severity ="high";
	s.priority ="high";
	s.status = "open";
	s.assigniedDepeloper="not assigned";
	s.assigndeveloper(101, "ram");
	
	s.displayBugsummary();

	}
	
	int getbugID() {
		System.out.println("enter the bug ");
		
		return bugId ;
		
	}
	String getapplicationName() {
		return applicationName;
		
	}
	String getbugtitle() {
		return bugtitle;
	
	}
	String getpriority() {
		return priority;
		
	}
	
	String getseverity() {
		return severity;
		
	}
	String getstatus() {
		return status;
		
	}
	String getassigniedDepeloper() {
		return assigniedDepeloper;
		
	}
	
	void assigndeveloper(int bugId,String developerName) {
		if(this.bugId ==bugId) {
			assigniedDepeloper = developerName;
	              updatestatus("in development");
		}
	
	
	}
 void updatestatus(String newstatus) {
		status = newstatus;
		
	}
 void displayBugsummary() {
	 System.out.println("bud id : "+ getbugID());
	 System.out.println("application : "+ getapplicationName());
	 System.out.println("bugtitle: "+ getbugtitle());
	 System.out.println("severity : "+getseverity());
	 System.out.println("status : "+getstatus());
	 System.out.println("priority : "+getpriority());
	 System.out.println("assigneddevlepoer : " +getassigniedDepeloper());
	 
 }

	
}
