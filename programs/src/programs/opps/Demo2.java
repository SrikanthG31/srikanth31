package programs.opps;

public class Demo2 {

	public static void main(String[] args) {
		Demo1 d = new Demo1();
		
	d.setsid(72);
	System.out.println("sid : "+ d.getsid());
	d.setname("srikanth");
	System.out.println("name : "+d.getname());
	d.setsalary(20000);
	System.out.println("salary : " + d.getsalary());
	}

}
