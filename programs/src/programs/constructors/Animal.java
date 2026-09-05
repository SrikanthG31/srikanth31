package programs.constructors;

public class Animal {
String name;
 Animal() {
	System.out.println("no arg of animal");
}
	public static void main(String[] args) {
		

	}

}
class Dog extends Animal{
	Dog(){
		System.out.println("no arg of dog");
	}
	public static void main(String[] args) {
		System.out.println("main method started");
		Dog e = new Dog();
	}
}
