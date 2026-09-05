package programs.constructors;

public class Contructors2 {
	String EmployeeName ;
	double salary;
	String companyName;

	
	 Contructors2(String employeeName, double salary, String companyName) {
	
		this.EmployeeName = employeeName;
		this.salary = salary;
		this.companyName = companyName;
	}
	public static void main(String[] args) {
		System.out.println("main method started");
		Contructors2 e = new Contructors2("sriaknth", 30000, "wipro");
		Contructors2 e1 = new Contructors2("sriaknth", 30000, "dell");
         e.show();
         e1.show();
	}
	void show() {
		System.out.println("employeeName: " + EmployeeName);
		System.out.println("salary : " +salary);
		System.out.println("company Name : "+companyName);
	}

}
