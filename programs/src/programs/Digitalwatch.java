package programs;

public class Digitalwatch {
   String brandName= "spark";
   String watchType = "mechcahinal";
   int hours;
   int minutes;
   int seconds;
   int price;
   void displayTime() {
	   System.out.println("Time is = "+ hours +":"+minutes+":"+seconds);
   }
void displayTimeDetails() {
	System.out.println("brandName : " + brandName);
	System.out.println("watchType : "+ watchType);
	System.out.println("price : "+ price);
	
}
void updateHour() {
	hours =hours + 1; 
}
void updateMinutes() {
	minutes = minutes+5;
}
void updateDisplayTime() {
	   System.out.println("Updatede Time is = "+ hours +":"+minutes+":"+seconds);
	   System.out.println("updated time ");
}
public static void main(String[] args) {
	
	Digitalwatch a1 = new Digitalwatch();
	
	a1.hours = 11;
	a1.minutes = 70;
	a1.seconds = 25;
	a1.price = 2000;
	
	a1.displayTime();
	
	a1.displayTimeDetails();
	a1.updateHour();
	a1.updateMinutes();
	a1.updateDisplayTime();
	
	
}
}