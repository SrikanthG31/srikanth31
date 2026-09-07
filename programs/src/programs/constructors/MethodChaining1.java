package programs.constructors;

public class MethodChaining1 {
	String name;
	String brand;
	String colour;
	double price;
	double year;
	    MethodChaining1() {
		this("unknown");
		System.out.println("no arg ");
	}
		MethodChaining1(String name) {
			this( name,"unknown");
			System.out.println("one arg ");
		}
		
	   MethodChaining1(String name,String brand) {
				this(name,brand,"white");
				System.out.println("two arg ");
				
				}
	   MethodChaining1(String name,String brand,String colour) {
					this(name,brand,colour,20000);
					System.out.println("three arg ");
					
				}
		MethodChaining1(String name,String brand,String colour,double price) {
						this(name,brand,colour,price,2016);
						System.out.println("four  arg ");
					}
		MethodChaining1(String name,String brand,String colour,double price,double year) {
			System.out.println("five arg ");
		this .name=name;
		this.brand= brand;
		this.colour= colour;
		this.price = price;
		this.year =year;
		
		
	}
	public static void main(String[] args) {
		System.out.println("main method  started");

      MethodChaining1 a1 = new MethodChaining1();
      a1.show();
      MethodChaining1 a2 = new MethodChaining1("wr");
      a2.show();
      MethodChaining1 a3 = new MethodChaining1("wa","qr");
      a3.show();
      MethodChaining1 a4 = new MethodChaining1("sd","wd","er");
      a4.show();
      MethodChaining1 a5 = new MethodChaining1("sd","wd","er",30300);
      a5.show();
	MethodChaining1 a6 = new MethodChaining1("passion pro","hero","black",80000,2014);
    a6.show();}
     	void show() {
		System.out.println("name : " +name);
		System.out.println("brand : " +brand);
		System.out.println("colour : " +colour);
		System.out.println("price : " +price);
		System.out.println("year : " +year);
		 System.out.println("************************************************");
    	

	}

}
