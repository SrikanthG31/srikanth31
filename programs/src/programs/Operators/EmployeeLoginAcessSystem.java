package programs.Operators;

public class EmployeeLoginAcessSystem {
 String employeeName;
 double salary;
 boolean doorpower;
 boolean blocked;
 
 
 EmployeeLoginAcessSystem(String employeeName, double salary, boolean doorpower, boolean blocked) {
	
	this.employeeName = employeeName;
	this.salary = salary;
	this.doorpower = doorpower;
	this.blocked = blocked;
}

 void checkAccess() {
	 boolean  accessstastus = doorpower && !blocked;
	 System.out.println("accessstatus : "+ accessstastus);
	 
	 System.out.println("employeename  : " + employeeName);
	 System.out.println("salary : "+salary);
	 System.out.println("doorpower : "+doorpower);
	 System.out.println("blocked : "+blocked);
 }

	public static void main(String[] args) {
	
EmployeeLoginAcessSystem  e = new EmployeeLoginAcessSystem("srikanth", 50000, true, false);
e.checkAccess();
	}

}
