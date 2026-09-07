package programs.constructors;

public class Human {
String name;
int age ;

	Human(){
		System.out.println("noarg of parent");
	}
	
	Human(String name,int age){
		this.name =name;
		this.age =age;
		System.out.println("parmeterized concustors called of parent ");
	
	}
	public static void main(String[] args) {
		

	}

}
class Person extends Human{
	Person(){
		System.out.println("noarg of child");
	}
	
	Person(String name,int age){
		super(name,age);
		System.out.println("parameterized concustor of child");
		
	}
	
	
	public static void main(String[]args) {
		System.out.println("main method started");
		Person e = new Person();
		e.show();
		Person e1 = new Person("srikanth",23);
		e1.show();
		System.out.println("main method started");
	}
	
	void show() {
		System.out.println("name : "+ name);
		System.out.println("age : "+age);
	}
}
