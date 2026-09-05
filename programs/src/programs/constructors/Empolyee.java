package programs.constructors;

public class Empolyee {
  String dep;
  String name;
  int id ;
   Empolyee() {
	System.out.println("no arg started");
	dep = "exc";
	name ="sre";
	id = 202;
}
  
	 Empolyee(String dep, String name, int id) {

	this.dep = dep;
	this.name = name;
	this.id = id;
}
	 

	Empolyee(String dep, String name) {
	System.out.println("two parameterized conturctor");
		this.dep = dep;
		this.name = name;
	
	}

	public static void main(String[] args) {
		System.out.println("main started");
		Empolyee e = new Empolyee();
		e.show();
		Empolyee t = new Empolyee("sales","sriaknth",101);
		t.show();
		Empolyee o = new Empolyee("sales","sriaknth");
		o.show();
		Empolyee p = new Empolyee();
		p.show();
		
		
		

	}
	void show() {
		System.out.println("dep : "+dep);
		System.out.println("name : " +name);
		System.out.println("id : "+id);
	}

}
