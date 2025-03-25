import java.util.Scanner;

class MovieTicket {
     String movieName;
     int seatNumber;
     double price;
     boolean isBooked = false;

    public void bookTicket(String mName, int sNumber, double p) {
        if (!isBooked) {
            movieName = mName;
            seatNumber = sNumber;
            price = p;
            isBooked = true;
            System.out.println("Ticket booked successfully for " + movieName);
        } else {
            System.out.println("Seat already booked!");
        }
    }

    public void displayTicketDetails() {
        if (isBooked) {
            System.out.println("The title of the Movie is: " + movieName);
            System.out.println("and your Seat Number is " + seatNumber);
            System.out.println(" The total cost of your ticket is : Rs." + price);
        } else {
            System.out.println("No ticket booked yet.");
        }
    }
}

public class MovieBooking {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        MovieTicket ticket = new MovieTicket();
        
        System.out.print("Enter movie name: ");
        String mName = scan.nextLine();
        System.out.print("Enter seat number to book: ");
        int sNumber = scan.nextInt();
        System.out.print("Enter ticket price: ");
        double p = scan.nextDouble();
        
        ticket.bookTicket(mName, sNumber, p);
        
        System.out.println("\nTicket Details:");
        ticket.displayTicketDetails();
        
        scan.close();
    }
}
