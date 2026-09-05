package programs;
import java.util.Scanner;

public class Methods_2 {

	public static void main(String[] args) {
		System.out.println("Main started");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("empolyeeid : ");
		int id = sc.nextInt();
		
		System.out.println("income:");
		double annual =sc.nextDouble();
		System.out.println("bonus percentage:");
		double bonus  = sc.nextDouble();
		System.out.println("tax");
		double tax = sc.nextDouble();
		System.out.println("salary");
		double salary = sc.nextDouble();
		getemployeeId(id);
		getanualincome(annual);
		getbonus(bonus);
		getnetsalary(annual, tax);
		isEliglibleforbonus(salary);

	}
static void getemployeeId(int eid ) {
	System.out.println("empolyeeid : "+ eid);
	
}
static void getanualincome(double salary) {
	System.out.println("salary :"+salary);
}
static void getbonus(double annualincome) {

	double bonus =( annualincome *10)/100;
	System.out.println("bonus = "+ bonus);
	
	
}
static void getnetsalary(double annualincome ,double tax) {
	double netsalary = annualincome- tax;
	System.out.println("netsalary ="+netsalary);
}
static void isEliglibleforbonus(double salary) {
	if(salary >=30000) {
		System.out.println("eligible for bonus");
	}else {
		System.out.println("no");
	}
}
}
