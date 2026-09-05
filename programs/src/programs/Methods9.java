package programs;

public class Methods9 {
String employeeName;
int employeeId;
String disignation;
String newdisignation;
String department;
double salary;
String remotelocation;
String upadtedLocation;

static String companyName = "suntech solutions";
static String companyLocation = "hi-tech city";

static {
	System.out.println("Welcome to sunTech olutions!  welcome HRMSportal");
}
	public static void main(String[] args) {
		Methods9 obj = new Methods9();
		obj.employeeName = "sriaknth";
		obj.employeeId=45;
		obj.disignation="junior";
		obj.department ="deplover";
		obj.salary = 30000;
		obj.remotelocation = "hyderabad";
		obj.newdisignation = "bengulure";
		obj.displayEmployee();
		obj.promoteEmpolyee();
		obj.updateSalary();
		obj.updateEmoplyeeLocation();
		
		

	}
	void displayEmployee() {
		System.out.println("empolyeename:"+employeeName);
		System.out.println("empolyeeid"+employeeId);
		System.out.println("disignation"+disignation);
		System.out.println("department"+department);
		System.out.println("salary"+salary);
		System.out.println("remotelocation"+remotelocation);
	}
	void promoteEmpolyee() {
		newdisignation= disignation;
		System.out.println("newdisignation"+newdisignation);
	}
    void updateSalary() {
    	System.out.println("updatedmoney : "+ (salary+5000));
    }
    void updateEmoplyeeLocation() {
    	remotelocation= upadtedLocation; 
    System.out.println("upadted emoplyeelocation : "+remotelocation);
    }
}
