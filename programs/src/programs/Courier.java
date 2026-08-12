package programs;

public class Courier {
	String customerName;
	int courierId;
	String source;
	String destination;
	int weight = 50;
	int deliveryAmount;
	
	static int totalCouriers;
	static int totalweight;
	static int totalAmountCollected;
	static int priceperkg =100;
	 
	static {
		System.out.println("Welcome to Quickship courier!");
	}
	
	void bookcourier() {
		deliveryAmount = priceperkg * weight;
		totalCouriers ++;
		totalweight = totalweight + weight;
		totalAmountCollected = totalAmountCollected+deliveryAmount;
		System.out.println("succesful booking");
		System.out.println("-----------------------------------------");
	}
	void displayCouierDetails() {
		System.out.println("courierId = "+courierId );
		System.out.println("source = "+ source);
		System.out.println("destination = "+ destination);
		System.out.println("weight = " + weight);
		System.out.println("deliveryAmount = "+ deliveryAmount);
	}
	static void displayTodaysCollection() {
		System.out.println("Totalcouriers = " +totalCouriers);
		System.out.println("TotalWight = " + totalweight);
		System.out.println("TotalAmountCollected = "+ totalAmountCollected);
	}
	
	

	public static void main(String[] args) {
		Courier a1 = new Courier();
		a1.customerName = "srikanth";
		a1.courierId = 21;
		a1.source = "hyderabad";
		a1.destination ="vizay";
		a1.weight = 50;
	
		;
		a1.bookcourier();
		a1.displayCouierDetails();
		Courier.displayTodaysCollection();
		
		Courier a2 = new Courier();
		a2.customerName = "goku";
		a2.courierId = 25;
		a2.source = "hyderabad";
		a2.destination ="vizay";
		a2.weight = 30;
	
		a2.bookcourier();
		a2.displayCouierDetails();
		Courier.displayTodaysCollection();
		

	}

}
