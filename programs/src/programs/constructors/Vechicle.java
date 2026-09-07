package programs.constructors;

public class Vechicle {
 String type;
 Vechicle() {
	
}
	Vechicle(String type){
		this.type =type;
	}
	
	public static void main(String[] args) {
		

	}

}

class Car extends Vechicle{
String brand;
double price;
	 Car() {

	}
	Car(String type, String brand, double price) {
		super(type);
		
		this.brand = brand;
		this.price = price;
	 }
	 

	
}
class ElectricCar extends Car{
	
	    String batteryCapacity ;
 ElectricCar() {
		
	}
  ElectricCar(String type, String brand, double price, String batteryCapacity) {
	super(type,brand,price);
	
	this.batteryCapacity = batteryCapacity;
 }
	public static void main(String[] args) {
		ElectricCar obj = new ElectricCar("elecric car","ola",200000,"100kWh");
       obj.show();
	}	
	void show() {
		System.out.println("type  : " +type);
		System.out.println("barnd : " + brand);
		System.out.println("price : "+ price);
		System.out.println("batterycapacity : " + batteryCapacity);
	}
 
}