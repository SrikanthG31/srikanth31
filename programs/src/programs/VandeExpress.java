package programs;

public class VandeExpress {

    // Passenger details
    String passengerName;
    int age;
    String source;
    String destination;
    int numberofTickets;
    int ticketamount;

    // Overall calculation
    static int totalTicketsBought;
    static int totalamount;
    static int price = 500;

    // Static block
    static {
        System.out.println("Welcome to VandeExpress thank you for choosing us");
    }

    // Method to book ticket
    void bookTicket() {

        ticketamount = price * numberofTickets;

        totalTicketsBought = totalTicketsBought + numberofTickets;

        totalamount = totalamount + ticketamount;

        System.out.println("successful booking message");
        System.out.println("------------------------------------------");
    }

    // Method to display passenger booking details
    void displayBookingDetails() {

        System.out.println("passengerName = " + passengerName);
        System.out.println("source : " + source + " to destination : " + destination);
        System.out.println("numberofTickets = " + numberofTickets);
        System.out.println("ticketamount : " + ticketamount);
        System.out.println("------------------------------------------");
    }

    // Static method to display overall booking details
    static void ticketCounter() {

        System.out.println("total tickets booked by all passengers : "
                + totalTicketsBought);

        System.out.println("total amount collected : "
                + totalamount);
    }

    // Main method
    public static void main(String[] args) {

        // First passenger
        VandeExpress a1 = new VandeExpress();

        a1.passengerName = "ram";
        a1.age = 24;
        a1.source = "hyderabad";
        a1.destination = "vizag";
        a1.numberofTickets = 5;

        a1.bookTicket();
        a1.displayBookingDetails();


        // Second passenger
        VandeExpress a2 = new VandeExpress();

        a2.passengerName = "rahul";
        a2.age = 25;
        a2.source = "hyderabad";
        a2.destination = "vizag";
        a2.numberofTickets = 3;

        a2.bookTicket();
        a2.displayBookingDetails();


        // Overall booking details
        VandeExpress.ticketCounter();
    }
}