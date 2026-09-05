package programs;

public class Methods10 {
     static String storename = "Dmart";
     String customerName ;
     String productName;
     double price;
     int quantity;
     double finalsum;
     
	public static void main(String[] args) {
		Methods10 obj = new Methods10();
		obj.customerName="srikanth";
		obj.productName ="dariy";
		obj.price=40000;
		obj.quantity=2;
		obj.addProduct("abc", 50, 2);
		obj.calculateTotal(5);
		obj.displayCart();

	}
   void addProduct(String pname,double pr,int qty) {
    productName = pname;
    price= pr;
   quantity=qty;
   System.out.println("product added succesfully");
   
   }
   
   void calculateTotal(double discount) {
	   double totalprice = price*quantity;
	   
	    discount = totalprice *discount/100;
	    
	     finalsum = totalprice - discount;
	   
   }
   void displayCart() {
	   System.out.println("--------shoppingcart -------");
	   System.out.println("storename"+storename);
	   System.out.println("customername:"+customerName);
	   System.out.println("productname: "+productName);
	   System.out.println("price : "+price);
	   System.out.println("quantity: "+quantity);
	   System.out.println("finalsum : "+  finalsum);
	  
   }
   
	   
   }

